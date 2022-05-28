package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class Sightseeing extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sightseeing, container, false);
        ListView listView = view.findViewById(R.id.sightseeing_list_view);
        listView.setAdapter(new ListAdapter(getContext(), LocationData.getSightseeing()));
        return view;
    }
}