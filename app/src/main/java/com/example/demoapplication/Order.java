package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Order extends AppCompatActivity {
CheckBox cb1,cb2,cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);

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
        msg.append("\nTotal : "+ total);
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();

    }
}
