package com.miguelcapco.chartlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPieChart;
    private Button btnLineChart;
    private Button btnBarChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMembers();
        setupListeners();
    }

    private void setupMembers(){
        btnBarChart = findViewById(R.id.btnBarChart);
        btnLineChart = findViewById(R.id.btnLineChart);
        btnPieChart = findViewById(R.id.btnChartPie);
    }

    private void setupListeners(){
        btnPieChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PieChartActivity.class);
                startActivity(intent);
            }
        });

        btnLineChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LineChartActivity.class);
                startActivity(intent);
            }
        });

        btnBarChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BarChartActivity.class);
                startActivity(intent);
            }
        });
    }
}