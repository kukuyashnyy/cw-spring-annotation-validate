package org.itstep.controller.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidation.class)
public @interface Age {
    String message() default "{org.itstep.controller.validator.age}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
