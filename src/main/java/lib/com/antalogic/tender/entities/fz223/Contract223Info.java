package lib.com.antalogic.tender.entities.fz223;

import lib.com.antalogic.tender.entities.general.Parseble;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Contract223Info implements Parseble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition="TEXT")
    private String cost;
    @Column(columnDefinition="TEXT")
    private String currency;
    @Column(columnDefinition="TEXT")
    private String startExecutionDate;
    @Column(columnDefinition="TEXT")
    private String startExecutionClause;
    @Column(columnDefinition="TEXT")
    private String endExecutionDate;
    @Column(columnDefinition="TEXT")
    private String endExecutionClause;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "info_id")
    private List<Contract223fzProduct> products = new ArrayList<>();

}
