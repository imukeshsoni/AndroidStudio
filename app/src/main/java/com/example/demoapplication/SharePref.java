package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SharePref extends AppCompatActivity {
CheckBox cb1;
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_pref);
        cb1 = findViewById(R.id.cb);
        et1 = findViewById(R.id.username);
        et2 = findViewById(R.id.password);
    }

    public void savedata(View view) {
        if(cb1.isChecked()){
            //SharedPreferences class is used to save the data in the memory
            //We can use SharedPreferences and PreferenceManager to save the data.
            //Here SharedPreference.Editor is an Interface to make changes in the sharedPreferences
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            String username = et1.getText().toString();
            String password = et2.getText().toString();
            editor.putString("username",username);
            editor.putString("password",password);
            editor.commit();
            Toast.makeText(this,"Data saved",Toast.LENGTH_SHORT).show();
            et1.setText("");
            et2.setText("");
        }
        else{
            Toast.makeText(this,"User has not opted to save the data",Toast.LENGTH_SHORT).show();
        }
    }

    public void readdata(View view) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String username = sharedPreferences.getString("username","No Username");
        String password = sharedPreferences.getString("password","No Password");
        et1.setText(username);
        et2.setText(password);
        Toast.makeText(this,"Username : "+username+"\nPassword : "+password,Toast.LENGTH_SHORT).show();
    }
}
