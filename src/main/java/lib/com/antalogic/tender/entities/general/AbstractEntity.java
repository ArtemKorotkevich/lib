package lib.com.antalogic.tender.entities.general;

import lib.com.antalogic.tender.entities.other.ftp.region.Oktmo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Indexed
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class AbstractEntity {
    @Id
    private String id;
    @ManyToOne(cascade = CascadeType.ALL)
    @IndexedEmbedded
    private Oktmo region;
    @Column(columnDefinition="TEXT")
    private String link;
}
