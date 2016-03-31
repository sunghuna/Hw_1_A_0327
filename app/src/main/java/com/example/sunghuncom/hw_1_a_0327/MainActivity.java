package com.example.sunghuncom.hw_1_a_0327;
/**  mobile programming homework #1_A
 //  package name : hw_1_a_0327
 //  this program will make time table of kwak sunghun
 //  and show the timetable
 //  Created by Kwak sunghun on 2016. 3. 27.
 //  Copyright © 2016년 Kwak sunghun. All rights reserved.
 */
//github test
import android.util.Log;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;
import java.util.Date;
import android.view.Display;
import android.graphics.Point;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView dateNtime;
    GridLayout weekend;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //check diplay's width is longer than height
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        //if higth is longer than width this program will show the main layout otherwise it will show sub layout
        if(height>width)
            setContentView(R.layout.activity_main);
        else
            setContentView(R.layout.activity_sub);

        //set text in text view widget using date library
        dateNtime=(TextView)findViewById(R.id.dateNTime);
        dateNtime.setText(new Date().toString());


        //this program will check today's day then change that layout's backgound color to blue
        Calendar calendar = Calendar.getInstance();
        String []days = {"일","월","화","수","목","금","토"};
        String temp = days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
        if(temp.compareTo("월")==0) {
            weekend = (GridLayout) findViewById(R.id.monday);
            weekend.setBackgroundColor(Color.BLUE);
        }
        if(temp.compareTo("화")==0) {
            weekend = (GridLayout) findViewById(R.id.tuesday);
            weekend.setBackgroundColor(Color.BLUE);
        }
        if(temp.compareTo("수")==0) {
            weekend = (GridLayout) findViewById(R.id.wednesday);
            weekend.setBackgroundColor(Color.BLUE);
        }
        if(temp.compareTo("목")==0) {
            weekend = (GridLayout) findViewById(R.id.thursday);
            weekend.setBackgroundColor(Color.BLUE);
        }
        if(temp.compareTo("금")==0) {
            weekend = (GridLayout) findViewById(R.id.friday);
            weekend.setBackgroundColor(Color.BLUE);
        }
        if((temp.compareTo("토")==0)||(temp.compareTo("일")==0)){
            weekend = (GridLayout) findViewById(R.id.number);
            weekend.setBackgroundColor(Color.BLUE);
        }
    }
}
