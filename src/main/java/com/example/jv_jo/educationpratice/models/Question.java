package com.example.jv_jo.educationpratice.models;

import com.example.jv_jo.educationpratice.enums.Discipline;

import java.util.List;

/**
 * Created by jv_jo on 13/04/2016.
 */
public class Question {


    private static String[] firstQuestion = new String[5];
    private static String[] firstOptions;

    private static String[] aTwoAnswer;
    private static String[] bTwoAnswer;
    private static String[] cTwoAnswer;
    private static String[] dTwoAnswer;
    private static String[] eTwoAnswer;
    private static String[] fTwoAnswer;

    private static String[] thirdQuestion = new String[5];
    private static String[] thirdOptions;

    private static String[] fourQuestion = new String[5];
    private static String[] fourAnswer;

    private static String[] fiveQuestion = new String[5];
    private static String[] fiveAnswer;

////////////////////////////////////////////////////////////////////////////////////////////////////

    public static String[] getFirstQuestion() {
        return firstQuestion;
    }

    public static void setFirstQuestion(String[] firstQuestion) {
        Question.firstQuestion = firstQuestion;
    }

    public static String[] getFirstOptions() {
        return firstOptions;
    }

    public static void setFirstOptions(String[] firstOptions) {
        Question.firstOptions = firstOptions;
    }

    public static String[] getaTwoAnswer() {
        return aTwoAnswer;
    }

    public static void setaTwoAnswer(String[] aTwoAnswer) {
        Question.aTwoAnswer = aTwoAnswer;
    }

    public static String[] getbTwoAnswer() {
        return bTwoAnswer;
    }

    public static void setbTwoAnswer(String[] bTwoAnswer) {
        Question.bTwoAnswer = bTwoAnswer;
    }

    public static String[] getcTwoAnswer() {
        return cTwoAnswer;
    }

    public static void setcTwoAnswer(String[] cTwoAnswer) {
        Question.cTwoAnswer = cTwoAnswer;
    }

    public static String[] getdTwoAnswer() {
        return dTwoAnswer;
    }

    public static void setdTwoAnswer(String[] dTwoAnswer) {
        Question.dTwoAnswer = dTwoAnswer;
    }

    public static String[] geteTwoAnswer() {
        return eTwoAnswer;
    }

    public static void seteTwoAnswer(String[] eTwoAnswer) {
        Question.eTwoAnswer = eTwoAnswer;
    }

    public static String[] getfTwoAnswer() {
        return fTwoAnswer;
    }

    public static void setfTwoAnswer(String[] fTwoAnswer) {
        Question.fTwoAnswer = fTwoAnswer;
    }

    public static String[] getThirdQuestion() {
        return thirdQuestion;
    }

    public static void setThirdQuestion(String[] thirdQuestion) {
        Question.thirdQuestion = thirdQuestion;
    }

    public static String[] getThirdOptions() {
        return thirdOptions;
    }

    public static void setThirdOptions(String[] thirdOptions) {
        Question.thirdOptions = thirdOptions;
    }

    public static String[] getFourQuestion() {
        return fourQuestion;
    }

    public static void setFourQuestion(String[] fourQuestion) {
        Question.fourQuestion = fourQuestion;
    }

    public static String[] getFourAnswer() {
        return fourAnswer;
    }

    public static void setFourAnswer(String[] fourAnswer) {
        Question.fourAnswer = fourAnswer;
    }

    public static String[] getFiveQuestion() {
        return fiveQuestion;
    }

    public static void setFiveQuestion(String[] fiveQuestion) {
        Question.fiveQuestion = fiveQuestion;
    }

    public static String[] getFiveAnswer() {
        return fiveAnswer;
    }

    public static void setFiveAnswer(String[] fiveAnswer) {
        Question.fiveAnswer = fiveAnswer;
    }



}
