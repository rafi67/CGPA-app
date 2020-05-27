package com.softwaresolutions.cgpaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8;
    private Button bt1,bt2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.ed1);
        edit2 = findViewById(R.id.ed2);
        edit3 = findViewById(R.id.ed3);
        edit4 = findViewById(R.id.ed4);
        edit5 = findViewById(R.id.ed5);
        edit6 = findViewById(R.id.ed6);
        edit7 = findViewById(R.id.ed7);
        edit8 = findViewById(R.id.ed8);

        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);

        tv = findViewById(R.id.tv1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Double.parseDouble(edit1.getText().toString());
                double b=Double.parseDouble(edit2.getText().toString());
                double c=Double.parseDouble(edit3.getText().toString());
                double d=Double.parseDouble(edit4.getText().toString());
                double e=Double.parseDouble(edit5.getText().toString());
                double f=Double.parseDouble(edit6.getText().toString());
                double g=Double.parseDouble(edit7.getText().toString());
                double h=Double.parseDouble(edit8.getText().toString());

                double i=((a*5)+(b*5)+(c*5)+(d*15)+(e*15)+(f*20)+(g*25)+(h*10))/100;

                tv.setText(String.valueOf(i));
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(null);
                edit2.setText(null);
                edit3.setText(null);
                edit4.setText(null);
                edit5.setText(null);
                edit6.setText(null);
                edit7.setText(null);
                edit8.setText(null);
                tv.setText(null);
            }
        });

    }
}
