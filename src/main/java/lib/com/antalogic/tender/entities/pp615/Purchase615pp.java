package lib.com.antalogic.tender.entities.pp615;

import lib.com.antalogic.tender.entities.general.AbstractPurchase;
import lib.com.antalogic.tender.entities.general.Parseble;
import lombok.Data;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

@Entity
@Indexed
@Data
public class Purchase615pp extends AbstractPurchase implements Parseble {
    @Column(columnDefinition="TEXT")
    private String supplierDetermination;
    @Column(columnDefinition="TEXT")
    private String marketPlace;
    @Column(columnDefinition="TEXT")
    private String marketPlaceAddress;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "event_id")
    private Event event;
    {
        this.setLaw("615");
    }
    @Override
    public String toString() {
        return "Purchase615pp{" +
                super.toString() +
                ", supplierDetermination='" + supplierDetermination + '\'' +
                ", marketPlace='" + marketPlace + '\'' +
                ", marketPlaceAddress='" + marketPlaceAddress + '\'' +
                ", customer=" + getCustomer() +
                ", event=" + event +
                '}';
    }
}
