package com.mihaiconstantin.traveljournal.recyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mihaiconstantin.traveljournal.R;

import java.util.ArrayList;
import java.util.List;

public class FavouriteRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewFavouriteDestinations;
    private List<Destination> mFavouriteDestinations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_recycler_view);

        // get recycler view from xml file
        mRecyclerViewFavouriteDestinations = findViewById(R.id.recyclerViewFavouriteDestinations);

        // define and set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewFavouriteDestinations.setLayoutManager(layoutManager);

        // get data source
        mFavouriteDestinations = getDestinations();

        // get the adaptor instance
        DestinationsAdaptor destinationsAdaptor = new DestinationsAdaptor(mFavouriteDestinations);

        // set the adaptor to the recycler view
        mRecyclerViewFavouriteDestinations.setAdapter(destinationsAdaptor);
    }

    private List<Destination> getDestinations() {
        List<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination("Spring 2016", "Bali", "https://i.imgur.com/FXdj1On.jpg"));
        destinations.add(new Destination("Summer 2016", "London", "https://i.imgur.com/epL9ABv.jpg"));
        destinations.add(new Destination("Fall 2016", "Rome", "https://i.imgur.com/8yBG7xw.jpg"));
        destinations.add(new Destination("Winter 2016", "Paris", "https://i.imgur.com/jgRVgtk.jpg"));

        return destinations;
    }
}
