package com.example.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    //Step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Step 2
        tvAnswer = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char letter = intentReceived.getCharExtra("letter", 'a');
        tvAnswer.setText("Character value received is: " + letter);
    }
}