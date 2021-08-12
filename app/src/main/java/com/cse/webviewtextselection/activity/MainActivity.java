package com.cse.webviewtextselection.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.cse.webviewtextselection.R;
import com.cse.webviewtextselection.custom_view.CustomWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomWebView customWebView = findViewById(R.id.customWebView);
        customWebView.loadUrl("file:///android_asset/content.html");

    }
}
