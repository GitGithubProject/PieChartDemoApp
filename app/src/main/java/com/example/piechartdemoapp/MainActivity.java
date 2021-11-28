package com.example.piechartdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.WindowManager;
import android.widget.Button;

import com.github.mikephil.charting.charts.LineChart;

public class MainActivity extends AppCompatActivity {

    Button btnPie;
    Button btnBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnPie = (Button) findViewById(R.id.btnPie);
        btnBar = (Button) findViewById(R.id.btnBar);

        btnPie.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), Piedemo.class)));

        btnBar.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), BarChartApp.class)));

    }
}