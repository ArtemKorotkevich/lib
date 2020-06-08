package lib.com.antalogic.tender.entities.other;

import lombok.Data;
import org.hibernate.search.annotations.Field;

import javax.persistence.*;

@Entity
@Data

public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Field
    @Column(columnDefinition = "TEXT")
    private String name;

    public Status() {
    }

    public Status(String name) {
        this.name = name;
    }
}
