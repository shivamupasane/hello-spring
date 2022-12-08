package com.ltp.hellospring.repository;

import com.ltp.hellospring.model.Grade;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class GradeRepository {
    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    private List<Grade> grades = new ArrayList<>();
    public void addGrade(Grade grade){
        grades.add(grade);
    }
    public void updateGrade(int index, Grade grade){
        grades.set(index, grade);
    }
    public Grade getGrade(int index){
        return grades.get(index);
    }
}
