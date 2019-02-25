package com.mihaiconstantin.traveljournal.recyclerView;

import android.view.View;

public interface BookmarkClickListener {
    void onClick(View view, int position);
    void onLongClick(View view,int position);
}
