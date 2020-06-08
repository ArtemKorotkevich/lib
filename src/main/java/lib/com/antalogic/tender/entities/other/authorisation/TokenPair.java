package lib.com.antalogic.tender.entities.other.authorisation;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TokenPair {
    @Id
    private UUID id;
    private String accessToken;
    private String refreshToken;
    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id", foreignKey = @ForeignKey(name = "FK_TOKEN_PAIR_USER"))
    private User user;
}
