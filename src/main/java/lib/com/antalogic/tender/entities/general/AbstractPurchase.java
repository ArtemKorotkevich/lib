package lib.com.antalogic.tender.entities.general;

import lib.com.antalogic.tender.entities.other.Attachment;
import lib.com.antalogic.tender.entities.other.Status;
import lib.com.antalogic.tender.entities.other.authorisation.User;
import lib.com.antalogic.tender.entities.other.contact.ContactInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.apache.lucene.analysis.core.LowerCaseFilterFactory;
import org.apache.lucene.analysis.snowball.SnowballPorterFilterFactory;
import org.apache.lucene.analysis.standard.StandardTokenizerFactory;
import org.hibernate.search.annotations.*;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Parameter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Indexed
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@AnalyzerDef(name = "textanalyzer",
        tokenizer = @TokenizerDef(factory = StandardTokenizerFactory.class),
        filters = {
                @TokenFilterDef(factory = LowerCaseFilterFactory.class),
                @TokenFilterDef(factory = SnowballPorterFilterFactory.class,
                        params = {@Parameter(name = "language", value = "Russian")})
        })
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ToString(callSuper = true)
@Data
public abstract class AbstractPurchase extends AbstractEntity implements Parseble {
    @Id
    private String id;
    @Field
    private LocalDate publishDate;
    @Field
    private LocalDate updateDate;
    @Field
    private LocalDate endDate;
    @Column(columnDefinition = "TEXT")
    private String type;
    @Column(columnDefinition = "TEXT")
    private String stage;
    @Field
    @NumericField
    private Long cost;
    @ManyToOne(cascade = CascadeType.ALL)
    @IndexedEmbedded(depth = 1)
    private AbstractCustomer customer;
    @Column(columnDefinition = "TEXT")
    protected String currency;
    @Column(columnDefinition = "TEXT")
    @Field(analyzer = @Analyzer(definition = "textanalyzer"))
    private String purchaseObjectName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchase_id")
    private List<Attachment> attachments = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL)
    private ContactInfo contact;
    @Field
    private String law;
    @ManyToOne(cascade = CascadeType.ALL)
    @IndexedEmbedded(depth = 1)
    private Status status;
    @Field
    @NumericField
    private Long contractFin;
    @Field
    @NumericField
    private int contractFinPercent;
    @Field
    @NumericField
    private Long requestFin;
    @Field
    @NumericField
    private int requestFinPercent;
    @IndexedEmbedded
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchase_id")
    private List<Product> products = new ArrayList<>();
    @JsonIgnore
    @ManyToMany()
    @JoinTable(name = "favorites_purchase",
            joinColumns = @JoinColumn(name = "purchase_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    @IndexedEmbedded(includeEmbeddedObjectId = true)
    private List<User> users;
    @Transient
    private boolean favorite;

    public void setProducts(List<Product> products) {
        this.products.clear();
        if (products != null) {
            this.products.addAll(products);
        }
    }
}
