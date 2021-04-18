package com.example.pension_calculation_tool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ageT = findViewById(R.id.starting_per_monthT);
        EditText monthlyIncomeT = findViewById(R.id.starting_capitalT);
        EditText yearsWorkedT = findViewById(R.id.yearRevenueT);
        EditText yearsUntillPensionT = findViewById(R.id.yearsChangeT);
        TextView sintelestisAnaplirosisT = findViewById(R.id.finalValueT);
        TextView compensationalPensionT = findViewById(R.id.finalValuePerMonthT);
        TextView nationalPensionT = findViewById(R.id.nationalPensionT);
        TextView totalPensionT = findViewById(R.id.totalPensionT);
        Button continueB = findViewById(R.id.continueButtonThird);
        Button calculate = findViewById(R.id.calculateButtonThird);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sintelestisAnaplirosisT.setText(String.valueOf(rate_of_return(Integer.parseInt(yearsWorkedT.getText().toString()), Integer.parseInt(yearsUntillPensionT.getText().toString()))), TextView.BufferType.EDITABLE);
                double sintelestisAnaplir = rate_of_return(Integer.parseInt(yearsWorkedT.getText().toString()), Integer.parseInt(yearsUntillPensionT.getText().toString()));
                double antapodotikiSintaji = compensatory_pension(Integer.parseInt(monthlyIncomeT.getText().toString()),sintelestisAnaplir);
                compensationalPensionT.setText(String.valueOf(String.format("%.2f", (antapodotikiSintaji))));
                double ethnikiSintaji = national_pension(Integer.parseInt(yearsWorkedT.getText().toString()), Integer.parseInt(yearsUntillPensionT.getText().toString()));
                nationalPensionT.setText(String.valueOf((String.format("%.2f", (ethnikiSintaji)))));
                totalPensionT.setText(String.valueOf((String.format("%.2f", (ethnikiSintaji+antapodotikiSintaji)))));

            }
        });
        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("EthnikiSyntaji",String.valueOf(national_pension(Integer.parseInt(yearsWorkedT.getText().toString()), Integer.parseInt(yearsUntillPensionT.getText().toString()))));
                intent.putExtra("AntapodotikoSyntaji",String.valueOf(compensatory_pension(Integer.parseInt(monthlyIncomeT.getText().toString()),rate_of_return(Integer.parseInt(yearsWorkedT.getText().toString()), Integer.parseInt(yearsUntillPensionT.getText().toString())))));
                intent.putExtra("Hlikia",ageT.getText().toString());
                intent.putExtra("XroniaEosThnSyntaji",yearsUntillPensionT.getText().toString());
                startActivity(intent);
            }
        });

    }
    //συντελεστης αναπληρωσης
    public static double rate_of_return(int years_worked, int years_until_pention) {
        if (years_worked + years_until_pention <= 15) {
            return 11.55;
        } else if (years_worked + years_until_pention == 16) {
            return 12.39;
        } else if (years_worked + years_until_pention == 17) {
            return 13.23;
        } else if (years_worked + years_until_pention == 18) {
            return 14.07;
        } else if (years_worked + years_until_pention == 19) {
            return 14.97;
        } else if (years_worked + years_until_pention == 20) {
            return 15.87;
        } else if (years_worked + years_until_pention == 21) {
            return 16.77;
        } else if (years_worked + years_until_pention == 22) {
            return 17.73;
        } else if (years_worked + years_until_pention == 23) {
            return 18.69;
        } else if (years_worked + years_until_pention == 24) {
            return 19.65;
        } else if (years_worked + years_until_pention == 25) {
            return 20.68;
        } else if (years_worked + years_until_pention == 26) {
            return 21.71;
        } else if (years_worked + years_until_pention == 27) {
            return 22.74;
        } else if (years_worked + years_until_pention == 28) {
            return 23.95;
        } else if (years_worked + years_until_pention == 29) {
            return 25.16;
        } else if (years_worked + years_until_pention == 30) {
            return 27.14;
        } else if (years_worked + years_until_pention == 31) {
            return 29.12;
        } else if (years_worked + years_until_pention == 32) {
            return 31.10;
        } else if (years_worked + years_until_pention == 33) {
            return 33.08;
        } else if (years_worked + years_until_pention == 34) {
            return 35.58;
        } else if (years_worked + years_until_pention == 35) {
            return 38.08;
        } else if (years_worked + years_until_pention == 36) {
            return 40.58;
        } else if (years_worked + years_until_pention == 37) {
            return 43.13;
        } else if (years_worked + years_until_pention == 38) {
            return 45.68;
        } else if (years_worked + years_until_pention == 39) {
            return 48.23;
        } else if (years_worked + years_until_pention == 40) {
            return 50.78;
        } else if (years_worked + years_until_pention == 41) {
            return 51.28;
        } else if (years_worked + years_until_pention == 42) {
            return 51.78;
        } else if (years_worked + years_until_pention == 43) {
            return 52.28;
        } else if (years_worked + years_until_pention == 44) {
            return 52.78;
        } else if (years_worked + years_until_pention == 45) {
            return 53.78;
        }else if (years_worked + years_until_pention == 46) {
            return 54.28;
        }else if (years_worked + years_until_pention == 47) {
            return 54.68;
        }else if (years_worked + years_until_pention == 48) {
            return 55.18;
        } else {
            return 0.0;
        }
    }
    //ανταποδοτικη συνταξη
    public static double compensatory_pension(int average_salary, double rate_of_return) {
        rate_of_return /= 100;
        return average_salary * rate_of_return;
    }
    //εθνική σύνταξη
    public static double national_pension(int years_worked, int years_until_pension) {
        if (years_worked+years_until_pension >= 20){
            return 384;
        }else if (years_worked+years_until_pension <= 15){
            return 345.6;
        }else if (years_worked+years_until_pension == 16){
            return 353.28;
        }else if (years_worked+years_until_pension == 17){
            return 360.96;
        }else if (years_worked+years_until_pension == 18){
            return 369;
        }else if (years_worked+years_until_pension == 19){
            return 376.32;
        }else{
            return 345.6;
        }
    }

}