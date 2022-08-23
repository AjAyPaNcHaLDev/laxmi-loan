package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoanStep1 extends AppCompatActivity {
EditText inp_amount    ,inp_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_step1);
        new Loadads().interstitialAdLoad(this);
        new Loadads().adsBanner(findViewById(R.id.adViewStep1));
        inp_amount=findViewById(R.id.inp_amount);
                inp_time=findViewById(R.id.inp_time);
    if(parms.getAmount()!=null&& parms.getTime()!=null){
        inp_amount.setText(parms.getAmount());
                inp_time.setText(parms.getTime());
        }

    }

    public void sendToLoanStep2(View view) {

//        if(!inp_amount.getText().toString().isEmpty()&& !inp_time.getText().toString().isEmpty()){
            parms.setAmount( inp_amount.getText().toString());
            parms.setTime(inp_time.getText().toString());
            startActivity(  new Intent(LoanStep1.this,LoanStep2.class));


//        }
//        else{
//            Toast.makeText(getApplicationContext(),"please fill field",Toast.LENGTH_LONG).show();
//        }

    }

    public void back(View view) {
//        Intent i=new Intent(LoanStep1.this,Categories.class);
//        startActivity(i);
        finish();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        parms.setHome(true);
    }
}