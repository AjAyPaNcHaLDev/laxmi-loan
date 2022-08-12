package com.qtc.getloan;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    LinearLayout subMenu;
    Dialog permissionDialog;
    CheckBox permissionCheckBox;
    Dialog  letStartDialog;
    Button terms_and_conditions;

    boolean permission=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Home()).commit();
        subMenu=findViewById(R.id.subMenu);


        //        bootom navbar setup
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
Intent j=new Intent(MainActivity.this,Categories.class);
startActivity(j);
                        return false;
                    case R.id.page_4:
                        openSubMenu();
                        return true;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                return true;
            }
        });

        welcomeDialogs();
    }



    private void welcomeDialogs(){
    //Dialogs setup start


    terms_and_conditions=findViewById(R.id.terms_and_conditions);
    permissionDialog=new Dialog(MainActivity.this);
    permissionDialog.getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.card_backgr));
    permissionDialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
    permissionDialog.setCancelable(false);
    permissionDialog.setContentView(R.layout.permissionlayout);
    permissionDialog.show();
    letStartDialog=new Dialog(MainActivity.this);
    letStartDialog.getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.card_backgr));
    letStartDialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
    letStartDialog.setContentView(R.layout.lat_start_layout);
    permissionCheckBox=findViewById(R.id.permissionCheckBox);
    //Dialogs setup end
}
    private void openSubMenu() {

        if(subMenu.getVisibility()== View.VISIBLE)
            subMenu.setVisibility(View.GONE);
        else
            subMenu.setVisibility(View.VISIBLE);

    }



    public void clickAgree(View view) {

if(permission==true){
    permissionDialog.dismiss();
    letStartDialog.show();
}else

    Toast.makeText(MainActivity.this," please click to checkbox",Toast.LENGTH_LONG).show();

    }
    public void clickLetStart(View view) {
                letStartDialog.dismiss();

    }

    public void isCheckedPermission(View view) {
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked())
            permission=true;
        else
            permission=false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}