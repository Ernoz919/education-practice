package com.example.jv_jo.educationpratice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    private EditText a2;
    private EditText b2;
    private EditText c2;
    private EditText d2;
    private EditText e2;
    private EditText f2;

    private EditText yearWarII;
    private EditText causedWarII;

    private String[] quests;
    private String quest;

    private String[] TwoQuests;
    private String TwoQuest;

    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;
    private String answerFive;
    private String answerSix;

    private String answerOneQ;
    private String answerTwoQ;
    private String answerThreeQ;
    private String answerFourQ;
    private String answerFiveQ;
    private String answerSixQ;

    private String a1One;
    private String b1One;
    private String c1One;

    private String a2Two;
    private String b2Two;
    private String c2Two;

    private String a3Three;
    private String b3Three;
    private String c3Three;

    private String a4Four;
    private String b4Four;
    private String c4Four;

    private String a5Five;
    private String b5Five;
    private String c5Five;

    private String a6Six;
    private String b6Six;
    private String c6Six;

    private String a1OneQ;
    private String b1OneQ;
    private String c1OneQ;

    private String a2TwoQ;
    private String b2TwoQA;
    private String c2TwoQ;

    private String a3ThreeQ;
    private String b3ThreeQ;
    private String c3ThreeQ;

    private String a4FourQ;
    private String b4FourQ;
    private String c4FourQ;

    private String a5FiveQ;
    private String b5FiveQ;
    private String c5FiveQ;

    private String a6SixQ;
    private String b6SixQ;
    private String c6SixQ;

    private int idx;
    private int idxQ;

    private TextView firstQuest;
    private TextView thirdTwoQuest;

    private RadioButton a1TwoQ;
    private RadioButton b2TwoQ;
    private RadioButton c3TwoQ;

    private RadioButton a1;
    private RadioButton b1;
    private RadioButton c1;

    private double points;

    Intent result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().hide();

        a2 = (EditText) findViewById(R.id.a2);
        b2 = (EditText) findViewById(R.id.b2);
        c2 = (EditText) findViewById(R.id.c2);
        d2 = (EditText) findViewById(R.id.d2);
        e2 = (EditText) findViewById(R.id.e2);
        f2 = (EditText) findViewById(R.id.f2);

        yearWarII = (EditText) findViewById(R.id.year_hitler);
        causedWarII = (EditText) findViewById(R.id.caused_hitler);

        a1 = (RadioButton) findViewById(R.id.a1);
        b1 = (RadioButton) findViewById(R.id.b1);
        c1 = (RadioButton) findViewById(R.id.c1);

        a1TwoQ = (RadioButton) findViewById(R.id.space);
        b2TwoQ = (RadioButton) findViewById(R.id.earth);
        c3TwoQ = (RadioButton) findViewById(R.id.all);

        randomQuestsOne();
        randomQuestsTwo();

        firstQuest = (TextView) findViewById(R.id.firstQuest);
        thirdTwoQuest = (TextView) findViewById(R.id.thirdTwoQuest);

        a1One = "September, 1939";
        b1One = "December, 1933";
        c1One = "January, 1945";

        a2Two = "Sí";
        b2Two = "Ja";
        c2Two = "Oui";

        a3Three = "Organisms";
        b3Three = "Space and Stars";
        c3Three = "Fundamental constituents of the universe";

        a4Four = "Dilma";
        b4Four = "Hitler";
        c4Four = "Stalin";

        a5Five = "Churchill";
        b5Five = "Obama";
        c5Five = "Roosevelt";

        a6Six = "Prime Minister of England";
        b6Six = "President of England";
        c6Six = "King of England";
        ////////////////////////////////////////////
        a1OneQ = "Space and Stars";
        b1OneQ = "Earth and countries";
        c1OneQ = "All";

        a2TwoQ = "Earth and countries";
        b2TwoQA = "Organisms";
        c2TwoQ = "Gases, molecules, crystals and metals";

        a3ThreeQ = "Fundamental constituents of the universe";
        b3ThreeQ = "Space and Stars";
        c3ThreeQ = "Gases, molecules, crystals and metals";

        a4FourQ = "Periodic table";
        b4FourQ = "Economy";
        c4FourQ = "Gravity";

        a5FiveQ = "Politics";
        b5FiveQ = "Schrödinger's Cat";
        c5FiveQ = "Biggest star in the galaxy";

        a6SixQ = "Biggest star in the galaxy";
        b6SixQ = "Countries";
        c6SixQ = "Gravity";

        definedOptions();
        definedOptionsTwo();

        result = new Intent(this, ResultQuiz.class);

        firstQuest.setText(quest);
        thirdTwoQuest.setText(TwoQuest);

    }

    public void checkAll(View view){
        points();
        result.putExtra("points", points);
        startActivity(result);
        finish();
    }

    private void points (){

        searchAnswerOne();
        searchAnswerTwo();
        searchAnswerThree();
        searchAnswerFour();
        searchAnswerFive();
        searchAnswerSix();

        searchAnswerOneQ();
        searchAnswerTwoQ();
        searchAnswerThreeQ();
        searchAnswerFourQ();
        searchAnswerFiveQ();
        searchAnswerSixQ();

        if ("11".equals(a2.getText().toString())) {
            points = points + 0.4;
        }
        if ("3".equals(b2.getText().toString())) {
            points = points + 0.4;
        }
        if ("21".equals(c2.getText().toString())) {
            points = points + 0.4;
        }
        if ("5".equals(d2.getText().toString())) {
            points = points + 0.4;
        }
        if ("32".equals(e2.getText().toString())) {
            points = points + 0.4;
        }
        if ("4".equals(f2.getText().toString())) {
            points = points + 0.4;
        }

        if ("6".equals(yearWarII.getText().toString())){
            points = points + 2;
        }
        if ("invasion of poland".equalsIgnoreCase(causedWarII.getText().toString())){
            points = points + 2;
        }

    }

    private void randomQuestsOne(){
        quests = new String[6];

        answerOne = "1°) Which date Nazi Germany attacked Poland?";
        answerTwo = "1°) What is the meaning of \"Sim\", portuguese, in German?";
        answerThree = "1°) What studies the physical?";
        answerFour = "1°) Who was the leader and chancellor of Nazi Germany?";
        answerFive = "1°) Who was the president of the United States of America in World War II?";
        answerSix = "1°) Who was Winston Churchill?";

        quests[0] = (answerOne);
        quests[1] = (answerTwo);
        quests[2] = (answerThree);
        quests[3] = (answerFour);
        quests[4] = (answerFive);
        quests[5] = (answerSix);

        idx = new Random().nextInt(quests.length);
        quest = (quests[idx]);
    }

    private void randomQuestsTwo(){
        TwoQuests = new String[6];

        answerOneQ = "3°) What studies the astronomy?";
        answerTwoQ = "3°) What studies the biology?";
        answerThreeQ = "3°) What chemistry studies?";
        answerFourQ = "3°) Which of these topics is in chemistry?";
        answerFiveQ = "3°) Which of these topics is in physical?";
        answerSixQ = "3°) Which of these topics this in astronomy?";

        TwoQuests[0] = (answerOneQ);
        TwoQuests[1] = (answerTwoQ);
        TwoQuests[2] = (answerThreeQ);
        TwoQuests[3] = (answerFourQ);
        TwoQuests[4] = (answerFiveQ);
        TwoQuests[5] = (answerSixQ);

        idxQ = new Random().nextInt(TwoQuests.length);
        TwoQuest = (TwoQuests[idxQ]);
    }

    private void definedOptions(){
        if (quest.equals(answerOne)){
            a1.setText(a1One);
            b1.setText(b1One);
            c1.setText(c1One);
        }else if (quest.equals(answerTwo)){
            a1.setText(a2Two);
            b1.setText(b2Two);
            c1.setText(c2Two);
        }else if (quest.equals(answerThree)){
            a1.setText(a3Three);
            b1.setText(b3Three);
            c1.setText(c3Three);
        }else if (quest.equals(answerFour)){
            a1.setText(a4Four);
            b1.setText(b4Four);
            c1.setText(c4Four);
        }else if (quest.equals(answerFive)){
            a1.setText(a5Five);
            b1.setText(b5Five);
            c1.setText(c5Five);
        }else if (quest.equals(answerSix)){
            a1.setText(a6Six);
            b1.setText(b6Six);
            c1.setText(c6Six);
        }

    }

    private void definedOptionsTwo(){
        if (TwoQuest.equals(answerOneQ)){
            a1TwoQ.setText(a1OneQ);
            b2TwoQ.setText(b1OneQ);
            c3TwoQ.setText(c1OneQ);
        }else if (TwoQuest.equals(answerTwoQ)){
            a1TwoQ.setText(a2TwoQ);
            b2TwoQ.setText(b2TwoQA);
            c3TwoQ.setText(c2TwoQ);
        }else if (TwoQuest.equals(answerThreeQ)){
            a1TwoQ.setText(a3ThreeQ);
            b2TwoQ.setText(b3ThreeQ);
            c3TwoQ.setText(c3ThreeQ);
        }else if (TwoQuest.equals(answerFourQ)){
            a1TwoQ.setText(a4FourQ);
            b2TwoQ.setText(b4FourQ);
            c3TwoQ.setText(c4FourQ);
        }else if (TwoQuest.equals(answerFiveQ)){
            a1TwoQ.setText(a5FiveQ);
            b2TwoQ.setText(b5FiveQ);
            c3TwoQ.setText(c5FiveQ);
        }else if (TwoQuest.equals(answerSixQ)){
            a1TwoQ.setText(a6SixQ);
            b2TwoQ.setText(b6SixQ);
            c3TwoQ.setText(c6SixQ);
        }

    }

/////////////////////////////////////////////////////////////////////////////////

    private void searchAnswerOneQ() {
        if (a1TwoQ.getText().toString().equals(a1OneQ)) {

            if (a1TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (b2TwoQ.getText().toString().equals(a1OneQ)) {

            if (b2TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (c3TwoQ.getText().toString().equals(a1OneQ)) {

            if (c3TwoQ.isChecked()){
                points = points + 2;
            }
        }
    }

    private void searchAnswerTwoQ() {
        if (a1TwoQ.getText().toString().equals(b2TwoQA)) {

            if (a1TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (b2TwoQ.getText().toString().equals(b2TwoQA)) {

            if (b2TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (c3TwoQ.getText().toString().equals(b2TwoQA)) {

            if (c3TwoQ.isChecked()){
                points = points + 2;
            }
        }
    }

    private void searchAnswerThreeQ() {
        if (a1TwoQ.getText().toString().equals(c3ThreeQ)) {

            if (a1TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (b2TwoQ.getText().toString().equals(c3ThreeQ)) {

            if (b2TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (c3TwoQ.getText().toString().equals(c3ThreeQ)) {
            if (c3TwoQ.isChecked()){
                points = points + 2;
            }
        }
    }
    private void searchAnswerFourQ() {
        if (a1TwoQ.getText().toString().equals(a4FourQ)) {

            if (a1TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (b2TwoQ.getText().toString().equals(a4FourQ)) {

            if (b2TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (c3TwoQ.getText().toString().equals(a4FourQ)) {

            if (c3TwoQ.isChecked()){
                points = points + 2;
            }
        }
    }

    private void searchAnswerFiveQ() {
        if (a1TwoQ.getText().toString().equals(b5FiveQ)) {

            if (a1TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (b2TwoQ.getText().toString().equals(b5FiveQ)) {

            if (b2TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (c3TwoQ.getText().toString().equals(b5FiveQ)) {

            if (c3TwoQ.isChecked()){
                points = points + 2;
            }
        }
    }
    private void searchAnswerSixQ() {
        if (a1TwoQ.getText().toString().equals(a6SixQ)) {

            if (a1TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (b2TwoQ.getText().toString().equals(a6SixQ)) {

            if (b2TwoQ.isChecked()){
                points = points + 2;
            }
        } else if (c3TwoQ.getText().toString().equals(a6SixQ)) {

            if (c3TwoQ.isChecked()){
                points = points + 2;
            }
        }
    }

////////////////////////////////////////////////////////////////////////////////

    private void searchAnswerOne() {
        if (a1.getText().toString().equals(a1One)) {

            if (a1.isChecked()){
                points = points + 2;
            }
        } else if (b1.getText().toString().equals(a1One)) {

            if (b1.isChecked()){
                points = points + 2;
            }
        } else if (c1.getText().toString().equals(a1One)) {

            if (c1.isChecked()){
                points = points + 2;
            }
        }
    }

    private void searchAnswerTwo() {
        if (a1.getText().toString().equals(c2Two)) {

            if (a1.isChecked()){
                points = points + 2;
            }
        } else if (b1.getText().toString().equals(c2Two)) {

            if (b1.isChecked()){
                points = points + 2;
            }
        } else if (c1.getText().toString().equals(c2Two)) {

            if (c1.isChecked()){
                points = points + 2;
            }
        }
    }

    private void searchAnswerThree() {
        if (a1.getText().toString().equals(c3Three)) {

            if (a1.isChecked()){
                points = points + 2;
            }
        } else if (b1.getText().toString().equals(c3Three)) {

            if (b1.isChecked()){
                points = points + 2;
            }
        } else if (c1.getText().toString().equals(c3Three)) {
            if (c1.isChecked()){
                points = points + 2;
            }
        }
    }
    private void searchAnswerFour() {
        if (a1.getText().toString().equals(b4Four)) {

            if (a1.isChecked()){
                points = points + 2;
            }
        } else if (b1.getText().toString().equals(b4Four)) {

            if (b1.isChecked()){
                points = points + 2;
            }
        } else if (c1.getText().toString().equals(b4Four)) {

            if (c1.isChecked()){
                points = points + 2;
            }
        }
    }

    private void searchAnswerFive() {
        if (a1.getText().toString().equals(c5Five)) {

            if (a1.isChecked()){
                points = points + 2;
            }
        } else if (b1.getText().toString().equals(c5Five)) {

            if (b1.isChecked()){
                points = points + 2;
            }
        } else if (c1.getText().toString().equals(c5Five)) {

            if (c1.isChecked()){
                points = points + 2;
            }
        }
    }
    private void searchAnswerSix() {
        if (a1.getText().toString().equals(a6Six)) {

            if (a1.isChecked()){
                points = points + 2;
            }
        } else if (b1.getText().toString().equals(a6Six)) {

            if (b1.isChecked()){
                points = points + 2;
            }
        } else if (c1.getText().toString().equals(a6Six)) {

            if (c1.isChecked()){
                points = points + 2;
            }
        }
    }


}
