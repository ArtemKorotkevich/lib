package lib.com.antalogic.tender.entities.fz44;

import lib.com.antalogic.tender.entities.general.AbstractPurchase;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

@Entity
@Data
@Indexed
@SuperBuilder
public class Position44fz extends AbstractPurchase {
    @Column(columnDefinition = "TEXT")
    private String positionUniqueNumber;
    @Column(columnDefinition = "TEXT")
    private String ikz;
    @Column(columnDefinition = "TEXT")
    private String purchaseObjectName;
    @Column(columnDefinition = "TEXT")
    private String supplierDeterminationMethod;
    @Column(columnDefinition = "TEXT")
    private String planedStartPurchaseDate;
    @Column(columnDefinition = "TEXT")
    private String planedEndPurchaseDate;
    @Column(columnDefinition = "TEXT")
    private String startMaxContractPrice;
    @Column(columnDefinition = "TEXT")
    private String financeTotal;
    @Column(columnDefinition = "TEXT")
    private String financeCurrentYear;
    @Column(columnDefinition = "TEXT")
    private String financeFirstPlanedYear;
    @Column(columnDefinition = "TEXT")
    private String financeSecondPlanedYear;
    @Column(columnDefinition = "TEXT")
    private String financeSucceedingPlanedYear;
    @Column(columnDefinition = "TEXT")
    private String supplyDate;
    @Column(columnDefinition = "TEXT")
    private String supplyPeriod;
    @Column(columnDefinition = "TEXT")
    private String advantages;
    @Column(columnDefinition = "TEXT")
    private String purchaseNoCommerceOrgs;
    @Column(columnDefinition = "TEXT")
    private String nationalTreatment;
    @Column(columnDefinition = "TEXT")
    private String additionalRequirements;
    public Position44fz() {
        setLaw("44");
    }

}
