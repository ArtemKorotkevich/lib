package lib.com.antalogic.tender.entities.other.authorisation;


import lib.com.antalogic.tender.entities.other.authorisation.validation.annotations.PasswordMatches;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@PasswordMatches
@Data
public class UserDto {
    @NotNull
    @NotEmpty
    private String inn;
    @NotNull
    @NotEmpty
    private String region;
    @NotNull
    @NotEmpty
    private String city;
    @NotNull
    @NotEmpty
    private String phone;
    @NotNull
    @NotEmpty
    private String contactPerson;
    @NotNull
    @NotEmpty
    private String position;
    @NotNull
    @NotEmpty
    private String email;
    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;
    private UUID parentUserId;

}
