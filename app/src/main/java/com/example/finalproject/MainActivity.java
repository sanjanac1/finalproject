package com.example.finalproject;

import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Matrix m = new Matrix();
    private Paint p = new Paint();
    private CalendarGrid mainGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        //mainGrid = new CalendarGrid();
        //mainGrid.getCanvas().drawBitmap(mainGrid.grid, m, p);
        MediaPlayer angrySong = MediaPlayer.create(MainActivity.this, R.raw.angry);
            angrySong.start();


    }







}



