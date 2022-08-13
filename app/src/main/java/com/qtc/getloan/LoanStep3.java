package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoanStep3 extends AppCompatActivity {

    Button panNo;
    Button panYes;
    TextView pan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_step3);
        panNo=findViewById(R.id.panNo);
        panYes=findViewById(R.id.panYes);
        pan=findViewById(R.id.pan);
        new Loadads().interstitialAdLoad(this);
    }
    public void next(View view) {

        startActivity(  new Intent(LoanStep3.this,LoanStep4.class));
    }

    public void back(View view) {
//        startActivity(  new Intent(LoanStep3.this,LoanStep2.class));

        finish();
    }

    public void Yes(View view) {
        panNo.setVisibility(View.VISIBLE);
        panYes.setVisibility(View.GONE);
        parms.setPan_card("Yes");
        pan.setText("Great you select  YES have pan card");
    }

    public void No(View view) {
        panNo.setVisibility(View.GONE);
        panYes.setVisibility(View.VISIBLE);
        parms.setPan_card("No");
        pan.setText("you select  NO pan card is required for Loan");
    }
}