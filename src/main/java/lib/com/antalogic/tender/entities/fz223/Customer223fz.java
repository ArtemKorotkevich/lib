package lib.com.antalogic.tender.entities.fz223;

import lib.com.antalogic.tender.entities.general.AbstractCustomer;
import lib.com.antalogic.tender.entities.general.Parseble;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

@Entity
@Indexed
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Customer223fz extends AbstractCustomer implements Parseble {
    @Id
    private String id;
    @Column(columnDefinition="TEXT")
    private String iko;
    @Column(columnDefinition="TEXT")
    private String status;
    @Column(columnDefinition="TEXT")
    private String shortName;
    @Column(columnDefinition="TEXT")
    private String address;
    @Column(columnDefinition="TEXT")
    private String timezone;
    @Column(columnDefinition="TEXT")
    private String site;


    @Override
    public String toString() {
        return "Customer223fz{" +
                "id='" + id + '\'' +
                ", iko='" + iko + '\'' +
                ", status='" + status + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", shortName='" + shortName + '\'' +
                ", orgn='" + getOgrn() + '\'' +
                ", inn='" + getInn() + '\'' +
                ", kpp='" + getKpp() + '\'' +
                ", address='" + address + '\'' +
                ", timezone='" + timezone + '\'' +
                ", okato='" + getOkato() + '\'' +
                '}';
    }
}
