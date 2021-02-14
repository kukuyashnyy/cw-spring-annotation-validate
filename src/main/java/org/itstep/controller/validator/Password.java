package org.itstep.controller.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidation.class)
public @interface Password {
    String message() default "{org.itstep.controller.validator.password}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
