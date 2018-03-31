package com.example.android.iasitourguide;


import android.os.Bundle;
import android.provider.Telephony;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// Fragment that displays a list of hotels that can be found in Iași, Romania.
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create an array list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.drawable.hotel_continental, R.string.hotel_name_continental, R.string.hotel_address_continental, R.string.hotel_phone_continental,
                R.string.hotel_site_continental));
        attractions.add(new Attraction(R.drawable.hotel_international, R.string.hotel_name_international, R.string.hotel_address_international, R.string.hotel_phone_international,
                R.string.hotel_site_international));
        attractions.add(new Attraction(R.drawable.hotel_moldova, R.string.hotel_name_moldova, R.string.hotel_address_moldova, R.string.hotel_phone_moldova,
                R.string.hotel_site_moldova));
        attractions.add(new Attraction(R.drawable.hotel_select, R.string.hotel_name_select, R.string.hotel_address_select, R.string.hotel_phone_select,
                R.string.hotel_site_select));
        attractions.add(new Attraction(R.drawable.hotel_zimbru, R.string.hotel_name_zimbru, R.string.hotel_address_zimbru, R.string.hotel_phone_zimbru,
                R.string.hotel_site_zimbru));
        attractions.add(new Attraction(R.drawable.hotel_traian, R.string.hotel_name_traian, R.string.hotel_address_traian, R.string.hotel_phone_traian,
                R.string.hotel_site_traian));
        attractions.add(new Attraction(R.drawable.hotel_dorobanti, R.string.hotel_name_dorobanti, R.string.hotel_address_dorobanti, R.string.hotel_phone_dorobanti,
                R.string.hotel_site_dorobanti));
        attractions.add(new Attraction(R.drawable.hotel_tudor, R.string.hotel_name_tudor, R.string.hotel_address_tudor, R.string.hotel_phone_tudor,
                R.string.hotel_site_tudor));
        attractions.add(new Attraction(R.drawable.hotel_indiana, R.string.hotel_name_indiana, R.string.hotel_address_indiana, R.string.hotel_phone_indiana,
                R.string.hotel_site_indiana));
        attractions.add(new Attraction(R.drawable.hotel_hampton, R.string.hotel_name_hampton, R.string.hotel_address_hampton, R.string.hotel_phone_hampton,
                R.string.hotel_site_hampton));

        // Create an AttractionAdapter, whose data source is a list of Attractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_hotels);

        // Find the ListView object in the hierarchy of the Activity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above, so that the ListView display list items for each Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
