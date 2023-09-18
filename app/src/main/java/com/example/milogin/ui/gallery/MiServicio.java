package com.example.milogin.ui.gallery;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import com.example.milogin.R;

public class MiServicio extends Service {
    private MediaPlayer mp;
    public MiServicio() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mp=MediaPlayer.create(this, R.raw.musica_4_3);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp.start();


        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }
}