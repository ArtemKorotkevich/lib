package lib.com.antalogic.tender.entities.fz223;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Contract223fzProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition="TEXT")
    private String name;
    @Column(columnDefinition="TEXT")
    private String okpd2;
    @Column(columnDefinition="TEXT")
    private String number;
    @Column(columnDefinition="TEXT")
    private String unit;
    @Column(columnDefinition="TEXT")
    private String country;

}
