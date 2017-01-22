package com.tutorials.hp.simplerater;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.iarcuschin.simpleratingbar.SimpleRatingBar;

public class MainActivity extends AppCompatActivity {

    SimpleRatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ratingBar= (SimpleRatingBar) findViewById(R.id.ratingBarID);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view,String.valueOf(ratingBar.getRating()), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
