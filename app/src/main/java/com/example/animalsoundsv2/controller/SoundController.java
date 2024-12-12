package com.example.animalsoundsv2.controller;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.SoundPool;

import com.example.animalsoundsv2.R;

public class SoundController {


    private MediaPlayer mp;
    private SoundPool spl;

    public SoundController(){}

    public void setBackgroundMusic(Context ctx, int resId){
        if (mp != null){
            mp.stop();
            mp.release();
            mp = null;
        }

        mp = MediaPlayer.create(ctx, resId);
        mp.setLooping(true);
        mp.start();
    }

    public void stopMusic() {
        if (mp != null && mp.isPlaying()) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
