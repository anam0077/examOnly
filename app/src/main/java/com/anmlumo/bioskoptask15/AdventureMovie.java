package com.anmlumo.bioskoptask15;

public class AdventureMovie {
    private String name;
    private int imageResourceId;

    public static final AdventureMovie[] adventure={
            new AdventureMovie("Journey to center of the earth", R.drawable.journey),
            new AdventureMovie("The Mummy return", R.drawable.mummy),
            new AdventureMovie("Jumanji 2", R.drawable.jumanji)
    };

    private AdventureMovie(String name, int imageResourceId){
        this.name=name;
        this.imageResourceId=imageResourceId;
    }

    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
}
