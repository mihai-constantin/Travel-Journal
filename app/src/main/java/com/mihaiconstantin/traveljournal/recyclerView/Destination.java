package com.mihaiconstantin.traveljournal.recyclerView;

public class Destination {

    private String mTime;
    private String mLocation;
    private String mURI;
    private String mRating;

    public Destination(String mTime, String mLocation, String mURI, String mRating) {
        this.mTime = mTime;
        this.mLocation = mLocation;
        this.mURI = mURI;
        this.mRating = mRating;
    }

    public String getTime() {
        return mTime;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getURI() {
        return mURI;
    }

    public String getRating() {
        return mRating;
    }

    @Override
    public String toString() {
        return mTime + '\'' + mLocation;
    }
}
