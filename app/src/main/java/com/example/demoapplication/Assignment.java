package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.*;

public class Assignment extends AppCompatActivity {
    EditText et1,et2,et3;
    EditText base,perpendicular;
    TextView textView, hypotenuse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);

        et1 = findViewById(R.id.tworupee);
        et2 = findViewById(R.id.fiverupee);
        et3 = findViewById(R.id.tenrupee);
        textView = findViewById(R.id.showtotal);
        base = findViewById(R.id.base);
        perpendicular = findViewById(R.id.perpendicular);
        hypotenuse = findViewById(R.id.hypotenuse);
    }

    public void calculatetotal(View view) {
        int twoRupee = Integer.parseInt(et1.getText().toString());
        int fiveRupee = Integer.parseInt(et2.getText().toString());
        int tenRupee = Integer.parseInt(et3.getText().toString());
        int total = (2*twoRupee) + (5*fiveRupee) + (10*tenRupee);
        textView.setText("My total amount is Rs : " + total);

    }

    public void calhypotenuse(View view) {
        int b = Integer.parseInt(base.getText().toString());
        int p = Integer.parseInt(perpendicular.getText().toString());
        double h = Math.hypot(b,p);
        Toast.makeText(this, "Hypotenuse is : " + h,Toast.LENGTH_LONG).show();
    }
}
