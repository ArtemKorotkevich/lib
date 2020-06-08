package lib.com.antalogic.tender.entities.fz223;

import lib.com.antalogic.tender.entities.general.AbstractEntity;
import lib.com.antalogic.tender.entities.general.Parseble;
import lib.com.antalogic.tender.entities.general.suppliers.Supplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Contract223fz extends AbstractEntity implements Parseble {
    @Id
    private String id;
    @Column(columnDefinition = "TEXT")
    private String num;
    @Column(columnDefinition = "TEXT")
    private String dateConfirm;
    @Column(columnDefinition = "TEXT")
    private String notice;
    @Column(columnDefinition = "TEXT")
    private String lot;
    @Column(columnDefinition = "TEXT")
    private String purchaseType;
    @Column(columnDefinition = "TEXT")
    private String contractSubject;
    @Column(columnDefinition = "TEXT")
    private String dataVersion;
    @Column(columnDefinition = "TEXT")
    private String publishDate;
    @Column(columnDefinition = "TEXT")
    private String finishDate;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer223fz customer;
    @ManyToMany
    private List<Supplier> suppliers = new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL)
    private Contract223Info info;
}
