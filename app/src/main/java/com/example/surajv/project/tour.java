package com.example.surajv.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class tour extends AppCompatActivity {

    ImageButton img;

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
        setContentView(R.layout.activity_tour);

        //adding back button
        getSupportActionBar().setDisplayShowHomeEnabled(true); //
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //these two lines for back button

        img = (ImageButton) findViewById(R.id.imageButton06);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(tour.this,tour_belur.class);
                startActivity(img);
            }
        });

    }
}
