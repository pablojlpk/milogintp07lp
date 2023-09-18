package com.example.milogin.ui.maps;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.maps.GoogleMap;

public class MapsFragmentViewM extends AndroidViewModel {
    private Context context;
    //private MutableLiveData <String> cadea

    public MapsFragmentViewM(@NonNull Application application) {
        super(application);
        this.context=application;


    }
}
