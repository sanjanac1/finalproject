package com.example.finalproject;
import android.content.Context;
import android.widget.GridLayout;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class CalendarGrid {
    private Calendar c;
    GridLayout grid;

    public CalendarGrid() {
        
    }

    public String getDate() {
        c = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        return formatter.format(c.getTime());
    }

}
