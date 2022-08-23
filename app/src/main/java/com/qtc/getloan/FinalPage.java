package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class FinalPage extends AppCompatActivity {
    TextView name,gender, dob,Amount,time ,panCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);
getSupportActionBar().setTitle("Loan Details");
        new Loadads().interstitialAdLoad(this);
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
        new Loadads().adsBanner(findViewById(R.id.adViewFinal1));
        new Loadads().adsBanner(findViewById(R.id.adViewFinal));

    }




    public void showAlertDialogButtonClicked(View view) {
        Log.e("TAGA","showAlertDialogButtonClicked");
        new Loadads().interstitialAdLoad(FinalPage.this);
        AlertDialog.Builder builder=new AlertDialog.Builder(FinalPage.this,R.style.AlertDialogTheme);
        View view0= LayoutInflater.from(FinalPage.this).inflate(
                R.layout.congrat,(ConstraintLayout)findViewById(R.id.layoutDialogContainer));
        builder.setView(view0);
        final AlertDialog alertDialog=builder.create();
        view0.findViewById(R.id.alertBtnYes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialog.dismiss();
                new Loadads().interstitialAdLoad(FinalPage.this);
                Intent i=new Intent(FinalPage.this,MainActivity.class);
                parms.setHome(true);
                startActivity(i);
//                finish();
            }
        });

        alertDialog.show();


    }

}