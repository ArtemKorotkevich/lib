package lib.com.antalogic.tender.entities.pp615;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Selection extends Event {
    private LocalDateTime requestStartDate;
    private LocalDateTime requestEndDate;
    private LocalDate requestExpirationDate;
    @Column(length = 4096)
    private String selectionResultPeriod;



    @Override
    public String toString() {
        return super.toString() + "Selection{" +
                "requestStartDate=" + requestStartDate +
                ", requestEndDate=" + requestEndDate +
                ", requestExpirationDate=" + requestExpirationDate +
                ", selectionResultPeriod='" + selectionResultPeriod + '\'' +
                '}';
    }
}
