package com.example.animalsoundsv2.view;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animalsoundsv2.R;
import com.example.animalsoundsv2.controller.ImageController;
import com.example.animalsoundsv2.controller.SoundController;

public class MainActivity extends AppCompatActivity {

    private ImageController imgController;
    private SoundController sndController;
    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    public void initComponents(){

        ImageView imgBackground = findViewById(R.id.imgBackground);
        ImageView imgPlay = findViewById(R.id.imgPlay);
        imgController = new ImageController();
        sndController = new SoundController();
        ctx = getApplicationContext();

        imgController.setMainBackgroundImage(imgBackground);
        //sndController.setMainBackgroundMusic(ctx);
        sndController.setBackgroundMusic(ctx, "Main");

        imgPlay.setOnClickListener(v -> startActivity(imgController.getSecondActivityIntent(ctx)));
    }
}