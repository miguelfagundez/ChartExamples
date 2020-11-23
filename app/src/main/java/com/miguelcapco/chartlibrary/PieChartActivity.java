package com.miguelcapco.chartlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        // Defining chart object
        PieChart pieChart = findViewById(R.id.pieChart);

        // Array of data
        ArrayList<PieEntry> monthlyRates = new ArrayList<>();
        monthlyRates.add(new PieEntry(30,"January"));
        monthlyRates.add(new PieEntry(20,"February"));
        monthlyRates.add(new PieEntry(40,"March"));
        monthlyRates.add(new PieEntry(10,"April"));


        // Chart settings
        PieDataSet dataSet = new PieDataSet(monthlyRates, "Monthly Rates");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(18f);

        PieData pieData = new PieData(dataSet);

        pieChart.setData(pieData);
        pieChart.setCenterText("Monthly Rates");
        pieChart.animate();
    }
}