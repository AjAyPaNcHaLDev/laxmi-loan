package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        getSupportActionBar().setTitle("Categories");
        new Loadads().interstitialAdLoad(this);
        new Loadads().adsBanner(findViewById(R.id.adViewCatPage));

    }
    public void startLoanStep(View view) {
        parms.setVisit(false);
        Intent i=new Intent(Categories.this,MainActivity2.class);
        startActivity(i);

    }
//    public void startLoanStep(View view) {
//        if(parms.getName()==null||parms.getGender()==null||parms.getDob()==null){
//            Toast.makeText(getApplicationContext(),"please register first",Toast.LENGTH_LONG).show();
//            Intent i=new Intent(Categories.this,MainActivity2.class);
//            startActivity(i);
//return;
//        }
//        Intent i=new Intent(Categories.this,LoanStep1.class);
//        startActivity(i);
//    }

    public void studentLoan(View view) {
        parms.setVisit(false);
        startActivity(  new Intent(Categories.this,MainActivity2.class));
    }

    public void bankLoan(View view) {

        parms.setVisit(false);

        startActivity(  new Intent(Categories.this,MainActivity2.class));
    }

    public void insurance(View view) {
        new Loadads().interstitialAdLoad(this);
parms.setVisit(false);
        startActivity(  new Intent(Categories.this,MainActivity2.class));
    }
    public void others(View view) {
        new Loadads().interstitialAdLoad(this);
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://theinsuranceupdates.com"));
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        parms.setHome(true);
    }
}