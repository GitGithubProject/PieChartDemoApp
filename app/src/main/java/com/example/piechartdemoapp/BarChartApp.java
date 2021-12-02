package com.example.piechartdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartApp extends AppCompatActivity {

    // variable for our bar chart
    BarChart barChart;

    // variable for our bar data data
    BarData barData;//use to grouping the data set from entry to chart

    // variable for our bar data set
    BarDataSet barDataSet;

    // array list for storing entries.
    ArrayList<BarEntry> barEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        // initializing variable for bar chart.
        barChart = (BarChart)findViewById(R.id.barChart);

        getEntries();

        // creating a new bar data set.
        barDataSet = new BarDataSet(barEntries, "Visitor in the Park");
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);


        //Adding dataset to bar data
        barData = new BarData(barDataSet);

        // after adding data to our bar data we
        // are setting that data to our bar chart.
        barChart.setData(barData);

        barChart.setFitBars(true);
        barChart.getDescription().setText("Bar Chart of Visitors");
        barChart.animateY(2000);


    }


    private void getEntries() {

        // creating a new array list
        barEntries = new ArrayList<>();

        // adding new entry to our array list with bar
        // entry and passing x and y axis value to it.
        barEntries.add(new BarEntry(2014,420));
        barEntries.add(new BarEntry(2015,430));
        barEntries.add(new BarEntry(2016,500));
        barEntries.add(new BarEntry(2017,650));
        barEntries.add(new BarEntry(2018,740));
        barEntries.add(new BarEntry(2019,630));
    }

}