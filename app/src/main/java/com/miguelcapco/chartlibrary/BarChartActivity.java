package com.miguelcapco.chartlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        // Defining chart object
        BarChart barChart = findViewById(R.id.barChart);

        // Array of data
        ArrayList<BarEntry> monthlyRates = new ArrayList<>();
        monthlyRates.add(new BarEntry(1,23));
        monthlyRates.add(new BarEntry(2,21));
        monthlyRates.add(new BarEntry(3,29));
        monthlyRates.add(new BarEntry(4,19));
        monthlyRates.add(new BarEntry(5,22));
        monthlyRates.add(new BarEntry(6,27));
        monthlyRates.add(new BarEntry(7,21));
        monthlyRates.add(new BarEntry(8,18));
        monthlyRates.add(new BarEntry(9,20));

        // Chart settings
        BarDataSet dataSet = new BarDataSet(monthlyRates, "Monthly Rates");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(18f);

        BarData barData = new BarData(dataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Monthly Rates example");
        barChart.animateY(2500);
    }
}