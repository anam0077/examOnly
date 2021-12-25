package com.anmlumo.bioskoptask15;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AdventureFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AdventureFragment extends Fragment{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AdventureFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AdventureFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AdventureFragment newInstance(String param1, String param2) {
        AdventureFragment fragment = new AdventureFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        RecyclerView adventureRecycler=(RecyclerView) inflater.inflate(R.layout.fragment_adventure,container,false);
        String[] adventureName=new String[AdventureMovie.adventure.length];
        for(int i = 0; i < adventureName.length; i++) {
            adventureName[i] = AdventureMovie.adventure[i].getName();
        }

        int[] adventureImage=new int[AdventureMovie.adventure.length];
        for(int i=0; i<adventureImage.length;i++){
            adventureImage[i]=AdventureMovie.adventure[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter=new CaptionedImagesAdapter(adventureName,adventureImage);
        adventureRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager=new GridLayoutManager(getActivity(),2);
        adventureRecycler.setLayoutManager(layoutManager);
        return adventureRecycler;
    }
}