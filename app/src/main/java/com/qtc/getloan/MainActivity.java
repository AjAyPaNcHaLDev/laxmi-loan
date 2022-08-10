package com.qtc.getloan;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    LinearLayout subMenu;
    LinearLayout permissionPopUp;
    LinearLayout letStartPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        subMenu=findViewById(R.id.subMenu);
permissionPopUp=findViewById(R.id.permissionPopUp);


        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Home()).commit();
       bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                switch (item.getItemId()) {
                    case R.id.page_1:
                        fragment = new Home();
                        subMenu.setVisibility(View.GONE);
                        break;
                    case R.id.page_2:
                        subMenu.setVisibility(View.GONE);
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://theinsuranceupdates.com"));
                        startActivity(i);
                        return false;
                    case R.id.page_3:

                        return false;
                    case R.id.page_4:
                        openSubMenu();
                        return true;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                return true;
            }
        });


    }
    private void openSubMenu() {


        if(subMenu.getVisibility()== View.VISIBLE)
            subMenu.setVisibility(View.GONE);
        else
            subMenu.setVisibility(View.VISIBLE);


    }


    public void welcomeHandler(View view) {
permissionPopUp.setVisibility(View.GONE);
letStartPopup.setVisibility(View.VISIBLE);
    }

    public void letStartHandler(View view) {
        permissionPopUp.setVisibility(View.GONE);
        letStartPopup.setVisibility(View.GONE);
    }
}