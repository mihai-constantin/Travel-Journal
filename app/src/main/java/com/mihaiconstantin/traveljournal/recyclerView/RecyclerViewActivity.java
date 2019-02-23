package com.mihaiconstantin.traveljournal.recyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mihaiconstantin.traveljournal.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewDestinations;
    private List<Destination> mDestinations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        // get recycler view from xml file
        mRecyclerViewDestinations = findViewById(R.id.recyclerViewDestinations);

        // define and set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewDestinations.setLayoutManager(layoutManager);

        // get data source
        mDestinations = getDestinations();

        // get the adaptor instance
        DestinationsAdaptor destinationsAdaptor = new DestinationsAdaptor(mDestinations);

        // set the adaptor to the recycler view
        mRecyclerViewDestinations.setAdapter(destinationsAdaptor);

    }

    private List<Destination> getDestinations() {
        List<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination("Spring 2016", "Bali", "https://i.imgur.com/FXdj1On.jpg"));
        destinations.add(new Destination("Summer 2016", "London", "https://i.imgur.com/epL9ABv.jpg"));
        destinations.add(new Destination("Fall 2016", "Rome", "https://i.imgur.com/8yBG7xw.jpg"));
        destinations.add(new Destination("Winter 2016", "Paris", "https://i.imgur.com/jgRVgtk.jpg"));
        destinations.add(new Destination("Spring 2017", "Sydney", "https://i.imgur.com/1kuP9Ui.jpg"));
        destinations.add(new Destination("Summer 2017", "New York", "https://i.imgur.com/bTR80Sz.jpg"));
        destinations.add(new Destination("Fall 2017", "Istanbul", "https://i.imgur.com/52bwq1j.jpg"));
        destinations.add(new Destination("Winter 2017", "Prague", "https://i.imgur.com/FMXYjAB.jpg"));
        destinations.add(new Destination("Spring 2018", "San Francisco", "https://i.imgur.com/k4WKE8W.jpg"));
        destinations.add(new Destination("Summer 2018", "Vienna", "https://i.imgur.com/heIhhkl.jpg"));
        destinations.add(new Destination("Fall 2018", "Barcelona", "https://i.imgur.com/POLYrIO.jpg"));

        return destinations;
    }

}
