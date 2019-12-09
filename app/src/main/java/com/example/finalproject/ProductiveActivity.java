package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProductiveActivity extends AppCompatActivity {
    private Button pauseProductive;
    private Button backProductive;
    private MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productive);

        pauseProductive = findViewById(R.id.psproductive);
        backProductive = findViewById(R.id.backProductive);

        song = MediaPlayer.create(ProductiveActivity.this, R.raw.productivesong);
        song.start();
        pauseProductive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (song.isPlaying()) {
                    song.pause();
                } else {
                    song.start();
                }

            }
        });
        backProductive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.stop();
                Intent intent = new Intent(ProductiveActivity.this, InputActivity.class);
                startActivity(intent);

            }
        });

    }


}

