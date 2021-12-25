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
 * Use the {@link ScifiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScifiFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ScifiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScifiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScifiFragment newInstance(String param1, String param2) {
        ScifiFragment fragment = new ScifiFragment();
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
        RecyclerView scifiRecycler=(RecyclerView) inflater.inflate(R.layout.fragment_scifi,container,false);
        String[] scifiName=new String[ScifiMovie.scifi.length];
        for(int i = 0; i < scifiName.length; i++) {
            scifiName[i] = ScifiMovie.scifi[i].getName();
        }

        int[] scifiImage=new int[ScifiMovie.scifi.length];
        for(int i=0; i<scifiImage.length;i++){
            scifiImage[i]=ScifiMovie.scifi[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter=new CaptionedImagesAdapter(scifiName,scifiImage);
        scifiRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager=new GridLayoutManager(getActivity(),2);
        scifiRecycler.setLayoutManager(layoutManager);
        return scifiRecycler;
    }
}