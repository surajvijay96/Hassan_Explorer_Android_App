package com.example.surajv.project;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.common.images.ImageManager;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<ImageModel> imageModelArrayList;

    private int[] myImageList = new int[]{R.drawable.flipper_belur, R.drawable.flipper_bilse,
            R.drawable.flipper_manjrabad,R.drawable.flipper_gomma
            ,R.drawable.flipper_shetty,R.drawable.flipper_gomma};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();

        init();

    }

        private ArrayList<ImageModel> populateList(){

        ArrayList<ImageModel> list = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            ImageModel imageModel = new ImageModel();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;
    }

    private void init() {

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(MainActivity.this,imageModelArrayList));

        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =imageModelArrayList.size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 1000, 1000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });



        img1 = (ImageView) findViewById(R.id.imageView6);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img1_intent = new Intent(MainActivity.this,tour.class);
                startActivity(img1_intent);
            }
        });

        img2 = (ImageView) findViewById(R.id.imageView8);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img2_intent = new Intent(MainActivity.this,restaurant.class);
                startActivity(img2_intent);

            }
        });

        img3 = (ImageView) findViewById(R.id.imageView7);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img3_intent = new Intent(MainActivity.this,hotel.class);
                startActivity(img3_intent);

            }
        });

        img4 = (ImageView) findViewById(R.id.imageView9);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img4_intent = new Intent(MainActivity.this,hospital.class);
                startActivity(img4_intent);


            }
        });

        img5 = (ImageView) findViewById(R.id.imageView10);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img5_intent = new Intent(MainActivity.this,near_me.class);
                startActivity(img5_intent);

            }
        });

        img6 = (ImageView) findViewById(R.id.imageView11);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img6_intent = new Intent(MainActivity.this,emergency.class);
                startActivity(img6_intent);

            }
        });
    }
//-----------------------for displaying menu-----------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main_activity,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.developers){
            Intent intent = new Intent(MainActivity.this, developers.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.help){
            Intent intent = new Intent(MainActivity.this, help.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.shareapp){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareBody = "download this app at https://google.co.in";
            String shareSubject = "you subject";
            intent.putExtra(Intent.EXTRA_SUBJECT,shareSubject);
            intent.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(intent.createChooser(intent,"Share using"));
        }
        return super.onOptionsItemSelected(item);
    }
//--------------------------till here for menu
}
