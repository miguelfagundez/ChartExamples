package com.miguelcapco.chartlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class LineChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);

        // Defining chart object
        LineChart lineChart = (LineChart) findViewById(R.id.lineChart);

        // Array of data
        ArrayList<Entry> monthlyRates = new ArrayList<>();
        monthlyRates.add(new Entry(1,6));
        monthlyRates.add(new Entry(2,3));
        monthlyRates.add(new Entry(3,3));
        monthlyRates.add(new Entry(4,7));
        monthlyRates.add(new Entry(5,2));
        monthlyRates.add(new Entry(6,8));
        monthlyRates.add(new Entry(7,4));

        // Chart settings
        LineDataSet dataSet = new LineDataSet(monthlyRates, "Monthly Rates");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(18f);

        LineData pieData = new LineData(dataSet);

        lineChart.setData(pieData);
        lineChart.animate();
    }
}