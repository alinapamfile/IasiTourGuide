package com.example.android.iasitourguide;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    /**
     * Resource ID for the background color for this list of attractions
     */
    private int mColorResourceId;

    /**
     * Create a new AttractionAdapter object.
     *
     * @param context         is the current context that the adapter is being created in.
     * @param attractions     is the list of Attractions to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of atractions.
     */
    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the Attraction object located at this position in the list.
        Attraction currentAttraction = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID attraction_image.
        ImageView attractionImageView = (ImageView) listItemView.findViewById(R.id.attraction_image);

        // Check if an image is provided for this attraction or not
        if (currentAttraction.hasImage())
            // If an image is available, display the provided image based on the resource ID
            attractionImageView.setImageResource(currentAttraction.getImageResourceID());
        else
            // Otherwise hide the ImageView
            attractionImageView.setVisibility(View.GONE);

        // Find the TextView in the list.item.xml layout with the ID attraction_name.
        TextView attractionTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the attraction's name from the currentAttraction object and set this text on the Attraction TextView.
        attractionTextView.setText(currentAttraction.getAttractionName());

        // Find the TextView in the list.item.xml layout with the ID attraction_address.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.attraction_address);
        // Get the attraction's address from the currentAttraction object and set this text on the Address TextView.
        addressTextView.setText(currentAttraction.getAddress());

        // Find the TextView in the list.item.xml layout with the ID attraction_phone.
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.attraction_phone);

        // Check if a phone number is provided for this attraction or not
        if (currentAttraction.hasPhoneNumber())
            // If a phone number is available, display the provided phone number based on the resource ID
            phoneTextView.setText(currentAttraction.getPhoneNumber());
        else
            // Otherwise hide the TextView
            phoneTextView.setVisibility(View.GONE);

        // Find the TextView in the list.item.xml layout with the ID attraction_website.
        TextView siteTextView = (TextView) listItemView.findViewById(R.id.attraction_website);

        // Check if a website is provided for this attraction or not
        if (currentAttraction.hasWebSite())
            // If a website is available, display the provided website based on the resource ID
            siteTextView.setText(currentAttraction.getWebSite());
        else
            // Otherwise hide the TextView
            siteTextView.setVisibility(View.GONE);

        // Find the text container View for the list
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout so that it can be shown in the ListView.
        return listItemView;
    }
}
