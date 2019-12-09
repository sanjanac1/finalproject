package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
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
                Intent intent = new Intent(InputActivity.this, HappyActivity.class);
                startActivity(intent);
            }
        });

        angryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InputActivity.this, AngryActivity.class);
                startActivity(intent);
            }
        });
        energyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.energetic);
                Intent intent = new Intent(InputActivity.this, EnergeticActivity.class);
                startActivity(intent);
            }
        });
        lonelyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.lonely);
                Intent intent = new Intent(InputActivity.this, LonelyActivity.class);
                startActivity(intent);
            }
        });
        sleepyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.sleepy);
                Intent intent = new Intent(InputActivity.this, SleepyActivity.class);
                startActivity(intent);
            }
        });
        productiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.productive);
                Intent intent = new Intent(InputActivity.this, ProductiveActivity.class);
                startActivity(intent);
            }
        });
        sadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.sad);
                Intent intent = new Intent(InputActivity.this, SadActivity.class);
                startActivity(intent);
            }
        });
        calmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calm);
                Intent intent = new Intent(InputActivity.this, CalmActivity.class);
                startActivity(intent);
            }
        });

    }



}


