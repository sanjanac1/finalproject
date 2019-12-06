package com.example.finalproject;
import android.content.Context;
import android.widget.GridLayout;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;






public class CalendarGrid {
    private Calendar c;
    public Bitmap grid;
    private Canvas canvas;



    public CalendarGrid() {
        grid = Bitmap.createBitmap(12, 31, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(grid);

    }

    public Canvas getCanvas() {
        return canvas;
    }

    public String getDate() {
        c = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        return formatter.format(c.getTime());
    }

}
