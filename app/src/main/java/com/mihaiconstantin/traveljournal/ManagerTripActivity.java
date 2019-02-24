package com.mihaiconstantin.traveljournal;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mihaiconstantin.traveljournal.picker.CustomDatePickerFragment;

public class ManagerTripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_trip);
    }

    public void bntOnClick(View view) {
        finish();
    }

    public void bntTakePictureOnClick(View view) {
    }

    public void bntGalleryPhotoOnClick(View view) {
    }

    public void btnDatePickerOnClick(View view) {
        DialogFragment newFragment = new CustomDatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "DatePicker");
    }
}
