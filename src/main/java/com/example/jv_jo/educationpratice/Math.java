package com.example.jv_jo.educationpratice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Math extends AppCompatActivity {
    TextView addition;
    TextView subtraction;
    TextView multiplication;
    TextView division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        getSupportActionBar().hide();

        addition = (TextView) findViewById(R.id.addition);
        addition.setText("  If you bite an apple twice, will know that are two, if you bite an apple more twice you will know that bite four times. If you take a bite of apple and then other, will know that there were two. It's simple.\n" +
                "\n" +
                "Ex: 4 + 5 = 9\n" +
                "\n" +
                "If I give four bites an apple and then give five bites only have to count: One, two, three, four, five, six, seven, eight nine!");

        subtraction = (TextView) findViewById(R.id.subtraction);
        subtraction.setText("   Subtraction is even easier! Imagine you have seven stones in front of you. So just count backwards!\n" +
                "\n" +
                "EX: 7 - 3 = 4\n" +
                "\n" +
                "We just have to count backwards: Seven, six, five, four, three, two and one.\n" +
                "From then eliminated the first three numbers, which are seven, six and fifteen. So we have: One, two, three and our result: FOUR.");

        multiplication = (TextView) findViewById(R.id.multiplication);
        multiplication.setText("    Now that we know addition and subtraction everything is easier. Multiplication is just a practical way to sum.\n" +
                "\n" +
                "EX: 2 x 4 = 8\n" +
                "\n" +
                "Why 2 x 4 = 8? For four plus four is equal to eight, two times four.\n" +
                "\n" +
                "EX: 3 x 4 = 12\n" +
                "\n" +
                "Four plus four is eight, eight more four is twelve, three times four.");

        division = (TextView) findViewById(R.id.division);
        division.setText("  Division is simple too, now that we know addition, subtraction and multiplication, but now it's a practical way of subtraction.\n" +
                "\n" +
                "EX: 4 ÷ 2 = 2\n" +
                "\n" +
                "Why 4 ÷ 2 = 2? Imagine two children ask you sweet, you have to give an amount equal to two, This is how to divide. Four minus two is two, and two more two are four, thus, half of four is two. We give half part for one child, and the other half for the other child.");

    }
}
