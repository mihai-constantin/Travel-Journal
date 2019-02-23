package com.mihaiconstantin.traveljournal.recyclerView;

public class Destination {

    private String mTime;
    private String mLocation;
    private String mURI;

    public Destination(String mTime, String mLocation, String mURI) {
        this.mTime = mTime;
        this.mLocation = mLocation;
        this.mURI = mURI;
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

    @Override
    public String toString() {
        return mTime + '\'' + mLocation;
    }
}
