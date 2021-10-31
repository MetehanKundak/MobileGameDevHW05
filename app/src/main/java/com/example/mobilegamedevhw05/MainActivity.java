package com.example.mobilegamedevhw05;
//METEHAN KUNDAK
import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;


public class MainActivity extends AppCompatActivity {

    GoogleMap map;
    Button btnGetDirection;
    MarkerOptions place1 , place2;
    Polyline currentPolyLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGetDirection = findViewById(R.id.btnGetDirection);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.mapFrag);
        mapFragment.getMapAsync((OnMapReadyCallback) this);

        place1 = new MarkerOptions().position(new LatLng(42.08995811748055, -75.97092185437832).title("Location 1"));
        place1 = new MarkerOptions().position(new LatLng(41.10710624802906, 29.016927094672752).title("Location 1"));



    }
    @Override
    public void onMapReady (GoogleMap googleMap){
        map = googleMap;

    }



}