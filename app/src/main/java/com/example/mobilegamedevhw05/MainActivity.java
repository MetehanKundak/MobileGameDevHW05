package com.example.mobilegamedevhw05;
//METEHAN KUNDAK

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;


public class MainActivity extends AppCompatActivity {

    GoogleMap map;
    Button btnGetDirection;
    MarkerOptions place1, place2;
    Polyline currentPolyLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment frag = new MapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,frag).commit();

    }
}

     /*   btnGetDirection = findViewById(R.id.btnGetDirection);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.mapFrag);
        mapFragment.getMapAsync(this);

        place1 = new MarkerOptions().position(new LatLng(42.08995811748055, -75.97092185437832).title("Location 1"));
        place2 = new MarkerOptions().position(new LatLng(41.10710624802906, 29.016927094672752).title("Location 1"));

        String url = getUrl (place1.getPosition(),place2.getPosition(),"driving");
        new FetchURL(MapActivity.this).execute(getUrl(place1.getPosition(), place2.getPosition(), "driving"), "driving");

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

    }
    private String getUrl (LatLng origin, LatLng dest, String directionMode){

        String str_origin = "origin" + origin.latitude + "," + origin.longitude;
        String str_dest = "destination" + dest.latitude + ","+ dest.longitude;
        String mode = "mode" + directionMode;
        String parameters = str_origin + "&" + str_dest + "&" + mode;
        String output = "json";
        String url = "https://maps.googleapis.com/maps/api/directions/"+output+"?"+parameters+"&key="+getString(R.string.google_maps_key);
        return url;
    }


    @SuppressLint("RestrictedApi")
    @Override
    public void onTaskDone(Object... values) {
        Polyline currentPolyline = null;
        if (currentPolyline != null)
            currentPolyline.remove();
        GoogleMap mMap = null;
        currentPolyline = mMap.addPolyline((PolylineOptions) values[0]);
    }
}
*/