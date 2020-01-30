package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LabEval extends AppCompatActivity {
    TextView tv1, tv2;
    EditText n, kids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_eval);
        tv1 = findViewById(R.id.tv1);

        Intent it = getIntent();

        int trainNo = it.getIntExtra("trainNo", 0000);
        tv1.setText("Train no :- " + trainNo + "\nTrain Name :- Shatabdi Express" + "\nSource :- Amritsar (ASR)\nDestination :- Delhi (DEE)" +
                "\nTicket Fair (Sleeper class) :- Rs. 1200");


    }

    public void calculatesum(View view) {
        n = findViewById(R.id.personNo);
        kids = findViewById(R.id.kids);

        int no = Integer.parseInt(n.getText().toString());
        int kid = Integer.parseInt(kids.getText().toString());

        int total = (no * 1200) + (kid * 600);
        tv2 = findViewById(R.id.totalCharges);
        tv2.setText("The total fair is : Rs. " + total);
    }
}
