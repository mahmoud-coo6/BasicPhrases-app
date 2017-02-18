package com.example2.acer.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttomTapped(View view){
        int id=view.getId();
        String ourId="";
        ourId = view.getResources().getResourceEntryName(id);
        int resourceId=getResources().getIdentifier(ourId, "raw","com.example2.acer.basicphrases");
        MediaPlayer mediaPlayer=MediaPlayer.create(this,resourceId);
        mediaPlayer.start();
        Log.i("buttom tapped ",ourId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
