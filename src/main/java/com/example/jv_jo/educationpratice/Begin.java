package com.example.jv_jo.educationpratice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jv_jo.educationpratice.views.Quiz;
import com.example.jv_jo.educationpratice.views.TheBookActivity;

public class Begin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        getSupportActionBar().hide();

    }

    public void book(View view){
        Intent the_book = new Intent(this, TheBookActivity.class);
        startActivity(the_book);
    }

    public void quiz(View view){
        Intent quiz = new Intent(this, Quiz.class);
        startActivity(quiz);
        finish();
    }
}
