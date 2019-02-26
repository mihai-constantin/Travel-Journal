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

import com.mihaiconstantin.traveljournal.ManagerTripActivity;
import com.mihaiconstantin.traveljournal.R;
import com.mihaiconstantin.traveljournal.recyclerView.Destination;
import com.mihaiconstantin.traveljournal.recyclerView.DestinationsAdaptor;

import java.util.ArrayList;

public class FavouriteFragment extends Fragment implements DestinationsAdaptor.ItemClickListener {

    private static View view;
    private static RecyclerView recyclerView;
    private static ArrayList<Destination> destinations;
    private static DestinationsAdaptor adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_favourite_recycler_view, container, false);
        populateRecyclerView();
        return view;
    }

    private void populateRecyclerView() {
        recyclerView = view.findViewById(R.id.recyclerViewFavouriteDestinations);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        destinations = new ArrayList<>();
        destinations.add(new Destination("Winter 2017", "Prague", "https://i.imgur.com/FMXYjAB.jpg"));
        destinations.add(new Destination("Spring 2018", "San Francisco", "https://i.imgur.com/k4WKE8W.jpg"));
        destinations.add(new Destination("Summer 2018", "Vienna", "https://i.imgur.com/heIhhkl.jpg"));
        destinations.add(new Destination("Fall 2018", "Barcelona", "https://i.imgur.com/POLYrIO.jpg"));

        adapter = new DestinationsAdaptor(getActivity(), destinations);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(View view, int position) {
        startActivity(new Intent(adapter.getContext(), ManagerTripActivity.class));

    }
}
