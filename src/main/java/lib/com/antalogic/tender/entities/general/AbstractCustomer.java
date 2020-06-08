package lib.com.antalogic.tender.entities.general;

import lib.com.antalogic.tender.entities.other.contact.ContactInfo;
import lib.com.antalogic.tender.entities.other.ftp.product.Okvd2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Field;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@EqualsAndHashCode
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractCustomer extends AbstractEntity {
    @Field
    private String inn;
    @Column(columnDefinition="TEXT")
    private String ogrn;
    @Column(columnDefinition="TEXT")
    private String kpp;
    @Column(columnDefinition="TEXT")
    private String oktmo;
    @Column(columnDefinition="TEXT")
    private String okato;
    @ManyToOne
    private Okvd2 okvd2;
    @Column(columnDefinition="TEXT")
    @Field(analyzer = @Analyzer(definition = "textanalyzer"))
    private String fullName;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "customer_id")
    private ContactInfo contact;
}
