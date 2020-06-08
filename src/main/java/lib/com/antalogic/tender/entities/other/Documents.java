package lib.com.antalogic.tender.entities.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition="TEXT")
    private String link;

    @Column(columnDefinition="TEXT")
    private String documentName;

    @Column(columnDefinition="TEXT")
    private String extension;

}
