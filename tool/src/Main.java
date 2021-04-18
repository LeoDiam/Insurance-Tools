public class Main {
    public static void main(String[] args) {
        System.out.println(ending_total_value_after_revenue_input(100,0,3,0,20,100000));
    }
    //εκτιμηση χρονων μεχρι την συνταξη
    public static void years_until_retirement_estimation(int age, int years_worked) {
        int years_until_pension_evaluation;
        if (62 - age + years_worked >= 40) {
            years_until_pension_evaluation = 62 - age;
        } else if (67 - age + years_worked < 40) {
            years_until_pension_evaluation = 67 - age;
        } else {
            years_until_pension_evaluation = 40 - years_worked;
        }
        System.out.println(years_until_pension_evaluation);
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
            return 53.28;
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
        if (years_worked + years_until_pension >= 20) {
            return 384;
        } else if (years_worked + years_until_pension <= 15) {
            return 345.6;
        } else if (years_worked + years_until_pension == 16) {
            return 353.28;
        } else if (years_worked + years_until_pension == 17) {
            return 360.96;
        } else if (years_worked + years_until_pension == 18) {
            return 369;
        } else if (years_worked + years_until_pension == 19) {
            return 376.32;
        } else {
            return 345.6;
        }
    }

    //σύνταξη
    public static double total_pension(double national_pension, double compensatory_pension) {
        return national_pension + compensatory_pension;
    }

    //ιδιωτική αναγκαία σύνταξη
    public static double private_pension_needed(double wanted_pension, double total_pension) {
        return wanted_pension - total_pension;
    }

    //απαιτούμενο κεφάλαιο
    public static double needed_capital(int age, int years_untill_pension, double wanted_pension, double total_pension) {
        return (85 - age - years_untill_pension) * 12 * (wanted_pension - total_pension);
    }

    //απαιτούμενο κεφάλαιο ανά μήνα
    public static double needed_capital_per_month(double needed_capital, int years_until_pension) {
        return (needed_capital / years_until_pension) / 12;
    }

    //ενδεικτική τελική αξία στην λήξη
    public static double ending_total_value(double starting_monthly_capital, double starting_capital, int year_revenue, int year_change, int years_until_pension) {
        double total_value = 0.0;
        total_value = total_value + starting_capital;
        for (int i = 0; i < years_until_pension; i++) {
            // total_value += (starting_capital * (year_revenue/100));
            starting_monthly_capital = starting_monthly_capital + (starting_monthly_capital * ((double) year_change / 100));
            total_value = total_value + (starting_monthly_capital * 12);
            total_value = total_value + (total_value * ((double) year_revenue / 100));
        }
        return total_value;
    }

    //ενδεικτική μηνιαία σύνταξη στην λήξη
    public static double ending_per_month_pension(double ending_total_value, int age, int years_until_pension) {
        return (ending_total_value / 12) / (85 - (age + years_until_pension));
    }
    //τροποποίηση μηνιαίου ποσού μετά το revenue
    public static double ending_total_value_after_revenue_input(int starting_monthly_capital, double starting_capital, int year_revenue, int year_change, int years_until_pension,int capital_needed_until_pension) {
        double total_value = 0.0;
        total_value = total_value + starting_capital;
        for (int i = 0; i < years_until_pension; i++) {
            // total_value += (starting_capital * (year_revenue/100));

            starting_monthly_capital = starting_monthly_capital + (starting_monthly_capital * ( year_change / 100));
            total_value = total_value + (starting_monthly_capital * 12);
            total_value = total_value + (total_value * ((double) year_revenue / 100));
        }
        return total_value;
    }


}
