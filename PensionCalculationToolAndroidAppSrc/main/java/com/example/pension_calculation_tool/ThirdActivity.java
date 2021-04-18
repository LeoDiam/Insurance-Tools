package com.example.pension_calculation_tool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent i = getIntent();
        String xroniaEosThnSyntaji = i.getStringExtra("XroniaEosThnSyntaji");
        String hlikia = i.getStringExtra("Hlikia");
        Button continueB = findViewById(R.id.continueButtonThird);
        Button calculateB = findViewById(R.id.calculateButtonThird);
        EditText starting_per_monthT = findViewById(R.id.starting_per_monthT);
        EditText starting_capitalT = findViewById(R.id.starting_capitalT);
        EditText yearRevenueT = findViewById(R.id.yearRevenueT);
        EditText yearsChangeT = findViewById(R.id.yearsChangeT);
        TextView finalValueT = findViewById(R.id.finalValueT);
        TextView finalValuePerMonthT = findViewById(R.id.finalValuePerMonthT);
        calculateB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             double fvalue = ending_total_value(Double.valueOf(starting_per_monthT.getText().toString()),Double.valueOf(starting_capitalT.getText().toString()),Integer.valueOf(yearRevenueT.getText().toString()),Integer.valueOf(yearsChangeT.getText().toString()),Integer.valueOf(xroniaEosThnSyntaji));
            finalValueT.setText(String.valueOf((String.format("%.2f", (fvalue)))));
            double fvaluepermonth = ending_per_month_pension(fvalue,Integer.valueOf(hlikia),Integer.valueOf(xroniaEosThnSyntaji));
            finalValuePerMonthT.setText(String.valueOf((String.format("%.2f", (fvaluepermonth)))));
            }
        });
        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
    //ενδεικτική τελική αξία στην λήξη
    private static double ending_total_value(double starting_monthly_capital, double starting_capital, int year_revenue, int year_change, int years_until_pension) {
        double total_value = 0.0;
        total_value = total_value + starting_capital;
        for (int i = 0; i < years_until_pension; i++){
            starting_monthly_capital = starting_monthly_capital + (starting_monthly_capital * ((double) year_change/100));
            total_value = total_value + (starting_monthly_capital * 12);
            total_value = total_value + (total_value * ((double) year_revenue/100));
        }
        return total_value;
    }
    //ενδεικτική μηνιαία σύνταξη στην λήξη
    private static double ending_per_month_pension(double ending_total_value,int age,int years_until_pension) {
        return (ending_total_value / 12 ) / (85 - (age + years_until_pension));
    }

}