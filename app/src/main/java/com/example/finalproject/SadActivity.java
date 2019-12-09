package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SadActivity extends AppCompatActivity {
    private Button pauseSad;
    private Button backSad;
    private MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sad);

        pauseSad = findViewById(R.id.pssad);
        backSad = findViewById(R.id.backSad);

        song = MediaPlayer.create(SadActivity.this, R.raw.sadsong);
        song.start();
        pauseSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (song.isPlaying()) {
                    song.pause();
                } else {
                    song.start();
                }

            }
        });
        backSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.stop();
                Intent intent = new Intent(SadActivity.this, InputActivity.class);
                startActivity(intent);

            }
        });

    }


}

