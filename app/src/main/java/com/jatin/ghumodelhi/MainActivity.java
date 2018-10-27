package com.jatin.ghumodelhi;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Places.Place> abc = Places.getPlaces();

//T-
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DetailsFragment frag = DetailsFragment.newInstance(0);

        FragmentManager fragMgr = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragMgr.beginTransaction();
        fragmentTransaction.add(R.id.frag_container,frag,null);
        fragmentTransaction.commit();
    }
}
