package com.example.firstapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import android.widget.Toast;

/**
 *  three tiles, list view, material design.
 */


public class MainActivity extends Activity {

    public static String[] myDataSet = {"A", "B"};
    View card1, card2;
    TextView text1;
    int counter = 0;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.cardview);
        card1.setOnClickListener(new CardListener1());
        text1 = (TextView)card1.findViewById(R.id.cardtext1);

        card2 = findViewById(R.id.cardview2);
        card2.setOnClickListener(new CardListener2());

        if (savedInstanceState == null) {
            Toast.makeText(MainActivity.this, "newly created activity", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "activity recreated", Toast.LENGTH_SHORT).show();
        }

//        if (savedInstanceState == null) {
//            getFragmentManager().beginTransaction()
//                    .add(R.id.activity_main, CardViewFragment.newInstance())
//                    .commit();
//        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(MainActivity.this, "onSaveInstanceState", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(MainActivity.this, "onRestoreInstanceState", Toast.LENGTH_SHORT).show();
    }



    private class CardListener1 implements OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "card 1 clicked", Toast.LENGTH_SHORT).show();
            text1.post(new Runnable() {
                @Override
                public void run() {
                    text1.setText("clicked for " + counter++ + " times");
                }
            });
        }
    }

    private class CardListener2 implements OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "card 2 clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(intent);
        }
    }





}
