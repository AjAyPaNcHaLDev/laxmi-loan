package com.qtc.getloan;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class Loadads extends AppCompatActivity {
    public  static InterstitialAd mInterstitialAd;
    public static AdView adView;
   public static  AdRequest adRequest ;
    public  void interstitialAdLoad(Activity activity) {

        adRequest = new AdRequest.Builder().build();
//
//
        InterstitialAd.load(activity, "ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show((activity));
                        Log.i("AJAY", "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d("AJAY", loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });


    }


    public <T extends View> void adsBanner(T viewById) {
        Loadads.adView = (AdView) viewById;
//        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        Loadads.adRequest= new AdRequest.Builder().build();
        Loadads.adView.loadAd(Loadads.adRequest);
    }
}
