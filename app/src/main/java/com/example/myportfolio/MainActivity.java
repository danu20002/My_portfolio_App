package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
MeowBottomNavigation bottomNavigation;
MediaPlayer player;
LottieAnimationView music;
CardView cardView_home;
ImageSlider slider;
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