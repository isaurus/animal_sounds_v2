package com.example.animalsoundsv2.controller;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.SoundPool;

import com.example.animalsoundsv2.R;

public class SoundController {

    private final String URL_BACKGROUND_MUSIC = "https://www.youtube.com/watch?v=DrIyzCzIwTc";
    private MediaPlayer mp;
    private SoundPool spl;

    public SoundController(){}

    public void setMainBackgroundMusic(Context ctx){
        mp = MediaPlayer.create(ctx, R.raw.background_music_main);
        mp.setLooping(true);
        mp.start();
    }

    public void setBackgroundMusic(Context ctx, String category){
        switch (category){
            case "Main":
                mp = MediaPlayer.create(ctx, R.raw.background_music_main);
            case "Wild":
                mp.stop();
                mp.release();
                mp = MediaPlayer.create(ctx, R.raw.background_music_wild);
                mp.setLooping(true);
                mp.start();
                break;
            case "Ocean":
                mp.stop();
                mp.release();
                mp = MediaPlayer.create(ctx, R.raw.background_music_ocean);
                mp.setLooping(true);
                mp.start();
                break;
        }
    }
}
