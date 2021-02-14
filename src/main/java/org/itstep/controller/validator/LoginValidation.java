package org.itstep.controller.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidation implements ConstraintValidator<Login, String> {
    @Override
    public void initialize(Login login) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
