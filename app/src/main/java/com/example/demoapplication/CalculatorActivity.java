package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        num1 = findViewById(R.id.et1);
        num2 = findViewById(R.id.et2);
        textView = findViewById(R.id.tv1);
    }

    public void add(View view)
    {

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int result = n1+n2;
        textView.setText("The result of the addition is : " + result);

    }

    public void sub(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int result = n1-n2;
        textView.setText("The result of the subtraction is : " + result);
    }

    public void mul(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int result = n1*n2;
        textView.setText("The result of the multiplication is : " + result);
    }

    public void div(View view) {
        Float n1 = Float.valueOf(Integer.parseInt(num1.getText().toString()));
        Float n2 = Float.valueOf(Integer.parseInt(num2.getText().toString()));
        Float result = (Float) Float.parseFloat(String.valueOf(n1/n2));
        textView.setText("The result of the division is : " + result);
    }
}
