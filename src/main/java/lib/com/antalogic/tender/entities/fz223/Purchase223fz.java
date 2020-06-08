package lib.com.antalogic.tender.entities.fz223;

import lib.com.antalogic.tender.entities.general.AbstractPurchase;
import lib.com.antalogic.tender.entities.general.Parseble;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Indexed
@SuperBuilder
@AllArgsConstructor
public class Purchase223fz extends AbstractPurchase implements Parseble {
    @Column(columnDefinition = "TEXT")
    private String marketPlace;
    @Column(columnDefinition = "TEXT")
    private String marketPlaceAddress;
    private boolean emergency;
    private boolean antimonopolyDecisionTaken;
    private boolean notDishonest;
    private int redaction;
    private String redactionReason;
    @Column(columnDefinition = "TEXT")
    private String requestStartDate;
    @Column(columnDefinition = "TEXT")
    private String requestEndDate;
    @Column(columnDefinition = "TEXT")
    private String requestOrder;
    @Column(columnDefinition = "TEXT")
    private String firstPartsConsiderationPlace;
    @Column(columnDefinition = "TEXT")
    private String firstPartsExpirationDate;
    @Column(columnDefinition = "TEXT")
    private String firstPartsExpirationOrder;
    @Column(columnDefinition = "TEXT")
    private String additionalRequestStardDate;
    @Column(columnDefinition = "TEXT")
    private String additionalRequestStardTime;
    @Column(columnDefinition = "TEXT")
    private String additionalRequestEndDate;
    @Column(columnDefinition = "TEXT")
    private String additionalRequestOrder;
    @Column(columnDefinition = "TEXT")
    private String additionalRequestComporitionDate;
    @Column(columnDefinition = "TEXT")
    private String additionalRequestComporitionOrder;
    @Column(columnDefinition = "TEXT")
    private String secondPartsConsiderationPlace;
    private String secondPartsExpirationDate;
    @Column(columnDefinition = "TEXT")
    private String secondPartsExpirationOrder;
    @Column(columnDefinition = "TEXT")
    private String summingUpPlace;
    private String summingUpDate;
    @Column(columnDefinition = "TEXT")
    private String summingUpOrder;
    private String documentationDate;
    @Column(columnDefinition = "TEXT")
    private String documentationPlace;
    @Column(columnDefinition = "TEXT")
    private String documentationOrder;
    @Column(columnDefinition = "TEXT")
    private String documentationSite;
    @Column(columnDefinition = "TEXT")
    private String documentationCost;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "purchase223_id")
    private List<Lot223fz> lots = new ArrayList<>();

    public Purchase223fz() {
        setLaw("223");
    }
}
