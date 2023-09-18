package com.example.milogin.ui.maps;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;


public class MapsFragmentViewModel extends AndroidViewModel {

    private Context context;
    private FusedLocationProviderClient fused;
    private MutableLiveData<Location> mlocation;

    public MapsFragmentViewModel(@NonNull Application application) {
        super(application);
        this.context = application;
        fused = LocationServices.getFusedLocationProviderClient(context);


    }

    private LiveData<Location> getMlocation() {
        if (mlocation == null) {
            mlocation = new MutableLiveData<>();

        }
        return mlocation;
    }

    public void obtieneUbica() {

        Log.d("salida", "hola mundo");

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Task<Location> tarea = fused.getLastLocation();
tarea.addOnSuccessListener((Activity) context, new OnSuccessListener<Location>() {
    @Override
    public void onSuccess(Location location) {
        mlocation.postValue(location);
    }
});
    }

};
