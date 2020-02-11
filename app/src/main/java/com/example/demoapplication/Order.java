package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Order extends AppCompatActivity {
CheckBox cb1,cb2,cb3;
RadioButton r1,r2;
RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        radioGroup = findViewById(R.id.rg);
    }

    public void order(View view) {
        int total = 0;
        StringBuilder msg = new StringBuilder();
        if(cb1.isChecked()){
            total += 300;
            msg.append("Pizza : 300");
        }
        if(cb2.isChecked()){
            total +=150;
            msg.append("\nBurger : 150");
        }
        if(cb3.isChecked()){
            total += 200;
            msg.append("\nSandwich : 200");
        }
        msg.append("\nTotal Bill Rs : "+ total);
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();

    }

    public void ratings(View view) {
        StringBuilder str = new StringBuilder("Food Quality : ");
        /*
        if(r1.isChecked()){
            str.append("Good!");
        }
        if(r2.isChecked()){
            str.append("Average");
        }
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();  "This is one way to perform operation using Radio Buttons"
        */
        //Another way with using radio group
        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        if(id==-1){
            Toast.makeText(this,"Nothing is selected.",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"The food Quality is : "+rb.getText(),Toast.LENGTH_SHORT).show();
        }
    }
}
