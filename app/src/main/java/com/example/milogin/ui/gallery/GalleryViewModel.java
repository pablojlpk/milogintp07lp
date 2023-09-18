package com.example.milogin.ui.gallery;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.jetbrains.annotations.NotNull;

public class GalleryViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;
private Context context;
private Intent intent;

    public GalleryViewModel(@NotNull Application application) {
        super(application);;
        mText = new MutableLiveData<>();
        //mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {

        if (mText == null) {
            mText = new MutableLiveData<>();
        }
        return mText;
    }

public void iniciarServicio(Context c){
         intent= new Intent(c, MiServicio.class);
        c.startService(intent);

}
public void detenerServicio( Context c) {




}

}