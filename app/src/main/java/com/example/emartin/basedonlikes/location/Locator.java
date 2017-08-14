package com.example.emartin.basedonlikes.location;

//Location
//   https://developer.android.com/guide/topics/location/index.html
//   https://developer.android.com/guide/topics/location/strategies.html
//https://developer.android.com/training/location/index.html
//https://developers.google.com/maps/documentation/android-api/

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//find people with similar interests within 1 mile radius
public class Locator extends AppCompatActivity{

    //get my location
    //use Android Network Location Provider over GPS

    // Acquire a reference to the system Location Manager
    LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
    // Define a listener that responds to location updates
    LocationListener locationListener = new LocationListener() {
        public void onLocationChanged(Location location) {
            // Called when a new location is found by the network location provider.
            //makeUseOfNewLocation(location); //do something here
        }
        public void onStatusChanged(String provider, int status, Bundle extras) {}
        public void onProviderEnabled(String provider) {}
        public void onProviderDisabled(String provider) {}
    };
    // Register the listener with the Location Manager to receive location updates
    String locationProvider = LocationManager.NETWORK_PROVIDER;
    //locationManager.requestLocationUpdates(locationProvider, 0, 0, locationListener); //or GPS_PROVIDER
    Location lastKnownLocation = locationManager.getLastKnownLocation(locationProvider);


    //get someone else's location?



}
