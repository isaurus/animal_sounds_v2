package com.example.animalsoundsv2.controller;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.animalsoundsv2.R;
import com.example.animalsoundsv2.model.Animal;
import com.example.animalsoundsv2.view.SecondActivity;

import java.util.ArrayList;
import java.util.List;

public class ImageController {

    private List<Animal> animalList;
    private Animal animal;

    public ImageController(){
        this.animalList = new ArrayList<>();
    }

    public void setMainBackgroundImage(ImageView imageView){
        Glide.with(imageView)
                .load(R.drawable.background_main)
                .centerInside()
                .into(imageView);
    }

    public Intent getSecondActivityIntent(Context ctx){
        Intent i = new Intent(ctx, SecondActivity.class);
        return i;
    }
}
