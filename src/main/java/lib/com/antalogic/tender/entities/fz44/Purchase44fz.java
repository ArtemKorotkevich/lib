package lib.com.antalogic.tender.entities.fz44;

import lib.com.antalogic.tender.entities.general.AbstractPurchase;
import lib.com.antalogic.tender.entities.general.Parseble;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Indexed
@ToString(callSuper = true, includeFieldNames = true)
@AllArgsConstructor
@SuperBuilder
public class Purchase44fz extends AbstractPurchase implements Parseble {
    @Column(columnDefinition = "TEXT")
    private String marketPlace;
    @Column(columnDefinition = "TEXT")
    private String marketPlaceAddress;
    @Column(columnDefinition = "TEXT")
    private String publisher;
    @Column(columnDefinition = "TEXT")
    private String purchasePlangraphPosition;
    @Column(columnDefinition = "TEXT")
    private String standartContractNumber;
    @Column(columnDefinition = "TEXT")
    private String startMaxContractPrice;
    @Field
    @Column(columnDefinition = "TEXT")
    private String ikz;
    @Column(columnDefinition = "TEXT")
    private String financeSource;
    @Column(columnDefinition = "TEXT")
    private String supplierDeterminationLimitation;
    private LocalDateTime requestStartDateTime;
    private LocalDateTime requestEndDateTime;
    @Column(columnDefinition = "TEXT")
    private String requestPlace;
    @Column(columnDefinition = "TEXT")
    private String requestOrder;
    @Column(columnDefinition = "TEXT")
    private String requestConsiderationExpirationDate;
    @Column(columnDefinition = "TEXT")
    private String auctionDate;
    @Column(columnDefinition = "TEXT")
    private String auctionTime;
    @Column(columnDefinition = "TEXT")
    private String additionalInfo;
    @Column(columnDefinition = "TEXT")
    private String purchaseObjectLimitations;
    @Column(columnDefinition = "TEXT")
    private String participantAdvantages;
    @Column(columnDefinition = "TEXT")
    private String participantRequirements;
    @Column(columnDefinition = "TEXT")
    private String participantLimitations;
    @Column(columnDefinition = "TEXT")
    private String requestFinancesSize;
    @Column(columnDefinition = "TEXT")
    private String requestFinancesOrder;
    @Column(columnDefinition = "TEXT")
    private String requestFinancesPayment;
    @Column(columnDefinition = "TEXT")
    private String contractFinancesSize;
    @Column(columnDefinition = "TEXT")
    private String contractFinancesOrder;
    @Column(columnDefinition = "TEXT")
    private String contractFinancesPayment;
    @Column(columnDefinition = "TEXT")
    private String contractAdditionalInfo;
    @Column(columnDefinition = "TEXT")
    private String contractDeliveryPlace;
    @Column(columnDefinition = "TEXT")
    private String contractDeliveryDate;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "auction_info_id")
    private AuctionInfo auctionInfo;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "purchase_id")
    private List<Requirement44fz> requirements = new ArrayList<>();

    public Purchase44fz() {
        setLaw("44");
    }

}
