package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PizzaOrdering extends AppCompatActivity {
CheckBox farmhouse,mexican,deluxe;
RadioGroup radioGroup;
RadioButton yes1,no1,yes2,no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_ordering);
        farmhouse = findViewById(R.id.farmhouse);
        mexican = findViewById(R.id.mexican);
        deluxe = findViewById(R.id.deluxe);
        radioGroup = findViewById(R.id.rg);
        yes1 = findViewById(R.id.yes1);
        no1 = findViewById(R.id.no1);
        yes2 = findViewById(R.id.yes2);
        no2 = findViewById(R.id.no2);
    }

    public void calculateTotalBill(View view) {
        int total = 0;
        StringBuilder msg= new StringBuilder("");

        if(farmhouse.isChecked()){
            total += 150;
            msg.append("Farmhouse Pizza : 150");
        }
        if(mexican.isChecked()){
            total +=250;
            msg.append("\nMexican Veg : 250");
        }
        if(deluxe.isChecked()){
            total += 350;
            msg.append("\nDeluxe Veggie : 350");
        }
        if(yes1.isChecked())
            total+=50;
        if(yes2.isChecked())
            total+=60;

        Toast.makeText(this,"The Total amount is : "+total + "\nFor :\n"+msg,Toast.LENGTH_SHORT).show();

    }
}
