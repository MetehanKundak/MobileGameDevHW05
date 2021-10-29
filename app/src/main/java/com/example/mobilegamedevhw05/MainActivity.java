package com.example.mobilegamedevhw05;
//METEHAN KUNDAK
import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;


public class MainActivity extends AppCompatActivity {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}