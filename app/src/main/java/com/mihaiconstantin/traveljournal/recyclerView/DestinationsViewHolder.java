package com.mihaiconstantin.traveljournal.recyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mihaiconstantin.traveljournal.R;

public class DestinationsViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextViewTimeDestination;
    private TextView mTextViewDestination;
    private ImageView mImageView;

    public DestinationsViewHolder(@NonNull View itemView) {
        super(itemView);
        mTextViewTimeDestination = itemView.findViewById(R.id.textViewTimeDestination);
        mTextViewDestination = itemView.findViewById(R.id.textViewDestination);
        mImageView = itemView.findViewById(R.id.imageView);
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
}
