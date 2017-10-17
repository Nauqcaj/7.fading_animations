package com.jacquan.a7fading_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade (View view){

        //Scale (shrink & grow)
        ImageView kingLuffy = (ImageView) findViewById(R.id.king_luffy);
        kingLuffy.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        //Rotation
        //ImageView kingLuffy = (ImageView) findViewById(R.id.king_luffy);
        //kingLuffy.animate().rotation(180f).setDuration(2000);

       //Translation
        //ImageView kingLuffy = (ImageView) findViewById(R.id.king_luffy);
        //kingLuffy.animate().translationXBy(1300f).setDuration(2000);

        //off bottom of screen
        // kingLuffy.animate().translationYBy(1300f).setDuration(2000);

        //CrossFades
        //ImageView kingLuffy = (ImageView) findViewById(R.id.king_luffy);
        //ImageView angryLuffy = (ImageView) findViewById(R.id.angryLuffy);
        //kingLuffy.animate().alpha(0f).setDuration(2000);
        //angryLuffy.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Set initial image off screen

        ImageView kingLuffy = (ImageView) findViewById(R.id.king_luffy);
        kingLuffy.setTranslationX(-1300f);
         */

    }
}
