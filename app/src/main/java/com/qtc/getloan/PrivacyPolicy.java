package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PrivacyPolicy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        new Loadads().interstitialAdLoad(this);
        new Loadads().adsBanner(findViewById(R.id.adViewPriv));
        new Loadads().adsBanner(findViewById(R.id.adViewPriv2));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        parms.setHome(true);
    }
}