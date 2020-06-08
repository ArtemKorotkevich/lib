package lib.com.antalogic.tender.entities.fz44;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PaymentObjectInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "TEXT")
    private String name;
    @Column(columnDefinition = "TEXT")
    private String positionCode;
    @Column(columnDefinition = "TEXT")
    private String unit;
    @Column(columnDefinition = "TEXT")
    private String unitCost;
    @Column(columnDefinition = "TEXT")
    private String unitCostExcNds;
    @Column(columnDefinition = "TEXT")
    private String number;
    @Column(columnDefinition = "TEXT")
    private String sum;
    @Column(columnDefinition = "TEXT")
    private String sumExcNds;
    @Column(columnDefinition = "TEXT")
    private String ndsRate;
    @Column(columnDefinition = "TEXT")
    private String ndsSize;
}

