package com.example.animalsoundsv2.view;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.animalsoundsv2.R;
import com.example.animalsoundsv2.controller.ImageController;
import com.example.animalsoundsv2.controller.SoundController;

public class SecondActivity extends AppCompatActivity {

    private ImageController imgController;
    private SoundController sndController;
    private Context ctx;

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
        ctx = getApplicationContext();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String itemName = item.getTitle().toString();
        switch (itemName){
            case "Wild":
                sndController.setBackgroundMusic(ctx, itemName);
            case "Ocean":
                sndController.setBackgroundMusic(ctx, itemName);
            case "Logout":
                finishAffinity();
        }

        return super.onOptionsItemSelected(item);
    }
}