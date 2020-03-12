package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ListView;

public class Mediaplayer extends AppCompatActivity {

    ListView lv1;
    Mediaplayer mp;
    int ID[] = {R.raw.song1,R.raw.song2,R.raw.song3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);
        lv1 = findViewById(R.id.listview);
        mp = new Mediaplayer();
    }
}
