package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        getSupportActionBar().setTitle("Categories");
    }

    public void startLoanStep(View view) {
        if(parms.getName()==null||parms.getGender()==null||parms.getDob()==null){
            Toast.makeText(getApplicationContext(),"please register first",Toast.LENGTH_LONG).show();
            Intent i=new Intent(Categories.this,MainActivity2.class);
            startActivity(i);
return;
        }
        Intent i=new Intent(Categories.this,LoanStep1.class);
        startActivity(i);
    }
}