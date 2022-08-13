package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoanStep2 extends AppCompatActivity {
Button loanYes,loanNo;
TextView loan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_step2);
        loanYes=findViewById(R.id.loanYes);
                loanNo=findViewById(R.id.loanNo);
                loan=findViewById(R.id.loan);
        new Loadads().interstitialAdLoad(this);

    }

    public void next(View view) {
      startActivity(  new Intent(LoanStep2.this,LoanStep3.class));
    }

    public void back(View view) {
//        startActivity(  new Intent(LoanStep2.this,LoanStep1.class));

        finish();
    }
    public void Yes(View view) {
        loanNo.setVisibility(View.VISIBLE);
        loanYes.setVisibility(View.GONE);
        parms.setLoan("Yes");

        loan.setText("You select yes means you have a pending loan");
    }

    public void No(View view) {
        loanNo.setVisibility(View.GONE);
        loanYes.setVisibility(View.VISIBLE);
parms.setLoan("No");
        loan.setText("You select NO you means  No loan pending");
    }
}