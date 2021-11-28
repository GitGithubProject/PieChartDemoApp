package com.example.piechartdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Piedemo extends AppCompatActivity {

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedemo);

        pieChart = (PieChart) findViewById(R.id.piechart);

        ArrayList<PieEntry> records = new ArrayList<>();
        records.add(new PieEntry(32, "Quarter1"));
        records.add(new PieEntry(14, "Quarter2"));
        records.add(new PieEntry(34, "Quarter3"));
        records.add(new PieEntry(38, "Quarter4"));

        PieDataSet dataSet = new PieDataSet(records, "Pie Chart Business Report");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(22f);

        PieData pieData = new PieData(dataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(true);
        pieChart.setCenterText("Quarterly Revenue");
        pieChart.animateY(2000);




    }
}