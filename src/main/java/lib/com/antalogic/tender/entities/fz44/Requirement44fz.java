package lib.com.antalogic.tender.entities.fz44;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Requirement44fz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition="TEXT")
    private String name;
    @Column(columnDefinition="TEXT")
    private String legalAct;
    @Column(columnDefinition="TEXT")
    private String admissionLimitations;
    @Column(columnDefinition="TEXT")
    private String notes;

}
