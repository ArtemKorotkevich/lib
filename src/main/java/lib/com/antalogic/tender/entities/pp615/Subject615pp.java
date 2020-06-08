package lib.com.antalogic.tender.entities.pp615;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Subject615pp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "TEXT")
    private String location;
    @Column(columnDefinition = "TEXT")
    private String type;
    @Column(columnDefinition="TEXT")
    private String price;


    @Override
    public String toString() {
        return "Subject615pp{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
