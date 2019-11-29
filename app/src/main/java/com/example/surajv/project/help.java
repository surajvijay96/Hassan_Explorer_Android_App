package com.example.surajv.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class help extends AppCompatActivity {

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

        //adding back button
        getSupportActionBar().setDisplayShowHomeEnabled(true); //
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //these two lines for back button


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }
}
