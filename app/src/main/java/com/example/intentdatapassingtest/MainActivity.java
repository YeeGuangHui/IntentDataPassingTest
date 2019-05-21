package com.example.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    Button btnPassInteger;
    Button btnPassChar;
    TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        tV=findViewById(R.id.textView3);

        //Event handling Step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });
        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ThirdActivity.class);
                intent.putExtra("letter", 'a');
                startActivity(intent);
            }
        });
        tV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), FourthActivity.class);
                intent.putExtra("floating", 00.00);
                startActivity(intent);
            }
        });
    }
}

