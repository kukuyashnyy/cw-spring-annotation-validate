package org.itstep.controller.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class PasswordValidation implements ConstraintValidator<Password, String> {

    public static final String PASSWORD_PATTERN = "(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}";

    @Override
    public void initialize(Password password) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("Validation: " + s);
        return Pattern.matches(PASSWORD_PATTERN, s);
    }
}
