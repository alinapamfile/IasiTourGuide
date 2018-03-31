package com.example.android.iasitourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// Fragment that displays a list of churches that can be found in Iași, Romania.
public class ChurchesFragment extends Fragment {


    public ChurchesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create an array list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.drawable.churches_metropolitan_cathedral, R.string.churches_name_metropolitan_cathedral, R.string.churches_address_metropolitan_cathedral));
        attractions.add(new Attraction(R.drawable.churches_cetatuia_monastery, R.string.churches_name_cetatuia_monastery, R.string.churches_address_cetatuia_monastery));
        attractions.add(new Attraction(R.drawable.churches_golia_monastery, R.string.churches_name_golia_monastery, R.string.churches_address_golia_monastery));
        attractions.add(new Attraction(R.drawable.churches_trei_ierarhi_monastery, R.string.churches_name_trei_ierarhi_monastery, R.string.churches_address_trei_ierarhi_monastery));
        attractions.add(new Attraction(R.drawable.churches_galata_monastery, R.string.churches_name_galata_monastery, R.string.churches_address_galata_monastery));
        attractions.add(new Attraction(R.drawable.churches_barboi, R.string.churches_name_barboi, R.string.churches_address_barboi));
        attractions.add(new Attraction(R.drawable.churches_frumoasa_monastery, R.string.churches_name_frumoasa_monastery, R.string.churches_address_frumoasa_monastery));
        attractions.add(new Attraction(R.drawable.churches_armenian, R.string.churches_name_armenian, R.string.churches_address_armenian));

        // Create an AttractionAdapter, whose data source is a list of Attractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_churches);

        // Find the ListView object in the hierarchy of the Activity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above, so that the ListView display list items for each Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
