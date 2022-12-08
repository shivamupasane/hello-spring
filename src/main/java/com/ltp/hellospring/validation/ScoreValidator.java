package com.ltp.hellospring.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScoreValidator implements ConstraintValidator<Score, String > {
    List<String> list = Arrays.asList(
            "A+","A","A-",
            "B+","B","B-",
            "C+","C","C-");
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = false;
        for(String grd: list){
            isValid = s.equals(grd);
            if(isValid) break;

        }
        return isValid;
    }
}
