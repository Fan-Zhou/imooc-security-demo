package cn.zhou.validator;

import cn.zhou.annotation.MyAnnotation;

import javax.sound.midi.Soundbank;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyValidator implements ConstraintValidator<MyAnnotation, Object> {
    @Override
    public void initialize(MyAnnotation myAnnotation) {
        System.out.println("myValidator initiazlize in running ");
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("isValid is running");
        String s = String.valueOf(o);
        if(s.equals("1")){
            return true;
        }
        return false;
    }
}
