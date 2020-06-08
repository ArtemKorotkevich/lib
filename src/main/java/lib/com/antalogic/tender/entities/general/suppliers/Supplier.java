package lib.com.antalogic.tender.entities.general.suppliers;

import lib.com.antalogic.tender.entities.general.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Supplier extends AbstractEntity {
    @Column(columnDefinition = "TEXT")
    private String name;
    @Column(columnDefinition = "TEXT")
    private String status;
    @Column(columnDefinition = "TEXT")
    private String fio;
    @Column(columnDefinition = "TEXT")
    private String type;
    @Column(columnDefinition = "TEXT")
    private String dateFrom;
    @Column(columnDefinition = "TEXT")
    private String dateTo;
    private long inn;
    private long ogrn;
    @Column(columnDefinition = "TEXT")
    private String email;
    @Column(columnDefinition = "TEXT")
    private String info;
    @Column(columnDefinition = "TEXT")
    private String AuthorisedPersonInn;
    @Column(columnDefinition = "TEXT")
    private String position;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "additionalInfo_id", referencedColumnName = "id")
    private AdditionalInfo additionalInfo;
}
