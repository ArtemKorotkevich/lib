package lib.com.antalogic.tender.entities.fz44;

import lib.com.antalogic.tender.entities.general.AbstractCustomer;
import lib.com.antalogic.tender.entities.general.Parseble;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

@Entity
@Data
@Indexed
@SuperBuilder
@AllArgsConstructor
public class Customer44fz extends AbstractCustomer implements Parseble {
    @Id
    private String id;
    @Column(columnDefinition="TEXT")
    private String shortName;
    @Column(columnDefinition="TEXT")
    private String powers;
    @Column(columnDefinition="TEXT")
    private String type;
    @Column(columnDefinition="TEXT")
    private String address;

    public Customer44fz() {
    }
}
