package com.anmlumo.bioskoptask15;

public class ScifiMovie {
    private String name;
    private int imageResourceId;

    public static final ScifiMovie[] scifi={
            new ScifiMovie("The Matrix Resurrections", R.drawable.matrix),
            new ScifiMovie("Starwars skywalker", R.drawable.starwars),
            new ScifiMovie("The Avatar", R.drawable.avatar)
    };

    private ScifiMovie(String name, int imageResourceId){
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

