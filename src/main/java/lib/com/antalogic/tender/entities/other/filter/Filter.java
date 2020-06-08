package lib.com.antalogic.tender.entities.other.filter;

import lib.com.antalogic.tender.entities.other.authorisation.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String filterName;
    @Column(columnDefinition = "TEXT")
    private String propertiesField;
    @JoinColumn(name = "fk_user")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

}
