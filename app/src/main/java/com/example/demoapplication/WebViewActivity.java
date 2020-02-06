package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        wv = findViewById(R.id.wv);

    }

    public void webView(View view) {
       // wv.loadUrl("https://www.google.com"); // Directly loading the application in the application. Commenting this to use one other method
        wv.loadUrl("file:///android_asset/web_page.html"); // Here '///' is used to access the root directory in an application
    }
}
