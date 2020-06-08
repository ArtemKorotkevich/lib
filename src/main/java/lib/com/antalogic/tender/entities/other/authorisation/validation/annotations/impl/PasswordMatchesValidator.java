package lib.com.antalogic.tender.entities.other.authorisation.validation.annotations.impl;

import lib.com.antalogic.tender.entities.other.authorisation.UserDto;
import lib.com.antalogic.tender.entities.other.authorisation.validation.annotations.PasswordMatches;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        UserDto user = (UserDto) obj;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}
