package com.example.milogin.ui.home;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

public class HomeViewModel extends AndroidViewModel {
    private MutableLiveData<String> mText;
//private Context context;
    private Context context;
    public HomeViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }


        public void llamar(String nrotel,Context context) {
//        context.startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:123")));

            if (nrotel.length()==0){
                mText.setValue("DEBE INGRESAR UN NUMERO");
            } else {
                Intent in= new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse(("tel:"+nrotel)));
                in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(in);



                mText.setValue("");
            }
        }

}

