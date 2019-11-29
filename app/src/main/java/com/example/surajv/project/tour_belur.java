package com.example.surajv.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.net.URI;

public class tour_belur extends AppCompatActivity {

    FloatingActionButton belur_drive_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_belur);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.drive_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "You will be directed to this place", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                belur_drive_btn = (FloatingActionButton) findViewById(R.id.drive_button);
                belur_drive_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent belur_drive_btn = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=13.0753,76.1784"));//change this tour.class to googlemaps later
                        startActivity(belur_drive_btn);
                    }
                });
            }
        });
    }
}





