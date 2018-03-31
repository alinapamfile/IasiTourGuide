package com.example.android.iasitourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// Fragment that displays a list of parks that can be found in Iași, Romania.
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create an array list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.string.park_name_copou, R.string.park_address_copou));
        attractions.add(new Attraction(R.string.park_name_botanical_garden, R.string.park_address_botanical_garden));
        attractions.add(new Attraction(R.string.park_name_palas, R.string.park_address_palas));
        attractions.add(new Attraction(R.string.park_name_exhibition, R.string.park_address_exhibition));
        attractions.add(new Attraction(R.string.park_name_tatarasi, R.string.park_address_tatarasi));

        // Create an AttractionAdapter, whose data source is a list of Attractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_parks);

        // Find the ListView object in the hierarchy of the Activity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above, so that the ListView display list items for each Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
