package com.example.jv_jo.educationpratice.optionsAndAnswers;

import com.example.jv_jo.educationpratice.models.Question;

import java.util.Random;

/**
 * Created by jv_jo on 26/04/2016.
 */
public class DefinedQuestions {

    private static String firstQuest;
    private static String thirdQuest;
    private static String fourQuest;
    private static String fiveQuest;

    private int idx;
////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String getFirstQuest() {
        return firstQuest;
    }

    public static void setFirstQuest(String firstQuest) {
        DefinedQuestions.firstQuest = firstQuest;
    }

    public static String getThirdQuest() {
        return thirdQuest;
    }

    public static void setThirdQuest(String thirdQuest) {
        DefinedQuestions.thirdQuest = thirdQuest;
    }

    public static String getFourQuest() {
        return fourQuest;
    }

    public static void setFourQuest(String fourQuest) {
        DefinedQuestions.fourQuest = fourQuest;
    }

    public static String getFiveQuest() {
        return fiveQuest;
    }

    public static void setFiveQuest(String fiveQuest) {
        DefinedQuestions.fiveQuest = fiveQuest;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    private void defineQuestions(){

        Question.getFirstQuestion()[0] = "1°) Which date Nazi Germany attacked Poland?";
        Question.getFirstQuestion()[1] = "1°) What is the meaning of \"Sim\", portuguese, in German?";
        Question.getFirstQuestion()[2] = "1°) What studies the physical?";
        Question.getFirstQuestion()[3] = "1°) Who was the leader and chancellor of Nazi Germany?";
        Question.getFirstQuestion()[4] = "1°) Who was the president of the United States of America in World War II?";

        Question.getThirdQuestion()[0] = "3°) What studies the astronomy?";
        Question.getThirdQuestion()[1] = "3°) What studies the biology?";
        Question.getThirdQuestion()[2] = "3°) What chemistry studies?";
        Question.getThirdQuestion()[3] = "3°) Which of these topics is in chemistry?";
        Question.getThirdQuestion()[4] = "3°) Which of these topics is in physical?";

        Question.getFourQuestion()[0] = "4°) How old lasted World War II?";
        Question.getFourQuestion()[1] = "4°) Who discovered gravity?";
        Question.getFourQuestion()[2] = "4°) What force does the round planets?";
        Question.getFourQuestion()[3] = "4°) What is the speed of light? (only the numbers)";
        Question.getFourQuestion()[4] = "4°) Who was the first man to walk on the moon?";

        Question.getFiveQuestion()[0] = "5°) What was the cause of World War II?";
        Question.getFiveQuestion()[1] = "5°) Who caused the Second World War?";
        Question.getFiveQuestion()[2] = "5°) Which faction Hitler led?";
        Question.getFiveQuestion()[3] = "5°) Who developed the principle Expansion in geography?";
        Question.getFiveQuestion()[4] = "5°) What is the understanding of the principle of causality?";

    }

    public void randomQuestions(){
        defineQuestions();

        setIdx(new Random().nextInt(Question.getFirstQuestion().length));
        setFirstQuest((Question.getFirstQuestion()[getIdx()]));

        setIdx(new Random().nextInt(Question.getThirdQuestion().length));
        setThirdQuest((Question.getThirdQuestion()[getIdx()]));

        setIdx(new Random().nextInt(Question.getFourQuestion().length));
        setFourQuest((Question.getFourQuestion()[getIdx()]));

        setIdx(new Random().nextInt(Question.getFiveQuestion().length));
        setFiveQuest((Question.getFiveQuestion()[getIdx()]));

    }


    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }
}
