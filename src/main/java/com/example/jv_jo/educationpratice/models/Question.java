package com.example.jv_jo.educationpratice.models;

import com.example.jv_jo.educationpratice.enums.Discipline;

import java.util.List;

/**
 * Created by jv_jo on 13/04/2016.
 */
public class Question {

    private String question;
    private List<String> alternatives;
    private String answer;
    private Discipline discipline;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(List<String> alternatives) {
        this.alternatives = alternatives;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}
