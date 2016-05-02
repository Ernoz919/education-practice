package com.example.jv_jo.educationpratice.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.jv_jo.educationpratice.R;
import com.example.jv_jo.educationpratice.services.BO;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    private BO bo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().hide();

        bo = new BO(this);
        
    }



}