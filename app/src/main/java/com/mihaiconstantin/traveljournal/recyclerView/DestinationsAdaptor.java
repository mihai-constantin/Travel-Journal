package com.mihaiconstantin.traveljournal.recyclerView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mihaiconstantin.traveljournal.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

public class DestinationsAdaptor extends RecyclerView.Adapter<DestinationsAdaptor.DestinationsViewHolder> {

    private List<Destination> mDestinations;
    private Context context;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    public DestinationsAdaptor(Context context, List<Destination> data) {
        this.context = context;
        this.mDestinations = data;
    }

    public Context getContext() {
        return context;
    }

    // inflates the row layout from xml when needed
    @NonNull
    @Override
    public DestinationsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.destination_item, viewGroup, false);

        return new DestinationsViewHolder(itemView);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(@NonNull DestinationsViewHolder destinationsViewHolder, int i) {
        Destination currentDestination = mDestinations.get(i);
        destinationsViewHolder.getTextViewTimeDestination().setText(currentDestination.getTime());
        destinationsViewHolder.getTextViewDestination().setText(currentDestination.getLocation());
        Picasso.get().load(currentDestination.getURI()).into(destinationsViewHolder.getImageView());
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mDestinations.size();
    }

    public class DestinationsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        private TextView mTextViewTimeDestination;
        private TextView mTextViewDestination;
        private ImageView mImageView;
        private TextView mRating;

        public DestinationsViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewTimeDestination = itemView.findViewById(R.id.textViewTimeDestination);
            mTextViewDestination = itemView.findViewById(R.id.textViewDestination);
            mImageView = itemView.findViewById(R.id.imageView);
            mRating = itemView.findViewById(R.id.rating);
            itemView.setOnClickListener(this);
        }

        public TextView getTextViewTimeDestination() {
            return mTextViewTimeDestination;
        }

        public TextView getTextViewDestination() {
            return mTextViewDestination;
        }

        public ImageView getImageView() {
            return mImageView;
        }

        public TextView getRating() {
            return mRating;
        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null) {
                mClickListener.onItemClick(v, getAdapterPosition());
            }
        }

        @Override
        public boolean onLongClick(View v) {
            if (mClickListener != null) {
                mClickListener.onLongClick(v, getAdapterPosition());
            }
            return false;
        }
    }

    // convenience method for getting data at click position
    public Destination getItem(int id) {
        return mDestinations.get(id);
    }

    // allows clicks events to be caught
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);

        void onLongClick(View view, int position);
    }
}

