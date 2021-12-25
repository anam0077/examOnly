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
 * Use the {@link HorrorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HorrorFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HorrorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HorrorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HorrorFragment newInstance(String param1, String param2) {
        HorrorFragment fragment = new HorrorFragment();
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

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//        inflater.getContext(),
//                android.R.layout.simple_list_item_1,
//                getResources().getStringArray(R.array.horror));
//        setListAdapter(adapter);
//        return super.onCreateView(inflater, container, savedInstanceState);

        RecyclerView horrorRecycler=(RecyclerView) inflater.inflate(R.layout.fragment_horror,container,false);
        String[] horrorName=new String[horrorMovie.horror.length];
        for(int i=0; i<horrorName.length; i++){
            horrorName[i]=horrorMovie.horror[i].getName();
        }

        int[] horrorImage=new int[horrorMovie.horror.length];
        for(int i=0; i<horrorImage.length;i++){
            horrorImage[i]=horrorMovie.horror[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter=new CaptionedImagesAdapter(horrorName,horrorImage);
        horrorRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager=new GridLayoutManager(getActivity(),2);
        horrorRecycler.setLayoutManager(layoutManager);
        return horrorRecycler;
    }
}