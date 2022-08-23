package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
String title;
    LinearLayout register_part_one;
    LinearLayout register_part_second;
    EditText name, email,mobile,address,password,inpDob;
    Spinner gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
        new Loadads().interstitialAdLoad(this);
        Intent intent=getIntent();
        new Loadads().adsBanner(findViewById(R.id.adViewStep10));
        new Loadads().adsBanner(findViewById(R.id.adViewStep11));
    title=intent.getStringExtra("title");

    getSupportActionBar().setTitle(title);
        name=findViewById(R.id.name);
                email=findViewById(R.id.email);
        gender=findViewById(R.id.gender);
        mobile=findViewById(R.id.mobile);
                address=findViewById(R.id.address);
        password=findViewById(R.id.password);
        inpDob=findViewById(R.id.inpDob);
        register_part_one=findViewById(R.id.register_part_one);
                register_part_second=findViewById(R.id.register_part_second);
        parms.setHome(false);
    }

    public void changeRegisterLayoutHandler(View view) {
        if(register_part_one.getVisibility()==View.VISIBLE) {

            register_part_one.setVisibility(View.GONE);
            register_part_second.setVisibility(View.VISIBLE);
            parms.setEmail(email.getText().toString());
            parms.setGender(gender.getSelectedItem().toString());
            parms.setName(name.getText().toString());
            parms.setDob(inpDob.getText().toString());
        }
        else {
            register_part_one.setVisibility(View.VISIBLE);
            register_part_second.setVisibility(View.GONE);
        }
    }

    public void registerNowHandler(View view) {

        parms.setPassword(password.getText().toString());
        parms.setAddress(address.toString());
        parms.setMobile(mobile.getText().toString());
//        Intent i =new Intent(this,LoanStep1.class);

//        startActivity(i);
        finish();

    }
}