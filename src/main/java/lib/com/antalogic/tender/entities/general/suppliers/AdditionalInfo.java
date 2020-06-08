package lib.com.antalogic.tender.entities.general.suppliers;

import lib.com.antalogic.tender.entities.other.ftp.product.Okvd2;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EqualsAndHashCode
@Data
public class AdditionalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String position;
    private String authorisedPersonInn;
    private String phoneNumber;
    private Long kpp;
    private String postalAddress;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "additionalInfo_okvd2",
            joinColumns = {@JoinColumn(name = "aditionalInfo_id")},
            inverseJoinColumns = {@JoinColumn(name = "okvd_id")}
    )
    private List<Okvd2> okvd = new ArrayList<>();
}
