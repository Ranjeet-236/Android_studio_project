package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText FirstValue, SecondValue;
    TextView Answer;
    Button Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirstValue=findViewById(R.id.etFirstValue);
        SecondValue=findViewById(R.id.etSecondValue);
        Add=findViewById(R.id.btnAdd);
        Div=findViewById(R.id.btnDiv);
        Mul=findViewById(R.id.btnMul);
        Sub=findViewById(R.id.btnSub);
        Answer=findViewById(R.id.tvAnswer);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a=Integer.parseInt(FirstValue.getText().toString());
                b=Integer.parseInt(SecondValue.getText().toString());

                c=a+b;
                Answer.setText("answer is "+c);

            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a=Integer.parseInt(FirstValue.getText().toString());
                b=Integer.parseInt(SecondValue.getText().toString());

                c=a-b;
                Answer.setText("answer is "+c);

            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a=Integer.parseInt(FirstValue.getText().toString());
                b=Integer.parseInt(SecondValue.getText().toString());

                c=a*b;
                Answer.setText("answer is "+c);

            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a=Integer.parseInt(FirstValue.getText().toString());
                b=Integer.parseInt(SecondValue.getText().toString());

                c=a/b;
                Answer.setText("answer is "+c);

            }
        });

    }
}