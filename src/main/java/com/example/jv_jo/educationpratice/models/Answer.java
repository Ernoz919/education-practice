package com.example.jv_jo.educationpratice.models;

/**
 * Created by jv_jo on 29/04/2016.
 */
public class Answer extends PersistableEntity{

    private String answer;
    private boolean correct;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

}
