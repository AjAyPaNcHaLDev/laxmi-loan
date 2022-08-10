package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {
String title;
    LinearLayout register_part_one;
    LinearLayout register_part_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
    title=intent.getStringExtra("title");

    getSupportActionBar().setTitle(title);

        register_part_one=findViewById(R.id.register_part_one);
                register_part_second=findViewById(R.id.register_part_second);

    }

    public void changeRegisterLayoutHandler(View view) {
        if(register_part_one.getVisibility()==View.VISIBLE) {
            register_part_one.setVisibility(View.GONE);
            register_part_second.setVisibility(View.VISIBLE);
        }
        else {
            register_part_one.setVisibility(View.VISIBLE);
            register_part_second.setVisibility(View.GONE);
        }
    }

    public void registerNowHandler(View view) {
        startActivity(new Intent(MainActivity2.this,MainActivity.class));
    }
}