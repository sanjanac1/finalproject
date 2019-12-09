package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AngryActivity extends AppCompatActivity {
    private Button pauseAngry;
    private Button backAngry;
    private MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.angry);

        pauseAngry = findViewById(R.id.psangry);
        backAngry = findViewById(R.id.backAngry);

        song = MediaPlayer.create(AngryActivity.this, R.raw.angrysong);
        song.start();
        pauseAngry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (song.isPlaying()) {
                    song.pause();
                } else {
                    song.start();
                }

            }
        });
        backAngry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.stop();
                Intent intent = new Intent(AngryActivity.this, InputActivity.class);
                startActivity(intent);

            }
        });

    }


}

