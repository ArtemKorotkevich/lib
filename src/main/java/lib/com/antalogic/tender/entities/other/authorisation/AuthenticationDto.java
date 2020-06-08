package lib.com.antalogic.tender.entities.other.authorisation;

import lombok.Data;

import javax.persistence.Column;

@Data
public class AuthenticationDto {
    @Column(columnDefinition="TEXT")
    private String username;
    @Column(columnDefinition="TEXT")
    private String password;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AuthenticationDto{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
