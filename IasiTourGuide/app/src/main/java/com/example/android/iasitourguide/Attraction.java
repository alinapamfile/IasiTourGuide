package com.example.android.iasitourguide;


public class Attraction {

    /* String resource ID for the attraction's name */
    private int mAttractionNameResourceID;

    /* String resource ID for the attraction's address */
    private int mAddressResourceID;

    /* String resource ID for the attraction's phone number */
    private int mPhoneNumberResourceID = -1;

    /* String resource ID for the attraction's website */
    private int mWebSiteResourceID = -1;

    /* Image resource ID for the attraction */
    private int mImageResourceID = -1;

    /**
     * Create a new Attraction object (with image, name, address, phone number and website).
     *
     * @param imageResourceID          is the drawable resource ID for the image associated with the attraction
     * @param attractionNameResourceID is the string resource ID for the attraction's name
     * @param addressResourceID        is the string resource ID for the attraction's address
     * @param phoneNumberResourceID    is the string resource ID for the attraction's phone number
     * @param webSiteResourceID        is the string resource ID for the atraction's website
     */
    public Attraction(int imageResourceID, int attractionNameResourceID, int addressResourceID, int phoneNumberResourceID, int webSiteResourceID) {
        mImageResourceID = imageResourceID;
        mAttractionNameResourceID = attractionNameResourceID;
        mAddressResourceID = addressResourceID;
        mPhoneNumberResourceID = phoneNumberResourceID;
        mWebSiteResourceID = webSiteResourceID;
    }

    /**
     * Create a new Attraction object (with name and address).
     *
     * @param attractionNameResourceID is the string resource ID for the attraction's name
     * @param addressResourceID        is the string resource ID for the attraction's address
     */
    public Attraction(int attractionNameResourceID, int addressResourceID) {
        mAttractionNameResourceID = attractionNameResourceID;
        mAddressResourceID = addressResourceID;
    }

    /**
     * Create a new Attraction object (with image, name and address).
     *
     * @param imageResourceID          is the drawable resource ID for the image associated with the attraction
     * @param attractionNameResourceID is the string resource ID for the attraction's name
     * @param addressResourceID        is the string resource ID for the attraction's address
     */
    public Attraction(int imageResourceID, int attractionNameResourceID, int addressResourceID) {
        mImageResourceID = imageResourceID;
        mAttractionNameResourceID = attractionNameResourceID;
        mAddressResourceID = addressResourceID;
    }

    /* Return the image resource ID of the attraction */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /* Get the string resource ID for the attraction's name */
    public int getAttractionName() {
        return mAttractionNameResourceID;
    }

    /*Get the string resource ID for the attraction's address */
    public int getAddress() {
        return mAddressResourceID;
    }

    /*Get the string resource ID for the attraction's phone number */
    public int getPhoneNumber() {
        return mPhoneNumberResourceID;
    }

    /*Get the string resource ID for the attraction's website */
    public int getWebSite() {
        return mWebSiteResourceID;
    }

    /* Return whether or not there is an image for this attraction. */
    public boolean hasImage() {
        return mImageResourceID != -1;
    }

    /* Return whether or not there is a phone number for this attraction. */
    public boolean hasPhoneNumber() {
        return mPhoneNumberResourceID != -1;
    }

    /* Return whether or not there is a website for this attraction. */
    public boolean hasWebSite() {
        return mWebSiteResourceID != -1;
    }

}
