package com.example.piechartdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;

import com.github.mikephil.charting.charts.LineChart;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    Button startButton,stopButton;
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


        // initiate progress bar and start button
        progressBar = (ProgressBar) findViewById(R.id.pBar);

        progressBar.setVisibility(View.GONE);

       startButton = (Button) findViewById(R.id.startButton);
        // perform click event on button
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // visible the progress bar
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        stopButton = (Button) findViewById(R.id.stopButton);
        // perform click event on button
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide the progress bar
                progressBar.setVisibility(View.GONE);
            }
        });

    }
}