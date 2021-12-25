package com.anmlumo.bioskoptask15;

public class BestMovie {
    private String name;
    private int imageResourceId;

    public static final BestMovie[] best={
            new BestMovie(horrorMovie.horror[0].getName(), horrorMovie.horror[0].getImageResourceId()),
            new BestMovie(AdventureMovie.adventure[0].getName(), AdventureMovie.adventure[0].getImageResourceId()),
            new BestMovie(ScifiMovie.scifi[0].getName(), ScifiMovie.scifi[0].getImageResourceId())
    };

    private BestMovie(String name, int imageResourceId){
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
