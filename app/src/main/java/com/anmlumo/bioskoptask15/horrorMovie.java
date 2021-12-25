package com.anmlumo.bioskoptask15;

public class horrorMovie {

    private String name;
    private int imageResourceId;

    public static final horrorMovie[] horror={
            new horrorMovie("Conjuring 2", R.drawable.conjuring2),
            new horrorMovie("Halloween", R.drawable.halloween1),
            new horrorMovie("Heir", R.drawable.heir)
    };

    private horrorMovie(String name, int imageResourceId){
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
