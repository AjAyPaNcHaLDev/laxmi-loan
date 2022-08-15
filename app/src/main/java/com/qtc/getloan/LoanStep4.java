package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoanStep4 extends AppCompatActivity {
    Button jobNo;
            Button jobYes;
            TextView jobType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_step4);
        jobNo=findViewById(R.id.jobNo);
                jobYes=findViewById(R.id.jobYes);
        jobType=findViewById(R.id.jobType);
        new Loadads().interstitialAdLoad(this);
        new Loadads().adsBanner(findViewById(R.id.adViewStep8));
        new Loadads().adsBanner(findViewById(R.id.adViewStep9));

    }
    public void next(View view) {


        startActivity(  new Intent(LoanStep4.this,FinalPage.class));
    }

    public void back(View view) {
//        startActivity(  new Intent(LoanStep4.this,LoanStep3.class));
        finish();
    }
    public void Yes(View view) {
        parms.setJob("Govt");
        jobNo.setVisibility(View.VISIBLE);
        jobYes.setVisibility(View.GONE);
        jobType.setText("Job marked as Govt Job");
    }

    public void No(View view) {
        parms.setJob("Non-Govt-Job");
        jobYes.setVisibility(View.VISIBLE);
        jobNo.setVisibility(View.GONE);
        jobType.setText("Job marked as Non-Govt-Job");
    }

}