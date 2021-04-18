package com.example.pension_calculation_tool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Intent i = getIntent();
        String ethnikiSyntaji = i.getStringExtra("EthnikiSyntaji");
        String antapodotikoSyntaji = i.getStringExtra("AntapodotikoSyntaji");
        String hlikia = i.getStringExtra("Hlikia");
        String xroniaEosThnSyntaji = i.getStringExtra("XroniaEosThnSyntaji");
        Button continueB = findViewById(R.id.continueButton);
        Button calculateB = findViewById(R.id.calculateButton);
        EditText wanted_pensionT = findViewById(R.id.wanted_pensionT);
        TextView needed_private_pensionT = findViewById(R.id.needed_private_pensionT);
        TextView capital_neededT = findViewById(R.id.capital_neededT);
        TextView starting_monthly_capitalT = findViewById(R.id.starting_monthly_capitalT);
        TextView easierWay = findViewById(R.id.moreLogicalCostV);
        double totalPension = Double.valueOf(ethnikiSyntaji) + Double.valueOf(antapodotikoSyntaji);
        calculateB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double needPp = Double.valueOf(wanted_pensionT.getText().toString()) - totalPension;
                double totalCapitalNeeded = needed_capital(Integer.valueOf(hlikia),Integer.valueOf(xroniaEosThnSyntaji),Double.valueOf(wanted_pensionT.getText().toString()),totalPension);
                needed_private_pensionT.setText(String.valueOf((String.format("%.2f", (needPp)))));
                capital_neededT.setText(String.valueOf((String.format("%.2f", (totalCapitalNeeded)))));
                starting_monthly_capitalT.setText(String.valueOf((String.format("%.2f", (needed_capital_per_month(totalCapitalNeeded,Integer.valueOf(xroniaEosThnSyntaji)))))));
                easierWay.setText("Πατήστε συνέχεια για να βρείτε έναν ευκολότερο και εξυπνότερο τρόπο αποταμίευσης!");
                easierWay.setTextColor(Color.WHITE);
                easierWay.setBackgroundColor(Color.rgb(58, 85, 39));
            }
        });
        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondaryActivity.this, ThirdActivity.class);
                intent.putExtra("XroniaEosThnSyntaji",xroniaEosThnSyntaji);
                intent.putExtra("Hlikia",hlikia);
                startActivity(intent);
            }
        });

    }
    //απαιτούμενο κεφάλαιο
    public static double needed_capital(int age, int years_untill_pension, double wanted_pension, double total_pension) {
        return  (85 - age - years_untill_pension) * 12 * (wanted_pension - total_pension);
    }
    //απαιτούμενο κεφάλαιο ανά μήνα
    private static double needed_capital_per_month(double needed_capital,int years_until_pension) {
        return (needed_capital / years_until_pension) / 12 ;
    }
}