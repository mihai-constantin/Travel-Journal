package com.mihaiconstantin.traveljournal.recyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mihaiconstantin.traveljournal.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DestinationsAdaptor extends RecyclerView.Adapter<DestinationsViewHolder> {

    private List<Destination> mDestinations;

    public DestinationsAdaptor(List<Destination> mDestinations) {
        this.mDestinations = mDestinations;
    }

    @NonNull
    @Override
    public DestinationsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.destination_item, viewGroup, false);

        return new DestinationsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DestinationsViewHolder destinationsViewHolder, int i) {
        Destination currentDestination = mDestinations.get(i);
        destinationsViewHolder.getTextViewTimeDestination().setText(currentDestination.getTime());
        destinationsViewHolder.getTextViewDestination().setText(currentDestination.getLocation());
        Picasso.get().load(currentDestination.getURI()).into(destinationsViewHolder.getImageView());
    }

    @Override
    public int getItemCount() {
        return mDestinations.size();
    }
}
