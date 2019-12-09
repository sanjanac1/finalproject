package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CalmActivity extends AppCompatActivity {
    private Button pauseCalm;
    private Button backCalm;
    private MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calm);

        pauseCalm = findViewById(R.id.psCalm);
        backCalm = findViewById(R.id.backCalm);

        song = MediaPlayer.create(CalmActivity.this, R.raw.calmsong);
        song.start();
        pauseCalm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (song.isPlaying()) {
                    song.pause();
                } else {
                    song.start();
                }

            }
        });
        backCalm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.stop();
                Intent intent = new Intent(CalmActivity.this, InputActivity.class);
                startActivity(intent);

            }
        });

    }


}

