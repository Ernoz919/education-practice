package com.example.jv_jo.educationpratice;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultQuiz extends AppCompatActivity {
    private double points;

    private TextView pointsView;

    ColorDrawable moreSeven;
    ColorDrawable minusSix;
    ColorDrawable minusFour;

    Intent quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);
        getSupportActionBar().hide();

         moreSeven = new ColorDrawable(Color.parseColor("#34a608"));
         minusSix = new ColorDrawable(Color.parseColor("#dcd91a"));
         minusFour = new ColorDrawable(Color.parseColor("#dc241a"));

        quiz = getIntent();
        points = quiz.getDoubleExtra("points", points);

        pointsView = (TextView) findViewById(R.id.pointsView);
        pointsView.setText(String.valueOf(points));

        View winner = (View) findViewById(R.id.result);


        if (points >= 7){
            winner.setBackgroundDrawable(moreSeven);
        }else if (points <= 6 && points >= 4){
            winner.setBackgroundDrawable(minusSix);
        }else if (points <= 4 && points >= 0){
            winner.setBackgroundDrawable(minusFour);
        }

    }

    public void conTinue(View view){
        Intent next = new Intent(this, Begin.class);
        startActivity(next);
        finish();
    }

}
