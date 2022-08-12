package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalPage extends AppCompatActivity {
    TextView name,gender, dob,Amount,time ,panCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);
getSupportActionBar().setTitle("Loan Details");
        name= findViewById(R.id.name);
        gender= findViewById(R.id.gender);
        dob= findViewById(R.id.dob);
        Amount= findViewById(R.id.Amount);
        time= findViewById(R.id.time);
        panCard= findViewById(R.id.panCard);
        name.setText(parms.getName());
                gender.setText(parms.getGender());
        dob.setText(parms.getDob());
                Amount.setText(parms.getAmount());
        time.setText(parms.getTime());
                panCard.setText(parms.getPan_card());

    }


    public void finished(View view) {
        startActivity(new Intent(FinalPage.this,MainActivity.class));

    }
}