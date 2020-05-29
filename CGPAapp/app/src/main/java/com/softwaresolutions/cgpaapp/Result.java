package com.softwaresolutions.cgpaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView t;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t = findViewById(R.id.tv);
        double y = Result_Data.r;
        String Y = Error_Data.r;
        if(Y!=null){
            t.setText(Y);
        }
        else {
            String r = "Your GPA is ";
            t.setText(r + String.valueOf(y));
        }
        back = findViewById(R.id.btnback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(null);
                Intent in = new Intent(Result.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}
