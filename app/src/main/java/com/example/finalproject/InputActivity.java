package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {
    private ImageButton angryButton;
    private ImageButton energyButton;
    private ImageButton happyButton;
    private ImageButton lonelyButton;
    private ImageButton sleepyButton;
    private ImageButton productiveButton;
    private ImageButton sadButton;
    private ImageButton calmButton;
    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_page);

        happyButton = findViewById(R.id.btnHappy);
        angryButton = findViewById(R.id.btnAngry);
        energyButton = findViewById(R.id.btnEnergetic);
        lonelyButton = findViewById(R.id.btnLonely);
        sleepyButton = findViewById(R.id.btnSleepy);
        productiveButton = findViewById(R.id.btnProductive);
        sadButton = findViewById(R.id.btnSad);
        calmButton = findViewById(R.id.btnCalm);


        happyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.happy);
                song = MediaPlayer.create(InputActivity.this, R.raw.happysong);
                song.start();

            }
        });

        angryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.angry);
                song = MediaPlayer.create(InputActivity.this, R.raw.angrysong);
                song.start();
            }
        });
        energyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.energetic);
                song = MediaPlayer.create(InputActivity.this, R.raw.energysong);
                song.start();
            }
        });
        lonelyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.lonely);
                song = MediaPlayer.create(InputActivity.this, R.raw.lonelysong);
                song.start();
            }
        });
        sleepyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.sleepy);
                song = MediaPlayer.create(InputActivity.this, R.raw.sleepysong);
                song.start();
            }
        });
        productiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.productive);
                song = MediaPlayer.create(InputActivity.this, R.raw.productivesong);
                song.start();
            }
        });
        sadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.sad);
                song = MediaPlayer.create(InputActivity.this, R.raw.sadsong);
                song.start();
            }
        });
        calmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calm);
                song = MediaPlayer.create(InputActivity.this, R.raw.calmsong);
                song.start();
            }
        });


    }

}


