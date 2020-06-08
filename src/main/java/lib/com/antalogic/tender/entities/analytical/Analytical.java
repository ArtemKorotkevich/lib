package lib.com.antalogic.tender.entities.analytical;

import com.fasterxml.jackson.annotation.JsonFormat;
import lib.com.antalogic.tender.entities.other.authorisation.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Analytical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int involvement = 0;
    private int winning = 0;
    private int skip = 0;
    private int competitors = 0;
    @OneToMany(mappedBy = "analytical")
    private List<User> user;
    @LastModifiedDate
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd hh:mm:ss")
    private LocalDateTime UpdateDateTimeInvolvement;

}
