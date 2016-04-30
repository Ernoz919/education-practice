package com.example.jv_jo.educationpratice.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jv_jo.educationpratice.R;

import java.lang.*;

public class TheBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        getSupportActionBar().hide();

    }

    public void language(View view){
        Intent lang = new Intent(this, Language.class);
        startActivity(lang);
    }

    public void math(View view){
        Intent math = new Intent(this, Math.class);
        startActivity(math);
        startActivity(math);
    }

    public void science(View view){
        Intent science = new Intent(this, Science.class);
        startActivity(science);
    }

    public void history(View view) {
        Intent history = new Intent(this, History.class);
        startActivity(history);
    }

    public void geography(View view){
        Intent geography = new Intent(this, Geography.class);
        startActivity(geography);
    }

}
