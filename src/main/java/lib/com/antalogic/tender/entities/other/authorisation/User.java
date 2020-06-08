package lib.com.antalogic.tender.entities.other.authorisation;


import lib.com.antalogic.tender.entities.analytical.Analytical;
import lib.com.antalogic.tender.entities.general.AbstractPurchase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/*import org.springframework.security.core.GrantedAuthority;*/

@Entity
@Table(name = "\"user\"")
@Data
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String inn;
    private String region;
    private String city;
    private String phone;
    private String contactPerson;
    private String position;
    private String email;
    @ManyToOne
    private User parentUser;
    @JsonIgnore
    @Column(columnDefinition = "TEXT")
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;
    @JsonIgnore
    @ManyToMany(mappedBy = "users")
    private List<AbstractPurchase> favorites;
    private boolean enabled;
    @JsonIgnore
    @ManyToOne
    private Analytical analytical;

    public User() {
        super();
        this.enabled = false;
    }

    public User(UserDto userDto) {
        this.inn = userDto.getInn();
        this.region = userDto.getRegion();
        this.city = userDto.getCity();
        this.phone = userDto.getPhone();
        this.contactPerson = userDto.getContactPerson();
        this.position = userDto.getPosition();
        this.password = userDto.getPassword();
        this.email = userDto.getEmail();
    }
}
