package lib.com.antalogic.tender.entities.general;

import lib.com.antalogic.tender.entities.other.ftp.product.Okpd2;
import lombok.Data;
import org.hibernate.search.annotations.IndexedEmbedded;

import javax.persistence.*;

@Entity
@Data
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    @IndexedEmbedded
    private Okpd2 okpd;
    /*@ManyToOne
    @JoinColumn(name = "purchase_id")
    private AbstractPurchase purchase;*/
}
