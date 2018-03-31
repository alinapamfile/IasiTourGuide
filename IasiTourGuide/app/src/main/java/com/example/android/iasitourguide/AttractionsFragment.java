package com.example.android.iasitourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// Fragment that displays a list of attractions that can be found in Iași, Romania.
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create an array list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.drawable.attractions_palace_of_culture, R.string.attractions_name_palace_of_culture, R.string.attractions_address_palace_of_culture,
                R.string.attractions_phone_palace_of_culture, R.string.attractions_site_palace_of_culture));
        attractions.add(new Attraction(R.drawable.attractions_eminescu_tree, R.string.attractions_name_eminescu_tree, R.string.attractions_address_eminescu_tree));
        attractions.add(new Attraction(R.drawable.attractions_uaic, R.string.attractions_name_uaic, R.string.attractions_address_uaic, R.string.attractions_phone_uaic,
                R.string.attractions_site_uaic));
        attractions.add(new Attraction(R.drawable.attractions_national_theatre, R.string.attractions_name_national_theatre, R.string.attractions_address_national_theatre,
                R.string.attractions_phone_national_theatre, R.string.attractions_site_national_theatre));
        attractions.add(new Attraction(R.drawable.attractions_roznovanu_palace, R.string.attractions_name_roznovanu_palace, R.string.attractions_address_roznovanu_palace));
        attractions.add(new Attraction(R.drawable.attractions_union_museum, R.string.attractions_name_union_museum, R.string.attractions_address_union_museum, R.string.attractions_phone_union_museum,
                R.string.attractions_site_union_museum));
        attractions.add(new Attraction(R.drawable.attractions_literature_museum, R.string.attractions_name_literature_museum, R.string.attractions_address_literature_museum));
        attractions.add(new Attraction(R.drawable.attractions_ion_creanga_museum, R.string.attractions_name_ion_creanga, R.string.attractions_address_ion_creanga));
        attractions.add(new Attraction(R.drawable.attractions_frescoes_gallery, R.string.attractions_name_frescoes_gallery, R.string.attractions_address_frescoes_gallery));
        attractions.add(new Attraction(R.drawable.attractions_independence_monument, R.string.attractions_name_independence_monument, R.string.attractions_address_independence_monument));

        // Create an AttractionAdapter, whose data source is a list of Attractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_attractions);

        // Find the ListView object in the hierarchy of the Activity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above, so that the ListView display list items for each Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
