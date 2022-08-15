package com.qtc.getloan;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


public class Home extends Fragment {

            Button
            loanAgentProperty,
            newHomeLoanBtn,
            transferExistingLoan;
            ImageView caseLoanBanner,
            personalLoanBanner,
            mutualFundBanner,
            homeLoanBanner;
            LinearLayout applyNow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

  View  view=inflater.inflate(R.layout.fragment_home,container,false);

  caseLoanBanner=view.findViewById(R.id.caseLoanBanner);
        caseLoanBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Loadads().interstitialAdLoad(getActivity());

                Intent i =new Intent(getActivity().getApplicationContext(),MainActivity2.class);
                i.putExtra("title","Cash Loan");
                getActivity().startActivity(i);
            }
        });

//        mutualFundBanner=view.findViewById(R.id.mutualFundBanner);
//        mutualFundBanner.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new Loadads().interstitialAdLoad(getActivity());
//                Intent i =new Intent(getActivity().getApplicationContext(),MainActivity2.class);
//                i.putExtra("title","Mutual Fund");
//                getActivity().startActivity(i);
//            }
//        });
        personalLoanBanner=view.findViewById(R.id.personalLoanBanner);
        personalLoanBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Loadads().interstitialAdLoad(getActivity());
                Intent i =new Intent(getActivity().getApplicationContext(),MainActivity2.class);
                i.putExtra("title","Personal Loan");
                getActivity().startActivity(i);
            }
        });
        homeLoanBanner=view.findViewById(R.id.homeLoanBanner);
        homeLoanBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Loadads().interstitialAdLoad(getActivity());
                Intent i =new Intent(getActivity().getApplicationContext(),MainActivity2.class);
                i.putExtra("title","Home Loan");
                getActivity().startActivity(i);
            }
        });
        loanAgentProperty=view.findViewById(R.id.loanAgentProperty);
        loanAgentProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Loadads().interstitialAdLoad(getActivity());
                Intent i =new Intent(getActivity().getApplicationContext(),MainActivity2.class);
                i.putExtra("title","Loan Agent Property");
                getActivity().startActivity(i);
            }
        });
        transferExistingLoan=view.findViewById(R.id.transferExistingLoan);
        transferExistingLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Loadads().interstitialAdLoad(getActivity());
                Intent i =new Intent(getActivity().getApplicationContext(),MainActivity2.class);
                i.putExtra("title","Transfer Existing Loan");
                getActivity().startActivity(i);
            }
        });
        newHomeLoanBtn=view.findViewById(R.id.newHomeLoanBtn);
        newHomeLoanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Loadads().interstitialAdLoad(getActivity());
                Intent i =new Intent(getActivity().getApplicationContext(),MainActivity2.class);
                i.putExtra("title","New Home Loan");
                getActivity().startActivity(i);
            }
        });

        applyNow=view.findViewById(R.id.applyNow);
        applyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Loadads().interstitialAdLoad(getActivity());
                Intent i =new Intent(getActivity().getApplicationContext(),MainActivity2.class);
                i.putExtra("title","Apply Now ");
                getActivity().startActivity(i);
            }
        });


new Loadads().adsBanner(view.findViewById(R.id.adView));
new Loadads().adsBanner(view.findViewById(R.id.adViewHome2));
new Loadads().adsBanner(view.findViewById(R.id.adViewStep4));
      //////////////////////////////////////////
        new Loadads().interstitialAdLoad(getActivity());

        return view;


    }





}