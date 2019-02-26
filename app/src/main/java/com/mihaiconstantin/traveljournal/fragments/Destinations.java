package com.mihaiconstantin.traveljournal.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mihaiconstantin.traveljournal.ManagerTripActivity;
import com.mihaiconstantin.traveljournal.R;
import com.mihaiconstantin.traveljournal.recyclerView.Destination;
import com.mihaiconstantin.traveljournal.recyclerView.DestinationsAdaptor;

import java.util.ArrayList;

public class Destinations extends Fragment implements DestinationsAdaptor.ItemClickListener {

    private static View view;
    private static RecyclerView recyclerView;
    private static ArrayList<Destination> destinations;
    private DestinationsAdaptor adapter;

    public static final String TRIP_TIME = "trip_time";
    public static final String TRIP_DESTINATION = "trip_destination";
    public static final String TRIP_RATING = "trip_rating";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_recycler_view, container, false);
        populateRecyclerView();
        return view;
    }

    private void populateRecyclerView() {
        recyclerView = view.findViewById(R.id.recyclerViewDestinations);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        destinations = new ArrayList<>();
        destinations.add(new Destination("Spring 2016", "Bali", "https://i.imgur.com/FXdj1On.jpg", "4"));
        destinations.add(new Destination("Summer 2016", "London", "https://i.imgur.com/epL9ABv.jpg", "3.5"));
        destinations.add(new Destination("Fall 2016", "Rome", "https://i.imgur.com/8yBG7xw.jpg", "5"));
        destinations.add(new Destination("Winter 2016", "Paris", "https://i.imgur.com/jgRVgtk.jpg", "3.5"));
        destinations.add(new Destination("Spring 2017", "Sydney", "https://i.imgur.com/1kuP9Ui.jpg", "3"));
        destinations.add(new Destination("Summer 2017", "New York", "https://i.imgur.com/bTR80Sz.jpg", "4"));
        destinations.add(new Destination("Fall 2017", "Istanbul", "https://i.imgur.com/52bwq1j.jpg", "5"));
        destinations.add(new Destination("Winter 2017", "Prague", "https://i.imgur.com/FMXYjAB.jpg", "1.5"));
        destinations.add(new Destination("Spring 2018", "San Francisco", "https://i.imgur.com/k4WKE8W.jpg", "2"));
        destinations.add(new Destination("Summer 2018", "Vienna", "https://i.imgur.com/heIhhkl.jpg", "2.5"));
        destinations.add(new Destination("Fall 2018", "Barcelona", "https://i.imgur.com/POLYrIO.jpg", "4.5"));

        adapter = new DestinationsAdaptor(getActivity(), destinations);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent secondActivity = new Intent(adapter.getContext(), ManagerTripActivity.class);

        final String TRIP_NAME_1 = adapter.getItem(position).getTime();
        final String TRIP_DESTINATION_1 = adapter.getItem(position).getLocation();
        final String TRIP_RATING_1 = adapter.getItem(position).getRating();

        secondActivity.putExtra(Destinations.TRIP_TIME, TRIP_NAME_1);
        secondActivity.putExtra(Destinations.TRIP_DESTINATION, TRIP_DESTINATION_1);
        secondActivity.putExtra(Destinations.TRIP_RATING, TRIP_RATING_1);
        startActivity(secondActivity);

//        Toast.makeText(getActivity(), adapter.getItem(position).getLocation(), Toast.LENGTH_LONG).show();
//        EditText tripName = view.findViewById(R.id.tripNameEditText);
//        tripName.setText(adapter.getItem(position).getLocation());

    }

    @Override
    public void onLongClick(View view, int position) {
        Toast.makeText(getActivity(), "destinations fragment", Toast.LENGTH_LONG).show();
    }
}
