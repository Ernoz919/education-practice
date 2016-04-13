package com.example.jv_jo.educationpratice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Language extends AppCompatActivity {
    TextView english;
    TextView portuguese;
    TextView french;
    TextView german;
    TextView spanish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        getSupportActionBar().hide();


    }
}
