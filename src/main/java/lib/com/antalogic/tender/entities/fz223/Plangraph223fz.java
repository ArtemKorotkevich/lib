package lib.com.antalogic.tender.entities.fz223;

import lib.com.antalogic.tender.entities.general.AbstractEntity;
import lib.com.antalogic.tender.entities.general.Parseble;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Plangraph223fz extends AbstractEntity implements Parseble {
    @Column(columnDefinition="TEXT")
    private String updateDate;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer223fz customer;
    @Column(columnDefinition="TEXT")
    private String dataFormat;
    @Column(columnDefinition="TEXT")
    private String type;
    @Column(columnDefinition="TEXT")
    private String planingPeriod;
    @Column(columnDefinition="TEXT")
    private String publishStatus;
    @Column(columnDefinition="TEXT")
    private String acceptationDate;
    @Column(columnDefinition="TEXT")
    private String changesReason;
    @Column(columnDefinition="TEXT")
    private String additionalInfo;

}
