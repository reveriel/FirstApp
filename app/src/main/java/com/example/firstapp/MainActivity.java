package com.example.firstapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *  three tiles, list view, material design.
 */


public class MainActivity extends Activity {

    public static String[] myDataSet = {"A", "B"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.activity_main, CardViewFragment.newInstance())
                    .commit();
        }

//        mRecyclerView = (RecyclerView) findViewById(R.id.main_recycler_view);
//
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//
//        mAdapter = new MainAdapter(myDataSet);
//        mRecyclerView.setAdapter(mAdapter);


    }

}
