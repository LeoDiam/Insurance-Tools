import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

public class PensionCalculationTool extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel title1 = new JLabel("Κρατική Σύνταξη Γήρατος");
    JLabel title2 = new JLabel("Συμπληρωματική Σύνταξη");
    JLabel title3 = new JLabel("Αποταμιευτικό Πρόγραμμα");

    JLabel userLabel1 = new JLabel("Ηλικία (Τρέχουσα):");
    JLabel userLabel2 = new JLabel("Μηνιαίο Εισόδημα:");
    JLabel userLabel3 = new JLabel("Χρόνια Εργασίας:");
    JLabel userLabel4 = new JLabel("Χρόνια εώς την σύνταξη: ");
    JLabel userLabel5 = new JLabel("Συντελεστής Αναπλήρωσης:");
    JLabel userLabel6 = new JLabel("Ανταποδοτική Σύνταξη:");
    JLabel userLabel7 = new JLabel("Εθνική Σύνταξη:");
    JLabel userLabel8 = new JLabel("Συνολική Σύνταξη:");

    JLabel userLabel11 = new JLabel("Επιθυμητό Σύνολο Σύνταξης:");
    JLabel userLabel22 = new JLabel("Απαιτούμενη Ιδιωτική Σύνταξη:");
    JLabel userLabel33 = new JLabel("Απαιτούμενο Κεφάλαιο");
    //JLabel userLabel44 = new JLabel("(για σύνταξη ως τα 85):");
    JLabel userLabel55 = new JLabel("Απαιτούμενο Αρχικό");
    JLabel userLabel66 = new JLabel("Ποσό Μηνιαίας Αποταμίευσης:");


    JLabel userLabel111 = new JLabel("Αρχικό Ποσό");
    JLabel userLabel222 = new JLabel("Μηνιαίας Αποταμίευσης:");
    JLabel userLabel333 = new JLabel("Αρχικό Ποσό");
    JLabel userLabel444 = new JLabel("Εφάπαξ Καταβολής:");
    JLabel userLabel555 = new JLabel("Ενδεικτική Ετήσια Απόδοση:");
    JLabel userLabel666 = new JLabel("Ετήσια Αναπροσαρμογή(%):");
    JLabel userLabel777 = new JLabel("Ενδεικτική Αξία");
    JLabel userLabel888 = new JLabel("στη Λήξη:");
    JLabel userLabel999 = new JLabel("Ενδεικτική Μηνιαία");
    JLabel userLabel000 = new JLabel("Σύνταξη στη Λήξη:");

    JTextField userLabelT11 = new JTextField(20);
    JTextField userLabelT22 = new JTextField(20);
    JTextField userLabelT33 = new JTextField(20);
    JTextField userLabelT44 = new JTextField(20);

    JTextField userLabelT111 = new JTextField(20);
    JTextField userLabelT222 = new JTextField(20);
    JTextField userLabelT333 = new JTextField(20);
    JTextField userLabelT444 = new JTextField(20);
    JTextField userLabelT555 = new JTextField(20);
    JTextField userLabelT666 = new JTextField(20);


    JTextField userLabelT1 = new JTextField(20);
    JTextField userLabelT2 = new JTextField(20);
    JTextField userLabelT3 = new JTextField(20);
    JTextField userLabelT4 = new JTextField(20);
    JTextField userLabelT5 = new JTextField(20);
    JTextField userLabelT6 = new JTextField(20);
    JTextField userLabelT7 = new JTextField(20);
    JTextField userLabelT8 = new JTextField(20);


    JButton calculate1 = new JButton("ΥΠΟΛΟΓΙΣΜΟΣ");
    JButton clear1 = new JButton("ΕΚΚΑΘΑΡΙΣΗ");
    JButton calculate2 = new JButton("ΥΠΟΛΟΓΙΣΜΟΣ");
    JButton clear2 = new JButton("ΕΚΚΑΘΑΡΙΣΗ");
    JButton calculate3 = new JButton("ΥΠΟΛΟΓΙΣΜΟΣ");
    JButton clear3 = new JButton("ΕΚΚΑΘΑΡΙΣΗ");

    public static void main(String[] args) {

        PensionCalculationTool frame = new PensionCalculationTool();

        frame.setTitle("Συνταξιοδοτικό Πρόγραμμα");
        frame.setVisible(true);
        frame.setBounds(50, 0, 1455, 900);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(155, 183, 212));
        Line2D lin = new Line2D.Float(20, 100, 450, 100);
        Line2D lin2 = new Line2D.Float(20, 100, 20, 560);
        Line2D lin3 = new Line2D.Float(20, 560, 450, 560);
        Line2D lin4 = new Line2D.Float(450, 560, 450, 100);
        g2.draw(lin);
        g2.draw(lin2);
        g2.draw(lin3);
        g2.draw(lin4);
        Line2D lin11 = new Line2D.Float(470, 100, 935, 100);
        Line2D lin22 = new Line2D.Float(470, 100, 470, 560);
        Line2D lin33 = new Line2D.Float(470, 560, 935, 560);
        Line2D lin44 = new Line2D.Float(935, 560, 935, 100);
        g2.draw(lin11);
        g2.draw(lin22);
        g2.draw(lin33);
        g2.draw(lin44);
        Line2D lin111 = new Line2D.Float(945, 100, 1420, 100);
        Line2D lin222 = new Line2D.Float(945, 100, 945, 560);
        Line2D lin333 = new Line2D.Float(945, 560, 1420, 560);
        Line2D lin444 = new Line2D.Float(1420, 560, 1420, 100);
        g2.draw(lin111);
        g2.draw(lin222);
        g2.draw(lin333);
        g2.draw(lin444);
    }


    private PensionCalculationTool() {

        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("D:\\Secret_Project\\tool\\src\\viber_image_2021-04-08_19-42-22.jpg"));
        container.add(background);

        Color textColor = new Color(155, 183, 212);


        title1.setBounds(80, 30, 310, 35);
        userLabel1.setBounds(25, 100, 185, 35);
        userLabel2.setBounds(25, 150, 185, 35);
        userLabel3.setBounds(25, 200, 180, 35);
        userLabel4.setBounds(25, 250, 245, 35);
        userLabel5.setBounds(25, 300, 275, 35);
        userLabel6.setBounds(25, 350, 230, 35);
        userLabel7.setBounds(25, 400, 160, 35);
        userLabel8.setBounds(25, 450, 185, 35);
        calculate1.setBounds(20, 550, 200, 35);
        clear1.setBounds(240, 550, 200, 35);


        title2.setBounds(540, 30, 310, 35);
        userLabel11.setBounds(485, 100, 280, 35);
        userLabel22.setBounds(485, 150, 300, 35);
        userLabel33.setBounds(485, 200, 225, 35);
      //  userLabel44.setBounds(485, 225, 225, 35);
        userLabel55.setBounds(485, 275, 300, 35);
        userLabel66.setBounds(485, 300, 300, 35);
        calculate2.setBounds(485, 550, 200, 35);
        clear2.setBounds(705, 550, 200, 35);

        userLabelT11.setBounds(805, 100, 110, 35);
        userLabelT22.setBounds(805, 150, 110, 35);
        userLabelT33.setBounds(805, 225, 110, 35);
        userLabelT44.setBounds(805, 300, 110, 35);
        userLabelT22.setEditable(false);
        userLabelT33.setEditable(false);
        userLabelT44.setEditable(false);
        title3.setBounds(1010, 30, 320, 35);
        userLabel111.setBounds(940, 100, 240, 35);
        userLabel222.setBounds(940, 125, 240, 35);
        userLabel333.setBounds(940, 175, 198, 35);
        userLabel444.setBounds(940, 200, 198, 35);
        userLabel555.setBounds(940, 250, 277, 35);
        userLabel666.setBounds(940, 300, 273, 35);
        userLabel777.setBounds(940, 350, 160, 35);
        userLabel888.setBounds(940, 375, 160, 35);
        userLabel999.setBounds(940, 425, 190, 35);
        userLabel000.setBounds(940, 450, 190, 35);
        calculate3.setBounds(955, 550, 200, 35);
        clear3.setBounds(1175, 550, 200, 35);
        userLabelT111.setBounds(1230, 125, 110, 35);
        userLabelT222.setBounds(1230, 200, 110, 35);
        userLabelT333.setBounds(1230, 255, 110, 35);
        userLabelT444.setBounds(1230, 305, 110, 35);
        userLabelT555.setBounds(1230, 370, 110, 35);
        userLabelT666.setBounds(1230, 450, 110, 35);

        userLabel11.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel22.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel33.setFont(new Font("Calibre", Font.BOLD, 20));
        //userLabel44.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel55.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel66.setFont(new Font("Calibre", Font.BOLD, 20));
        title1.setFont(new Font("Calibre", Font.BOLD, 25));
        title2.setFont(new Font("Calibre", Font.BOLD, 25));
        title3.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabel11.setForeground(Color.BLACK);
        userLabel22.setForeground(Color.BLACK);
        userLabel33.setForeground(Color.BLACK);
        //userLabel44.setForeground(Color.BLACK);
        userLabel55.setForeground(Color.BLACK);
        userLabel66.setForeground(Color.BLACK);
        title1.setForeground(Color.BLACK);
        title2.setForeground(Color.BLACK);
        title3.setForeground(Color.BLACK);
        userLabel1.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel2.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel3.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel4.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel5.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel6.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel7.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel8.setFont(new Font("Calibre", Font.BOLD, 20));

        userLabel1.setForeground(Color.BLACK);
        userLabel2.setForeground(Color.BLACK);
        userLabel3.setForeground(Color.BLACK);
        userLabel4.setForeground(Color.BLACK);
        userLabel5.setForeground(Color.BLACK);
        userLabel6.setForeground(Color.BLACK);
        userLabel7.setForeground(Color.BLACK);
        userLabel8.setForeground(Color.BLACK);

        userLabel111.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel222.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel333.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel444.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel555.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel666.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel777.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel888.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel999.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel000.setFont(new Font("Calibre", Font.BOLD, 20));

        userLabel111.setForeground(Color.BLACK);
        userLabel222.setForeground(Color.BLACK);
        userLabel333.setForeground(Color.BLACK);
        userLabel444.setForeground(Color.BLACK);
        userLabel555.setForeground(Color.BLACK);
        userLabel666.setForeground(Color.BLACK);
        userLabel777.setForeground(Color.BLACK);
        userLabel888.setForeground(Color.BLACK);
        userLabel999.setForeground(Color.BLACK);
        userLabel000.setForeground(Color.BLACK);

        userLabelT1.setBounds(320, 100, 110, 35);
        userLabelT2.setBounds(320, 150, 110, 35);
        userLabelT3.setBounds(320, 200, 110, 35);
        userLabelT4.setBounds(320, 250, 110, 35);
        userLabelT5.setBounds(320, 300, 110, 35);
        userLabelT6.setBounds(320, 350, 110, 35);
        userLabelT7.setBounds(320, 400, 110, 35);
        userLabelT8.setBounds(320, 450, 110, 35);
        userLabelT5.setEditable(false);
        userLabelT6.setEditable(false);
        userLabelT7.setEditable(false);
        userLabelT8.setEditable(false);
        userLabelT111.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT222.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT333.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT444.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT555.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT666.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT555.setEditable(false);
        userLabelT666.setEditable(false);

        userLabelT1.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT2.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT3.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT4.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT5.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT6.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT7.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT8.setFont(new Font("Calibre", Font.BOLD, 25));

        userLabelT11.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT22.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT33.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT44.setFont(new Font("Calibre", Font.BOLD, 25));

        userLabelT111.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT222.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT333.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT444.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT555.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT666.setFont(new Font("Calibre", Font.BOLD, 25));

        title1.setBackground(textColor);
        title2.setBackground(textColor);
        title3.setBackground(textColor);
        userLabel1.setBackground(textColor);
        userLabel2.setBackground(textColor);
        userLabel3.setBackground(textColor);
        userLabel4.setBackground(textColor);
        userLabel5.setBackground(textColor);
        userLabel6.setBackground(textColor);
        userLabel7.setBackground(textColor);
        userLabel8.setBackground(textColor);
        userLabel11.setBackground(textColor);
        userLabel22.setBackground(textColor);
        userLabel33.setBackground(textColor);
        //userLabel44.setBackground(textColor);
        userLabel55.setBackground(textColor);
        userLabel66.setBackground(textColor);
        userLabel111.setBackground(textColor);
        userLabel222.setBackground(textColor);
        userLabel333.setBackground(textColor);
        userLabel444.setBackground(textColor);
        userLabel555.setBackground(textColor);
        userLabel666.setBackground(textColor);
        userLabel777.setBackground(textColor);
        userLabel888.setBackground(textColor);
        userLabel999.setBackground(textColor);
        userLabel000.setBackground(textColor);
        calculate1.setBackground(textColor);
        clear1.setBackground(textColor);
        calculate2.setBackground(textColor);
        clear2.setBackground(textColor);
        calculate3.setBackground(textColor);
        clear3.setBackground(textColor);

        title1.setOpaque(true);
        title2.setOpaque(true);
        title3.setOpaque(true);

        userLabel1.setOpaque(true);
        userLabel2.setOpaque(true);
        userLabel3.setOpaque(true);
        userLabel4.setOpaque(true);
        userLabel5.setOpaque(true);
        userLabel6.setOpaque(true);
        userLabel7.setOpaque(true);
        userLabel8.setOpaque(true);
        userLabel11.setOpaque(true);
        userLabel22.setOpaque(true);
        userLabel33.setOpaque(true);
        //userLabel44.setOpaque(true);
        userLabel55.setOpaque(true);
        userLabel66.setOpaque(true);
        userLabel111.setOpaque(true);
        userLabel222.setOpaque(true);
        userLabel333.setOpaque(true);
        userLabel444.setOpaque(true);
        userLabel555.setOpaque(true);
        userLabel666.setOpaque(true);
        userLabel777.setOpaque(true);
        userLabel888.setOpaque(true);
        userLabel999.setOpaque(true);
        userLabel000.setOpaque(true);


        background.add(userLabel1);
        background.add(userLabel2);
        background.add(userLabel3);
        background.add(userLabelT1);
        background.add(userLabelT2);
        background.add(userLabelT3);
        background.add(userLabelT4);
        background.add(userLabelT5);
        background.add(userLabelT6);
        background.add(userLabelT7);
        background.add(userLabelT8);
        background.add(userLabel4);
        background.add(userLabel5);
        background.add(userLabel6);
        background.add(userLabel7);
        background.add(userLabel8);
        background.add(userLabel11);
        background.add(userLabel22);
        background.add(userLabel33);
        //background.add(userLabel44);
        background.add(userLabel55);
        background.add(userLabel66);

        background.add(userLabelT11);
        background.add(userLabelT22);
        background.add(userLabelT33);
        background.add(userLabelT44);

        background.add(userLabelT111);
        background.add(userLabelT222);
        background.add(userLabelT333);
        background.add(userLabelT444);
        background.add(userLabelT555);
        background.add(userLabelT666);
        background.add(userLabel111);
        background.add(userLabel222);
        background.add(userLabel333);
        background.add(userLabel444);
        background.add(userLabel555);
        background.add(userLabel666);
        background.add(userLabel777);
        background.add(userLabel888);
        background.add(userLabel999);
        background.add(userLabel000);
        background.add(title1);
        background.add(title2);
        background.add(title3);
        background.add(calculate1);
        background.add(calculate2);
        background.add(calculate3);
        background.add(clear1);
        background.add(clear2);
        background.add(clear3);
        calculate1.addActionListener(this);
        clear1.addActionListener(this);
        calculate2.addActionListener(this);
        clear2.addActionListener(this);
        calculate3.addActionListener(this);
        clear3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color wrongColor = new Color(210, 86, 58);
        Color rightColor = new Color(58, 85, 39);
        if (e.getSource() == calculate1) {
            int years_worked = Integer.parseInt(userLabelT3.getText());
            int years_until_pension = Integer.parseInt(userLabelT4.getText());
            int average_salary = Integer.parseInt(userLabelT2.getText());
            userLabelT5.setText(String.valueOf(Main.rate_of_return(years_worked, years_until_pension)));
            userLabelT5.setBackground(rightColor);
            userLabelT6.setBackground(rightColor);
            userLabelT6.setText(String.format("%.2f", Main.compensatory_pension(average_salary, Main.rate_of_return(years_worked, years_until_pension))));
            userLabelT7.setBackground(rightColor);
            userLabelT7.setText(String.format("%.2f", Main.national_pension(years_worked, years_until_pension)));
            userLabelT8.setBackground(rightColor);
            userLabelT8.setText(String.format("%.2f", Main.total_pension(Main.national_pension(years_worked, years_until_pension), Main.compensatory_pension(average_salary, Main.rate_of_return(years_worked, years_until_pension)))));
            userLabelT5.setForeground(Color.WHITE);
            userLabelT6.setForeground(Color.WHITE);
            userLabelT7.setForeground(Color.WHITE);
            userLabelT8.setForeground(Color.WHITE);

        } else if (e.getSource() == calculate2) {
            int years_worked = Integer.parseInt(userLabelT3.getText());
            int years_until_pension = Integer.parseInt(userLabelT4.getText());
            int average_salary = Integer.parseInt(userLabelT2.getText());
            int wanted_pension = Integer.parseInt(userLabelT11.getText());
            int age = Integer.parseInt(userLabelT1.getText());
            userLabelT22.setText(String.valueOf((int) Main.private_pension_needed(wanted_pension, (int) Main.total_pension(Main.national_pension(years_worked, years_until_pension), Main.compensatory_pension(average_salary, Main.rate_of_return(years_worked, years_until_pension))))));
            userLabelT22.setBackground(rightColor);
            userLabelT33.setText(String.valueOf((int) Main.needed_capital(age, years_until_pension, wanted_pension, (int) Main.total_pension(Main.national_pension(years_worked, years_until_pension), Main.compensatory_pension(average_salary, Main.rate_of_return(years_worked, years_until_pension))))));
            userLabelT33.setBackground(rightColor);
            userLabelT44.setBackground(wrongColor);
            userLabelT44.setText(String.format("%.2f", Main.needed_capital_per_month(Main.needed_capital(age, years_until_pension, wanted_pension, Main.total_pension(Main.national_pension(years_worked, years_until_pension), Main.compensatory_pension(average_salary, Main.rate_of_return(years_worked, years_until_pension)))), years_until_pension)));
            userLabelT22.setForeground(Color.WHITE);
            userLabelT33.setForeground(Color.WHITE);
            userLabelT44.setForeground(Color.WHITE);

        } else if (e.getSource() == calculate3) {
            int starting_capital_per_month = Integer.parseInt(userLabelT111.getText());
            int starting_capital = Integer.parseInt(userLabelT222.getText());
            int revenue = Integer.parseInt(userLabelT333.getText());
            int enalaktiko_starting_per_month_capital = Integer.parseInt(userLabelT44.getText());
            int age = Integer.parseInt(userLabelT1.getText());
            int change = Integer.parseInt(userLabelT444.getText());
            int years_until_pension = Integer.parseInt(userLabelT4.getText());
            userLabelT555.setBackground(rightColor);
            userLabelT666.setBackground(rightColor);
            userLabelT44.setBackground(rightColor);
  //          userLabelT44.setText(String.format("%.2f",Main.ending_total_value(enalaktiko_starting_per_month_capital, starting_capital, revenue, change, years_until_pension)));
            userLabelT555.setText(String.valueOf((int) Main.ending_total_value(starting_capital_per_month, starting_capital, revenue, change, years_until_pension)));
            userLabelT666.setText(String.format("%.2f", Main.ending_per_month_pension(Main.ending_total_value(starting_capital_per_month, starting_capital, revenue, change, years_until_pension), age, years_until_pension)));
            userLabelT555.setForeground(Color.WHITE);
            userLabelT666.setForeground(Color.WHITE);
        } else if (e.getSource() == clear1) {
            userLabelT1.setText(" ");
            userLabelT2.setText(" ");
            userLabelT3.setText(" ");
            userLabelT4.setText(" ");
            userLabelT5.setText(" ");
            userLabelT6.setText(" ");
            userLabelT7.setText(" ");
            userLabelT8.setText(" ");

        } else if (e.getSource() == clear2) {
            userLabelT11.setText(" ");
            userLabelT22.setText(" ");
            userLabelT33.setText(" ");
            userLabelT44.setText(" ");
        } else if (e.getSource() == clear3) {
            userLabelT111.setText(" ");
            userLabelT222.setText(" ");
            userLabelT333.setText(" ");
            userLabelT444.setText(" ");
            userLabelT555.setText(" ");
            userLabelT666.setText(" ");

        }
    }

}