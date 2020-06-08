package lib.com.antalogic.tender.entities.other;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FailedFetchRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String link;
    @Column(columnDefinition = "TEXT")
    private String stackTrace;
    @Column(columnDefinition = "TEXT")
    private String message;
    @Column(columnDefinition = "TEXT")
    private String document;
    @Column(columnDefinition = "TEXT")
    private String parentDoc;
    @Column(columnDefinition = "TEXT")
    private String exceptionClass;
    @Column(columnDefinition = "TEXT")
    private String parserClass;


}
