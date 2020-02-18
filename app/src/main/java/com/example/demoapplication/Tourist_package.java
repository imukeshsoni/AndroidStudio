package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.IntentService;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Tourist_package extends AppCompatActivity {
CheckBox shimla,manali,dalhousie;
EditText persons,days;
RadioGroup radioGroup;
RadioButton yes,no;
TextView totalCharges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_package);
        shimla = findViewById(R.id.shimla);
        manali = findViewById(R.id.manali);
        dalhousie = findViewById(R.id.dalhousie);
        persons = findViewById(R.id.persons);
        days = findViewById(R.id.days);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        totalCharges = findViewById(R.id.totalCharges);
    }

    public void calculateTarrif(View view) {
            Float total = null;
            int noP,noD;
            if(shimla.isChecked())
                total+=Float.parseFloat(shimla.getText().toString());
            if(manali.isChecked())
                total+=Float.parseFloat(manali.getText().toString());
            if(dalhousie.isChecked())
                total+=Float.parseFloat(dalhousie.getText().toString());

            noP = Integer.parseInt(persons.getText().toString());
            noD = Integer.parseInt(days.getText().toString());

            total = total*noP*noD;

            if(radioGroup.getCheckedRadioButtonId()==yes.getId() && shimla.isChecked() && manali.isChecked() && dalhousie.isChecked()){
                total+=4500;
            }
            else
                Toast.makeText(this,"Cab Service is only available if all places are selected.",Toast.LENGTH_SHORT).show();

            if(total!=null)
                totalCharges.setText("Total charges for your tour is : "+total);
            else
                Toast.makeText(this,"Please select anything",Toast.LENGTH_SHORT).show();


    }
}
