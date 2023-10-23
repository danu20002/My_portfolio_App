package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {
MeowBottomNavigation bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation=findViewById(R.id.meowbotnav);
        bottomNavigation.show(1,true);
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.baseline_school_24));

        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.baseline_work_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(5,R.drawable.baseline_contact_page_24));

    }//####################on create End###########




}//#####################code End###################