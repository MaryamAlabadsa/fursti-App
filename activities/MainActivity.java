package com.example.myapplication.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.fragments.BookmarkFragment;
import com.example.myapplication.fragments.JobsFragment;
import com.example.myapplication.fragments.ProfileFragment;
import com.example.myapplication.R;
import com.example.myapplication.fragments.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // إظهار أول Fragment عند بدء التطبيق
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new JobsFragment())
                .commit();

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            int itemId = item.getItemId();
            if (itemId == R.id.nav_jobs) {
                selectedFragment = new JobsFragment();
            } else if (itemId == R.id.nav_bookmark) {
                selectedFragment = new BookmarkFragment();
            } else if (itemId == R.id.nav_setting) {
                selectedFragment = new SettingsFragment();
            }else
                selectedFragment = new ProfileFragment();


            if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, selectedFragment)
                            .commit();
                }

                return true;
            });
        }
    }
