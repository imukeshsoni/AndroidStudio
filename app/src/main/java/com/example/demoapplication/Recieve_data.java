package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Recieve_data extends AppCompatActivity {
    TextView tv1,tv2,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_data);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv4 = findViewById(R.id.textView4);
        Intent it = getIntent();
        String name = it.getStringExtra("student_name");
        int roll = it.getIntExtra("roll_no",0);
        double fee = it.getDoubleExtra("fee_paid", 0.0);
        float cgpa = it.getFloatExtra("cgpa", 0.0f);
        boolean status = it.getBooleanExtra("status", false);
        tv1.setText("Name : " + name + "\nRoll no : " + roll + "\nFee: "
                        + fee +"\nCGPA : " + cgpa + "\nStatus : "+ status);

        Bundle b = it.getBundleExtra("bundle");
        String s = b.getString("name");
        int roll_no = b.getInt("rollno");
        Float gpa= b.getFloat("cgpa");
        Double fee_paid = b.getDouble("fee_paid");
        tv2.setText("Name : " + s + "\n Roll no : " + roll_no + "\nCGPA : " + gpa + "\nFee Paid : " + fee_paid);

        //Passing the array
        TextView tv3 = findViewById(R.id.textView3);
        String str = "Elements of array : ";
        int arr[] = it.getIntArrayExtra("array");
        for(int i=0; i<arr.length;++i){
            str+=arr[i] + "\t";
        }
        tv3.setText(str);

        //ArrayList
        String str1 = "These are elements of Array List";
        ArrayList <Integer> al = it.getIntegerArrayListExtra("arraylist");
        for(int p : al){
            str1 += p + "\t";
        }
        tv4.setText(str1);

    }
}
