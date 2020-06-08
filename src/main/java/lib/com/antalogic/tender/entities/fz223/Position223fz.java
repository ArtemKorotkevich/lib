package lib.com.antalogic.tender.entities.fz223;

import lib.com.antalogic.tender.entities.general.AbstractPurchase;
import lombok.Data;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

@Entity
@Data
@Indexed
public class Position223fz extends AbstractPurchase {
    @Column(columnDefinition="TEXT")
    private String positionNumber;
    @Column(columnDefinition="TEXT")
    private String positionStatus;
    @Column(columnDefinition="TEXT")
    private String positionCancellationReason;
    @Column(columnDefinition="TEXT")
    private String positionCustomer;
    @Column(columnDefinition="TEXT")
    private String contractSubjectRequirement;
    @Column(columnDefinition="TEXT")
    private String contractStartPrice;
    @Column(columnDefinition="TEXT")
    private String contractCurrency;
    @Column(columnDefinition="TEXT")
    private String contractPriceOrder;
    @Column(columnDefinition="TEXT")
    private String purchaseType;
    @Column(columnDefinition="TEXT")
    private String purchaseNoticePublishDate;
    @Column(columnDefinition="TEXT")
    private String purchaseExecutionDate;
    @Column(columnDefinition="TEXT")
    private String purchaseMethod;
    @Column(columnDefinition="TEXT")
    private String infoRegionDeterminationType;
    @Column(columnDefinition="TEXT")
    private String infoRegion;
    @ManyToOne(cascade = CascadeType.ALL)
    private Plangraph223fz planrgaph;

    public Position223fz() {
        setLaw("223");
    }


}
