package com.sliit.interviewapp1_t1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.sliit.interviewapp1_t1.Task1.Task1Fragment;
import com.sliit.interviewapp1_t1.Task2.Task2Fragment;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    //initiate bottom navigator

    //instantiate fragments


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view of bottom navigator
        //set listener for bottom navigation_view
        //set default view to home fragment


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        // set action bar title according to completed app
        //Implement fragment transitions

        return false;

    }
}