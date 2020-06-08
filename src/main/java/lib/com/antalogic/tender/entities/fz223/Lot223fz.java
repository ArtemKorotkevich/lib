package lib.com.antalogic.tender.entities.fz223;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Lot223fz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "lot_id")
    private List<Product223fz> products = new ArrayList<>();
    private boolean excludePurchaseFromPlan;
    private boolean forSmallOrMiddle;
    private boolean subcontractorsRequirement;
    private boolean applicationSupplyNeeded;
    private int lotNumber;
    @Column(columnDefinition="TEXT")
    private String lotName;
    @Column(columnDefinition="TEXT")
    private String lotPriceType;
    @Column(columnDefinition="TEXT")
    private String lotPrice;
    @Column(columnDefinition="TEXT")
    private String lotPlace;

    public void setProducts(List<Product223fz> products) {
        this.products.clear();
        if (products != null) {
            this.products.addAll(products);
        }
    }
}
