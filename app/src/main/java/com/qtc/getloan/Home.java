package com.qtc.getloan;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;




public class Home extends Fragment {

Button gettingStartBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view=inflater.inflate(R.layout.fragment_home,container,false);
        gettingStartBtn= view.findViewById(R.id.GettingStartBtn);
        gettingStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getActivity().getApplicationContext(),MainActivity2.class);
                getActivity().startActivity(i);
            }
        });



return view;


    }

}