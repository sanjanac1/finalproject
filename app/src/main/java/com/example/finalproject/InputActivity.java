package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {
    private ImageButton mood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_page);

        mood = findViewById(R.id.btnHappy);

        mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fillInGrid();
            }
        });

    }

    private void fillInGrid() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        //setContentView(R.layout.calendar);
    }
}
