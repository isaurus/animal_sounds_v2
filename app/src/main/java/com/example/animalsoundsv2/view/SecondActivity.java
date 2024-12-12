package com.example.animalsoundsv2.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.animalsoundsv2.R;
import com.example.animalsoundsv2.controller.ImageController;
import com.example.animalsoundsv2.controller.SoundController;
import com.example.animalsoundsv2.controller.VideoController;

public class SecondActivity extends AppCompatActivity {

    private ImageController imgController;
    private SoundController sndController;
    private VideoController vdController;
    private Context ctx;
    private VideoView vwBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setSupportActionBar(findViewById(R.id.materialToolbar));

        initComponents();
    }

    public void initComponents(){
        imgController = new ImageController();
        sndController = new SoundController();
        vdController = new VideoController();
        ctx = this;
        vwBackground = findViewById(R.id.vwBackground);
        vwBackground.setVideoURI(Uri.parse("android.resource://" + getPackageName() + R.raw.background_video_ocean));
        vwBackground.start();
        vwBackground.setOnCompletionListener(v -> vwBackground.start());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        int rawMusicResourceId = 0;
        String videoPath = "";

        if(itemId == R.id.oceanAnimal){
            rawMusicResourceId = R.raw.background_music_ocean;
            videoPath = "android.resource://" + getPackageName() + R.raw.background_video_ocean;
        }else if(itemId == R.id.wildAnimal){
            rawMusicResourceId = R.raw.background_music_wild;
            videoPath = "android.resource://" + getPackageName() + R.raw.background_video_wild;
        }else if(itemId == R.id.itemLogout){
            finishAffinity();
        }

        if(rawMusicResourceId != 0){
            sndController.setBackgroundMusic(ctx, rawMusicResourceId);
            vdController.setBackgroundVideo(vwBackground, Uri.parse(videoPath));
        }

        return super.onOptionsItemSelected(item);
    }
}