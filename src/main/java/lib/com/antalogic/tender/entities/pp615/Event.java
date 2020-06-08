package lib.com.antalogic.tender.entities.pp615;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    public Event() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                '}';
    }
}
