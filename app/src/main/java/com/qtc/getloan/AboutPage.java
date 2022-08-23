package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);
        new Loadads().interstitialAdLoad(this);
        new Loadads().adsBanner(findViewById(R.id.adViewAbout));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        parms.setHome(true);
    }
}