package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EnergeticActivity extends AppCompatActivity {
    private Button pauseEnergy;
    private Button backEnergy;
    private MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.energetic);

        pauseEnergy = findViewById(R.id.psenergetic);
        backEnergy = findViewById(R.id.backEnergetic);

        song = MediaPlayer.create(EnergeticActivity.this, R.raw.energysong);
        song.start();
        pauseEnergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (song.isPlaying()) {
                    song.pause();
                } else {
                    song.start();
                }

            }
        });
        backEnergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.stop();
                Intent intent = new Intent(EnergeticActivity.this, InputActivity.class);
                startActivity(intent);

            }
        });

    }


}

