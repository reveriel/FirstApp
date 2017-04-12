package com.example.firstapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 *  three tiles, list view, material design.
 */


public class MainActivity extends Activity {

    public static String[] myDataSet = {"A", "B"};
    View card1;
    TextView text1;
    int counter = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.cardview);
        card1.setOnClickListener(new Card1Listener());
        text1 = (TextView)card1.findViewById(R.id.cardtext1);


//        if (savedInstanceState == null) {
//            getFragmentManager().beginTransaction()
//                    .add(R.id.activity_main, CardViewFragment.newInstance())
//                    .commit();
//        }
    }

    private class Card1Listener implements OnClickListener {
        @Override
        public void onClick(View v) {
            text1.post(new Runnable() {
                @Override
                public void run() {
                    text1.setText("clicked for " + counter++ + " times");
                }
            });
        }
    }


}
