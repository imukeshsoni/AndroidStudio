package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void show_toast(View view)
    {
        Toast.makeText(this,"First Toast Application", Toast.LENGTH_LONG).show();
    }

    public void show_calculator_activity(View view)
    {
        Intent it = new Intent(this,CalculatorActivity.class);
        startActivity(it);
    }


    public void show_assignment(View view) {
        Intent assignment = new Intent(this, Assignment.class);
        startActivity(assignment);
    }

    public void send_data(View view) {
        Intent it = new Intent(this, Recieve_data.class );
        //Storing data through Intent
        it.putExtra("student_name", "John");
        it.putExtra("roll_no", 10);
        it.putExtra("fee_paid", 40000.00d);
        it.putExtra("cgpa", 8.7f);
        it.putExtra("status", true);
        // Storing data through bundle
        Bundle b = new Bundle();
        b.putString("name","John");
        b.putInt("rollno",10);
        b.putFloat("cgpa",9.7f);
        b.putDouble("fee_paid",40000.00d);
        it.putExtra("bundle",b);

        //Passing array
        int arr[] = {100,200,300};
        it.putExtra("array",arr);

        ArrayList al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);

        it.putExtra("arraylist", al);
        startActivity(it);


    }

    public void labEval(View view) {
        Intent Lab = new Intent(this,LabEval.class);
        EditText trainNo = findViewById(R.id.trainNo);
        int tn = Integer.parseInt(trainNo.getText().toString());
        Lab.putExtra("trainNo",tn);
        startActivity(Lab);
    }

    public void WebView(View view) {
    Intent WebView = new Intent(this,WebViewActivity.class);
    startActivity(WebView);
    }

    public void order(View view) {
        Intent Order = new Intent(this,Order.class);
        startActivity(Order);

    }

    public void sharepref(View view) {
        Intent sharepref = new Intent(this,SharePref.class);
        startActivity(sharepref);
    }

    public void assignment2(View view) {
        Intent it = new Intent(this,Tourist_package.class);
        startActivity(it);
    }

    public void labEval2(View view) {
        Intent it = new Intent(this,PizzaOrdering.class);
        startActivity(it);
    }

    public void mediaplayer(View view) {
        Intent it = new Intent(this, Mediaplayer.class);
        startActivity(it);
    }

    public void listviewdemo2(View view) {
        Intent it = new Intent(this,Listviewdemo2.class);
        startActivity(it);
    }
}