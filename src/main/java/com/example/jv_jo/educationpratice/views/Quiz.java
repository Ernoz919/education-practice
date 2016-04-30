package com.example.jv_jo.educationpratice.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.jv_jo.educationpratice.R;
import com.example.jv_jo.educationpratice.enums.Discipline;
import com.example.jv_jo.educationpratice.optionsAndAnswers.DefinedQuestions;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    private DefinedQuestions definedQuestions = new DefinedQuestions();

    private TextView firstQuest;
    private TextView thirdtQuest;
    private TextView fourQuest;
    private TextView fiveQuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().hide();

        definedQuestions.randomQuestions();

        firstQuest = (TextView) findViewById(R.id.firstQuest);
        firstQuest.setText(DefinedQuestions.getFirstQuest());

        thirdtQuest = (TextView) findViewById(R.id.thirdQuest);
        thirdtQuest.setText(DefinedQuestions.getThirdQuest());

        fourQuest = (TextView) findViewById(R.id.fourQuest);
        fourQuest.setText(DefinedQuestions.getFourQuest());

        fiveQuest = (TextView) findViewById(R.id.fiveQuest);
        fiveQuest.setText(DefinedQuestions.getFiveQuest());
        
    }



}