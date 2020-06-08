package lib.com.antalogic.tender.entities.fz223;

import lib.com.antalogic.tender.entities.general.Product;
import lib.com.antalogic.tender.entities.other.ftp.product.Okvd2;
import lombok.Data;
import org.hibernate.search.annotations.IndexedEmbedded;

import javax.persistence.*;

@Entity
@Data
public class Product223fz extends Product {
    @ManyToOne
    @IndexedEmbedded
    private Okvd2 okvd2;
    @Column(columnDefinition="TEXT")
    private String number;
    @Column(columnDefinition="TEXT")
    private String unit;
    @Column(columnDefinition="TEXT")
    private String additionInfo;
}
