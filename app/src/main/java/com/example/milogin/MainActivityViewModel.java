package com.example.milogin;

import static androidx.core.content.PermissionChecker.checkSelfPermission;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import android.Manifest;


public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<String> mutableIngreso;



    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();

    }

    public LiveData<String> getMutableIngreso() {
        if (mutableIngreso== null) {
            mutableIngreso = new MutableLiveData<>();
            ;
        }
        return mutableIngreso;
    }

    private Usuario usuariohard=new Usuario("admin","admin");

    public void solicitarPermiso(){

    }
    public void validarUsuario(String n, String p) {
        String cartel;
        if (usuariohard.getNomusu().equals(n) && usuariohard.getClave().equals(p)) {
            Intent intent = new Intent(context, MainActivitymenu.class);
            intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
            cartel="";
        } else {
            cartel="USUARIO Y/O CONTRASEÑA INCORRECTA; REINTENTE";
        }

        mutableIngreso.setValue(cartel);
    }
}