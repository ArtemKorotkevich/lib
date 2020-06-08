package lib.com.antalogic.tender.entities.fz44;

import lib.com.antalogic.tender.entities.general.Product;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product44fz extends Product {
    @Column(columnDefinition = "TEXT")
    private String name;
    @Column(columnDefinition = "TEXT")
    private String unit;
    @Column(columnDefinition = "TEXT")
    private String number;
    @Column(columnDefinition = "TEXT")
    private String costPerUnit;
    @Column(columnDefinition = "TEXT")
    private String cost;
}
