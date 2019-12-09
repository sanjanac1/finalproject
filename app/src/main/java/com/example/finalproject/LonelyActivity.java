package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LonelyActivity extends AppCompatActivity {
    private Button pauseLonely;
    private Button backLonely;
    private MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lonely);

        pauseLonely = findViewById(R.id.pslonely);
        backLonely = findViewById(R.id.backLonely);

        song = MediaPlayer.create(LonelyActivity.this, R.raw.lonelysong);
        song.start();
        pauseLonely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (song.isPlaying()) {
                    song.pause();
                } else {
                    song.start();
                }

            }
        });
        backLonely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.stop();
                Intent intent = new Intent(LonelyActivity.this, InputActivity.class);
                startActivity(intent);

            }
        });

    }


}

