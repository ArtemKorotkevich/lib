package lib.com.antalogic.tender.entities.other.contact;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ContactInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(columnDefinition="TEXT")
    private String FIO;
    @Column(columnDefinition="TEXT")
    private String email;
    @Column(columnDefinition="TEXT")
    private String site;
    @Column(columnDefinition="TEXT")
    private String phone;
    @Column(columnDefinition="TEXT")
    private String fax;
    @Column(columnDefinition="TEXT")
    private String postAddress;
    @Column(columnDefinition="TEXT")
    private String timeZone;


    @Override
    public String toString() {
        return "ContactInfo{" +
                ", FIO='" + FIO + '\'' +
                ", email='" + email + '\'' +
                ", site='" + site + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", postAddress='" + postAddress + '\'' +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }
}
