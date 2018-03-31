package com.example.android.iasitourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// Fragment that displays a list of restaurants that can be found in Iași, Romania.
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create an array list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.drawable.restaurant_traian, R.string.restaurant_name_traian, R.string.hotel_address_traian, R.string.hotel_phone_traian,
                R.string.hotel_site_traian));
        attractions.add(new Attraction(R.drawable.restaurant_la_castel, R.string.restaurant_name_la_castel, R.string.restaurant_address_la_castel,
                R.string.restaurant_phone_la_castel, R.string.restaurant_site_la_castel));
        attractions.add(new Attraction(R.drawable.restaurant_panoramic, R.string.restaurant_name_panoramic, R.string.restaurant_address_panoramic,
                R.string.restaurant_phone_panoramic, R.string.restaurant_site_panoramic));
        attractions.add(new Attraction(R.drawable.restaurant_pizzeria_domneasca, R.string.restaurant_name_pizzeria, R.string.restaurant_address_pizzeria,
                R.string.restaurant_phone_pizzeria, R.string.restaurant_site_pizzeria));
        attractions.add(new Attraction(R.drawable.restaurant_dopo_poco, R.string.restaurant_name_doco_poco, R.string.restaurant_address_doco_poco,
                R.string.restaurant_phone_doco_poco, R.string.restaurant_site_doco_poco));
        attractions.add(new Attraction(R.drawable.restaurant_ristretto, R.string.restaurant_name_ristretto, R.string.restaurant_address_ristretto,
                R.string.restaurant_phone_ristretto, R.string.restaurant_site_ristretto));
        attractions.add(new Attraction(R.drawable.restaurant_tirol, R.string.restaurant_name_tirol, R.string.restaurant_address_tirol, R.string.restaurant_phone_tirol,
                R.string.restaurant_site_tirol));
        attractions.add(new Attraction(R.drawable.restaurant_oscar, R.string.restaurant_name_oscar, R.string.restaurant_address_oscar, R.string.restaurant_phone_oscar,
                R.string.restaurant_site_oscar));
        attractions.add(new Attraction(R.drawable.restaurant_cuib, R.string.restaurant_name_in_cuib, R.string.restaurant_address_in_cuib, R.string.restaurant_phone_in_cuib,
                R.string.restaurant_site_in_cuib));
        attractions.add(new Attraction(R.drawable.restaurant_buena_vista, R.string.restaurant_name_buena_vista, R.string.restaurant_address_buena_vista,
                R.string.restaurant_phone_buena_vista, R.string.restaurant_site_buena_vista));

        // Create an AttractionAdapter, whose data source is a list of Attractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_restaurants);

        // Find the ListView object in the hierarchy of the Activity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above, so that the ListView display list items for each Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
