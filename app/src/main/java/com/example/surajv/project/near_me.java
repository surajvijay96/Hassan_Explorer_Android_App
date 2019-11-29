package com.example.surajv.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.prefs.PreferenceChangeListener;

public class near_me extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if(id == android.R.id.home){                            //this override is for back button
            //ends the activity
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_me);

        //adding back button
        getSupportActionBar().setDisplayShowHomeEnabled(true); //
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //these two lines for back button

        img1 = (ImageView) findViewById(R.id.imageButton23);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=restaurants"));
                startActivity(img);
            }
        });

        img2 = (ImageView) findViewById(R.id.imageButton22);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=hotels"));
                startActivity(img);
            }
        });

        img3 = (ImageView) findViewById(R.id.imageButton25);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=hospitals"));
                startActivity(img);
            }
        });

        img4 = (ImageView) findViewById(R.id.imageButton24);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=petrol bunks"));
                startActivity(img);
            }
        });

        img5 = (ImageView) findViewById(R.id.imageButton05);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=ATM"));
                startActivity(img);
            }
        });

        img6 = (ImageView) findViewById(R.id.imageButton06);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Shopping Centre"));
                startActivity(img);
            }
        });

        img7 = (ImageView) findViewById(R.id.imageButton07);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Temple"));
                startActivity(img);
            }
        });

        img8 = (ImageView) findViewById(R.id.imageButton08);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Pharmacy"));
                startActivity(img);
            }
        });

        img9 = (ImageView) findViewById(R.id.imageButton09);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Airports"));
                startActivity(img);
            }
        });

        img10 = (ImageView) findViewById(R.id.imageButton10);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Bus Stations"));
                startActivity(img);
            }
        });

        img11 = (ImageView) findViewById(R.id.imageButton11);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Markets"));
                startActivity(img);
            }
        });

        img12 = (ImageView) findViewById(R.id.imageButton12);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Cinemas"));
                startActivity(img);
            }
        });


    }
}
