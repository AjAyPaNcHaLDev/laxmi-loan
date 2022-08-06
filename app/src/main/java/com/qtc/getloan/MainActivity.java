package com.qtc.getloan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.qtc.getloan.fragments.Fragment1;
import com.qtc.getloan.fragments.Fragment2;
import com.qtc.getloan.fragments.Fragment3;


public class MainActivity extends AppCompatActivity {
//Button gettingStartBtn;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Fragment1()).commit();

//        gettingStartBtn=findViewById(R.id.GettingStartBtn);
//        gettingStartBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//Intent i =new Intent(MainActivity.this, AdsActivity.class);
//startActivity(i);
//
//            }
//        });
        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Fragment fragment=null;
                 switch (item.getItemId()){
                     case R.id.page_1:
                         fragment=new Fragment1();

                         break;

                         case R.id.page_2:
                             fragment=new Fragment2();
                         break;

                         case R.id.page_3:
                             fragment=new Fragment3();
                         break;


                 }
                 getSupportFragmentManager().beginTransaction().replace(R.id.bottom_navigation,fragment).commit();
            }
        });



    }
}