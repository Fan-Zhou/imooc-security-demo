package cn.zhou.annotation;

import cn.zhou.validator.MyValidator;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.Payload;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.FIELD,ElementType.METHOD})
@Constraint(validatedBy = MyValidator.class)
public @interface MyAnnotation  {

    String message() default "{org.hibernate.validator.constraints.MyDefaultAnnotation.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
