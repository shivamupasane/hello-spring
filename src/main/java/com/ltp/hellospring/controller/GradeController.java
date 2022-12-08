package com.ltp.hellospring.controller;

import com.ltp.hellospring.model.Grade;
import com.ltp.hellospring.service.GradeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GradeController {
    @Autowired
    GradeService gradeService;
    @GetMapping("/grades")
    public String getGrades(Model model){
        model.addAttribute("grades", gradeService.getGrades());
        return "grades";
    }
    @GetMapping("/gradeForm")
    public String getGradeForm(Model model, @RequestParam(required = false) String id){
        model.addAttribute("grade", gradeService.getGrade(id));
        return "form";
    }
    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Grade grade, BindingResult result){
        if(result.hasErrors()) return "form";
        gradeService.submitForm(grade);
        return "redirect:/grades";

    }

}
