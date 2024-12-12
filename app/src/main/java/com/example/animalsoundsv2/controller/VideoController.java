package com.example.animalsoundsv2.controller;

import android.net.Uri;
import android.view.MenuItem;
import android.widget.VideoView;

import com.example.animalsoundsv2.R;

public class VideoController {

    public VideoController(){}

    public void setBackgroundVideo(VideoView vwBackground, Uri uri){
        vwBackground.setVideoURI(uri);
        vwBackground.start();
        vwBackground.setOnCompletionListener(v -> vwBackground.start());
    }
}
