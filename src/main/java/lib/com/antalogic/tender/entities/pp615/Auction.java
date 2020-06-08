package lib.com.antalogic.tender.entities.pp615;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
public class Auction extends Event {
    private LocalDateTime requestEndDate;
    private LocalDate requestExpirationDate;
    private LocalDate auctionExecutionDate;
    private LocalTime auctionExecutionTime;
    @Column(columnDefinition="TEXT")
    private String startMaxContractPrice;
    @Column(columnDefinition="TEXT")
    private String requestFinance;
    @Column(columnDefinition="TEXT")
    private String contractFinance;
    @Column(columnDefinition = "TEXT")
    private String auctionStep;
    @Column(columnDefinition = "TEXT")
    private String executionLocation;
    @Column(columnDefinition = "TEXT")
    private String executionDate;
    @Column(columnDefinition = "TEXT")
    private String executionClause;


    @Override
    public String toString() {
        return super.toString() + "Auction{" +
                "requestEndDate=" + requestEndDate +
                ", requestExpirationDate=" + requestExpirationDate +
                ", auctionExecutionDate=" + auctionExecutionDate +
                ", auctionExecutionTime=" + auctionExecutionTime +
                ", startMaxContractPrice='" + startMaxContractPrice + '\'' +
                ", requestFinance='" + requestFinance + '\'' +
                ", contractFinance='" + contractFinance + '\'' +
                ", auctionStep='" + auctionStep + '\'' +
                ", executionLocation='" + executionLocation + '\'' +
                ", executionDate='" + executionDate + '\'' +
                ", executionClause='" + executionClause + '\'' +
                '}';
    }
}
