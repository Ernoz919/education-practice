package com.example.jv_jo.educationpratice.models;

import com.example.jv_jo.educationpratice.enums.Discipline;

import java.util.List;

/**
 * Created by jv_jo on 13/04/2016.
 */
public class Question extends PersistableEntity{

    private String question;
    private AnswerType answerType;
    private Double ponctuation;
    private QuestionType questionType;
    private List<Answer> answers;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public AnswerType getAnswerType() {
        return answerType;
    }

    public void setAnswerType(AnswerType answerType) {
        this.answerType = answerType;
    }

    public Double getPonctuation() {
        return ponctuation;
    }

    public void setPonctuation(Double ponctuation) {
        this.ponctuation = ponctuation;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
