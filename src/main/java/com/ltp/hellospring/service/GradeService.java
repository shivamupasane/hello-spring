package com.ltp.hellospring.service;

import com.ltp.hellospring.model.Grade;
import com.ltp.hellospring.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GradeService {
    @Autowired
    GradeRepository gradeRepository;
    public void submitForm(Grade grade){
        if(getGradeIndex(grade.getId()) == -1000){
            gradeRepository.addGrade(grade);
        } else {
            gradeRepository.updateGrade(getGradeIndex(grade.getId()), grade);
        }
    }
    public int getGradeIndex(String id){
        int defaultGradeIndex = -1000;
        for(int i =0; i< gradeRepository.getGrades().size(); i++){
            if(gradeRepository.getGrades().get(i).getId().equals(id)){
                defaultGradeIndex =  i;
            }
        }
        return defaultGradeIndex;
    }
    public List<Grade> getGrades(){
        return gradeRepository.getGrades();
    }
    public Grade getGrade(String id){
        return getGradeIndex(id) == -1000 ? new Grade(): gradeRepository.getGrade(getGradeIndex(id));
    }
}
