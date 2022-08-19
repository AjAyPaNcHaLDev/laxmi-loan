package com.qtc.getloan;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class Loadads extends AppCompatActivity {
    public  static InterstitialAd mInterstitialAd;
    public static AdView adView;
   public static  AdRequest adRequest ;
    private AlertDialog dialog;
    public  void interstitialAdLoad(Activity activity) {
        adRequest = new AdRequest.Builder().build();
  InterstitialAd.load(activity, "ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
//                        dotLoading.hide();
                         mInterstitialAd = interstitialAd;
                        mInterstitialAd.show((activity));
                        dismissdialog();
                        Log.i("AJAY", "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d("AJAY", loadAdError.toString());
                        mInterstitialAd = null;
                        dismissdialog();
                    }

                });

        startLoadingdialog(activity);
    }
    @SuppressLint("InflateParams")
    void startLoadingdialog(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dot_loader, null));
        builder.setCancelable(true);
        dialog = builder.create();
        dialog.show();
    }
    void dismissdialog() {
        dialog.dismiss();
    }

    public <T extends View> void adsBanner(T viewById) {
        Loadads.adView = (AdView) viewById;
//        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        Loadads.adRequest= new AdRequest.Builder().build();
        Loadads.adView.loadAd(Loadads.adRequest);
    }
}
