package lib.com.antalogic.tender.entities.fz44;

import lib.com.antalogic.tender.entities.general.AbstractEntity;
import lib.com.antalogic.tender.entities.general.Parseble;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class Plangraph44fz extends AbstractEntity implements Parseble {
    @Column(columnDefinition = "TEXT")
    private String uniquePlangraphNumber;
    @Column(columnDefinition = "TEXT")
    private String plangraphYear;
    @Column(columnDefinition = "TEXT")
    private String plangraphAcceptationDate;
    @Column(columnDefinition = "TEXT")
    private String plangraphChangesDate;
    @Column(columnDefinition = "TEXT")
    private String plangraphPurchasesAcceptationDate;
    @Column(columnDefinition = "TEXT")
    private String plangraphPublishDate;
    @Column(columnDefinition = "TEXT")
    private String plangraphStatus;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer44fz customer;
    @Column(columnDefinition = "TEXT")
    private String executorSurname;
    @Column(columnDefinition = "TEXT")
    private String executorName;
    @Column(columnDefinition = "TEXT")
    private String executorMiddlename;
    @Column(columnDefinition = "TEXT")
    private String executorPosition;
    @Column(columnDefinition = "TEXT")
    private String chiefSurname;
    @Column(columnDefinition = "TEXT")
    private String chiefName;
    @Column(columnDefinition = "TEXT")
    private String chiefMiddlename;
    @Column(columnDefinition = "TEXT")
    private String chiefPosition;
    @Column(columnDefinition = "TEXT")
    private String updateDate;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "position_id")
    private List<Position44fz> positions = new ArrayList<>();


    }
