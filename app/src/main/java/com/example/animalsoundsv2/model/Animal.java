package com.example.animalsoundsv2.model;

public class Animal {

    private int drawableImageResource;
    private int drawableSoundResource;

    public Animal(){}

    public Animal(int drawableImageResource, int drawableSoundResource){
        setDrawableImageResource(drawableImageResource);
        setDrawableSoundResource(drawableSoundResource);
    }

    public int getDrawableImageResource() {
        return drawableImageResource;
    }

    public void setDrawableImageResource(int drawableImageResource) {
        this.drawableImageResource = drawableImageResource;
    }

    public int getDrawableSoundResource() {
        return drawableSoundResource;
    }

    public void setDrawableSoundResource(int drawableSoundResource) {
        this.drawableSoundResource = drawableSoundResource;
    }
}
