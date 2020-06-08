package lib.com.antalogic.tender.entities.criterias;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PurchaseCriteria {
    private int page;
    private int size;
    private String query = "";
    private String dateFrom;
    private String dateTo;
    private Long minCost = 0L;
    private Long maxCost = 0L;
    private String region = "_";
    private String okpd2;
    private Boolean fz44 = false;
    private Boolean fz223 = false;
    private Boolean pp615 = false;
    private Boolean active = false;
    private Boolean canceled = false;
    private Boolean finished = false;
    private Boolean planned = false;
    private Boolean favorite = false;
    private String userId;
}
