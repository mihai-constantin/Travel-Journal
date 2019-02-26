package com.mihaiconstantin.traveljournal.recyclerView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mihaiconstantin.traveljournal.ManagerTripActivity;
import com.mihaiconstantin.traveljournal.R;

import java.util.ArrayList;
import java.util.List;

public class FavouriteRecyclerViewActivity extends AppCompatActivity {

//    private RecyclerView mRecyclerViewFavouriteDestinations;
//    private List<Destination> mFavouriteDestinations;
//
//    private DestinationsAdaptor destinationsAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_recycler_view);

//        // get recycler view from xml file
//        mRecyclerViewFavouriteDestinations = findViewById(R.id.recyclerViewFavouriteDestinations);
//        mRecyclerViewFavouriteDestinations.setHasFixedSize(true);
//
//        // define and set layout manager
//        mRecyclerViewFavouriteDestinations.setLayoutManager(new LinearLayoutManager(this));
//
//        // get data source
//        mFavouriteDestinations = getDestinations();
//
//        // get the adaptor instance
////        destinationsAdaptor = new DestinationsAdaptor(mFavouriteDestinations);
//
//        destinationsAdaptor = new DestinationsAdaptor(this, mFavouriteDestinations);
//        destinationsAdaptor.setClickListener(this);
//        // set the adaptor to the recycler view
//        mRecyclerViewFavouriteDestinations.setAdapter(destinationsAdaptor);
//        destinationsAdaptor.notifyDataSetChanged();
    }

//    private List<Destination> getDestinations() {
//        List<Destination> destinations = new ArrayList<>();
//        destinations.add(new Destination("Spring 2016", "Bali", "https://i.imgur.com/FXdj1On.jpg"));
//        destinations.add(new Destination("Summer 2016", "London", "https://i.imgur.com/epL9ABv.jpg"));
//        destinations.add(new Destination("Fall 2016", "Rome", "https://i.imgur.com/8yBG7xw.jpg"));
//        destinations.add(new Destination("Winter 2016", "Paris", "https://i.imgur.com/jgRVgtk.jpg"));
//
//        return destinations;
//    }
//
//    @Override
//    public void onItemClick(View view, int position) {
//        startActivity(new Intent(this, ManagerTripActivity.class));
//    }
}
