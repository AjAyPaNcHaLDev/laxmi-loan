package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Window;

public class MainActivity2 extends AppCompatActivity {
String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
    title=intent.getStringExtra("title");
    getSupportActionBar().setTitle(title);
    }
}