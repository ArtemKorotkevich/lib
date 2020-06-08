package lib.com.antalogic.tender.entities.other.authorisation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public class JwtUser implements UserDetails {
    private final UUID id;
    private String username;
    private String region;
    private String city;
    private String phone;
    private String contactPerson;
    private String position;
    private String password;
    private final boolean enabled;
    private final Date lastPasswordResetDate;
    private final Collection<? extends GrantedAuthority> authorities;

    public JwtUser(UUID id, String username, String region, String city, String phone, String contactPerson, String position, String password, boolean enabled, Date lastPasswordResetDate, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.region = region;
        this.city = city;
        this.phone = phone;
        this.contactPerson = contactPerson;
        this.position = position;
        this.password = password;
        this.enabled = enabled;
        this.lastPasswordResetDate = lastPasswordResetDate;
        this.authorities = authorities;
    }

    @JsonIgnore
    public UUID getId() {
        return id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getPosition() {
        return position;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @JsonIgnore
    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }
}
