package com.example.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //Step 1

        //Step 2
        tvAnswer = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        double floating = intentReceived.getDoubleExtra("floating", 99.99);
        tvAnswer.setText("Double value received is: " + floating);
        }
    }
