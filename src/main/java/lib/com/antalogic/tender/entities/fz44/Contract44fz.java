package lib.com.antalogic.tender.entities.fz44;

import lib.com.antalogic.tender.entities.general.AbstractEntity;
import lib.com.antalogic.tender.entities.general.Parseble;
import lib.com.antalogic.tender.entities.general.suppliers.Supplier;
import lib.com.antalogic.tender.entities.other.Attachment;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@SuperBuilder
@NoArgsConstructor
public class Contract44fz extends AbstractEntity implements Parseble {
    @Id
    private String id;
    @Column(columnDefinition = "TEXT")
    private String status;
    @Column(columnDefinition="TEXT")
    private String notice;
    @Column(columnDefinition="TEXT")
    private String IKZ;
    @Column(columnDefinition="TEXT")
    private String contractIdentity;
    @Column(columnDefinition="TEXT")
    private String uniquePlanGraphNum;
    @Column(columnDefinition="TEXT")
    private String supplierDeterminationMethod;
    @Column(columnDefinition="TEXT")
    private String supplierChoseDate;
    @Column(columnDefinition="TEXT")
    private String publishDate;
    @Column(columnDefinition = "TEXT")
    private String contractReason;
    @Column(columnDefinition = "TEXT")
    private String proofContract;
    @Column(columnDefinition = "TEXT")
    private String followingInfo;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer44fz customer;
    @Column(columnDefinition="TEXT")
    private String contractAcceptDate;
    @Column(columnDefinition="TEXT")
    private String contractNum;
    @Column(columnDefinition="TEXT")
    private String contractPriceType;
    @Column(columnDefinition="TEXT")
    private String contractPrice;
    @Column(columnDefinition="TEXT")
    private String contractCurrency;
    @Column(columnDefinition="TEXT")
    private String startExecutionDate;
    @Column(columnDefinition="TEXT")
    private String endExecutionDate;
    @Column(columnDefinition = "TEXT")
    private String bankGuarantyNumber;
    @Column(columnDefinition="TEXT")
    private String contractExecutionSize;
    @Column(columnDefinition="TEXT")
    private String NDS;
    @Column(columnDefinition = "TEXT")
    private String guarantyPeriod;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Supplier> suppliers = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contract44_id")
    private List<PaymentObjectInfo> paymentList = new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "termination_id")
    private TerminationInfo terminationInfo;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contract44_id")
    private List<Attachment> attachments = new ArrayList<>();
    @Column(columnDefinition = "TEXT")
    private String actualPaid;
    @Column(columnDefinition = "TEXT")
    private String obligationsCost;
    @Column(columnDefinition = "TEXT")
    private String budgetClassificationCode;
    @Column(columnDefinition = "TEXT")
    private String contractItem;
    @Column(columnDefinition = "TEXT")
    private String subContractsVolume;
    @Column(columnDefinition = "TEXT")
    private String requisitesConfirmingContract;

}
