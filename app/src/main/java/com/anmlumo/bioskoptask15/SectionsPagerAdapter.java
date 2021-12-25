package com.anmlumo.bioskoptask15;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new TopFragment();
            case 1:
                return new HorrorFragment();
            case 2:
                return new AdventureFragment();
            case 3:
                return new ScifiFragment();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch(position) {

            case 0 :
                return "home";
            case 1:
                return "Horror";
            case 2:
                return "adventure";
            case 3:
                return "sci-fi";
        }
            return null;
    }


}
