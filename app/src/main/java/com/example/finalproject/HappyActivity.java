package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HappyActivity extends AppCompatActivity {
    private Button pauseHappy;
    private Button backHappy;
    private MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.happy);

        pauseHappy = findViewById(R.id.pshappy);
        backHappy = findViewById(R.id.backHapy);

        song = MediaPlayer.create(HappyActivity.this, R.raw.happysong);
        song.start();
        pauseHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (song.isPlaying()) {
                    song.pause();
                } else {
                    song.start();
                }

            }
        });
        backHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.stop();
                Intent intent = new Intent(HappyActivity.this, InputActivity.class);
                startActivity(intent);

            }
        });

    }


}

