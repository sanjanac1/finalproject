package com.example.finalproject;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.GridLayout;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Paint;





public class CalendarGrid {
    private Calendar c;
    public Bitmap grid;
    private Canvas canvas;
    private Rect[][] pixel;



    public CalendarGrid() {
        //grid = Bitmap.createBitmap(12, 31, Bitmap.Config.ARGB_8888);
        //canvas = new Canvas(grid);
        pixel = new Rect[31][12];
        int left = 97;
        int top = 70;
        int right = 398;
        int bottom = 662;
        int j;
        for (int i = 0; i < 12; i++) {
            for (j = 0; j < 31; i++) {
                pixel[j][i] = new Rect(left, top, right, bottom);
                top += 15;
                bottom -= 15;
            }
            left += 15;
            right -= 15;
        }
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
