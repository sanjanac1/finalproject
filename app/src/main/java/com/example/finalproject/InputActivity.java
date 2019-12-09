package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.graphics.Rect;

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
                setContentView(R.layout.calendar);
            }
        });

        angryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calendar);
            }
        });
        energyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calendar);
            }
        });
        lonelyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calendar);
            }
        });
        sleepyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calendar);
            }
        });
        productiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calendar);
            }
        });
        sadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calendar);
            }
        });
        calmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calendar);
            }
        });


    }
}


