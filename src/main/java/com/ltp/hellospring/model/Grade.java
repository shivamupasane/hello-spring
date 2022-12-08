package com.ltp.hellospring.model;



import com.ltp.hellospring.validation.Score;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public class Grade {
    @NotBlank(message = "Name can not be blank")
    private String name;
    @NotBlank(message = "score can not be blank")
    @Score(message = "score can be only alphabet")
    private String score;
    @NotBlank(message = "subject can not be blank")
    private String subject;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    public Grade() {
        this.id = UUID.randomUUID().toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
