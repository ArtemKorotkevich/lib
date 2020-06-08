package lib.com.antalogic.tender.entities.fz44;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TerminationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition="TEXT")
    private String paid;
    @Column(columnDefinition="TEXT")
    private String reason;
    @Column(columnDefinition="TEXT")
    private String documentReason;
    @Column(columnDefinition="TEXT")
    private String date;
    @Column(columnDefinition="TEXT")
    private String cause;

}
