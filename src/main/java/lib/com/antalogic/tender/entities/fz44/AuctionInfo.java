package lib.com.antalogic.tender.entities.fz44;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class AuctionInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean productChangesPossible;
    private boolean singleSideClosingPossible;
    private boolean necessaryForLifeSupport;
    private LocalDateTime provisionStartDate;
    private LocalDateTime provisionEndDate;
    @Column(columnDefinition="TEXT")
    private String provisionOrder;
}
