package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SleepyActivity extends AppCompatActivity {
    private Button pauseSleepy;
    private Button backSleepy;
    private MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sleepy);

        pauseSleepy = findViewById(R.id.pssleepy);
        backSleepy = findViewById(R.id.backSleepy);

        song = MediaPlayer.create(SleepyActivity.this, R.raw.sleepysong);
        song.start();
        pauseSleepy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (song.isPlaying()) {
                    song.pause();
                } else {
                    song.start();
                }

            }
        });
        backSleepy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.stop();
                Intent intent = new Intent(SleepyActivity.this, InputActivity.class);
                startActivity(intent);

            }
        });

    }


}

