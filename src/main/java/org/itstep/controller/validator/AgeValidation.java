package org.itstep.controller.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidation implements ConstraintValidator<Age, String> {
    @Override
    public void initialize(Age age) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return Integer.parseInt(s) > 16 && Integer.parseInt(s) < 100;
    }
}
