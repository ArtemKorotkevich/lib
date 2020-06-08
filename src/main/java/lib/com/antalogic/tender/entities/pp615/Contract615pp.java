package lib.com.antalogic.tender.entities.pp615;

import lib.com.antalogic.tender.entities.fz44.Customer44fz;
import lib.com.antalogic.tender.entities.general.AbstractEntity;
import lib.com.antalogic.tender.entities.general.Parseble;
import lib.com.antalogic.tender.entities.other.Attachment;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Contract615pp extends AbstractEntity implements Parseble {
    @Id
    private String id;
    @Column(columnDefinition = "TEXT")
    private String contractStage;
    @Column(columnDefinition = "TEXT")
    private String changeContractReason;
    @Column(columnDefinition = "TEXT")
    private String changes;
    @Column(columnDefinition = "TEXT")
    private String noticeNumber;
    @Column(columnDefinition = "TEXT")
    private String auctionSubject;
    @Column(columnDefinition = "TEXT")
    private String worksType;
    @Column(columnDefinition = "TEXT")
    private String auctionDate;
    @Column(columnDefinition = "TEXT")
    private String document;
    @Column(columnDefinition = "TEXT")
    private String contractAcceptionDate;
    @Column(columnDefinition = "TEXT")
    private String documentNumber;
    @Column(columnDefinition = "TEXT")
    private String cost;
    @Column(columnDefinition = "TEXT")
    private String financeSource;
    @Column(columnDefinition = "TEXT")
    private String startContractExecutionDate;
    @Column(columnDefinition = "TEXT")
    private String endContractExecutionDate;
    @Column(columnDefinition = "TEXT")
    private String contractorName;
    @Column(columnDefinition = "TEXT")
    private String contractorInn;
    @Column(columnDefinition = "TEXT")
    private String contractorKpp;
    @Column(columnDefinition = "TEXT")
    private String contractorAddress;
    @Column(columnDefinition = "TEXT")
    private String contractorPhone;
    @Column(columnDefinition = "TEXT")
    private String contractorEmail;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer44fz customer;
    @Column(columnDefinition = "TEXT")
    private String subject;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contract615_id")
    private List<Attachment> attachment = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contract_id")
    private List<Subject615pp> subjects = new ArrayList<>();
}
