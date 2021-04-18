import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

public class TermCalculationTool extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel userLabel1 = new JLabel("Ηλικία Ασφαλιζόμενου:");
    JLabel userLabel2 = new JLabel("Κεφάλαιο Ασφαλιζόμενο:");
    JLabel userLabel3 = new JLabel("Διάρκεια (εώς 25 έτη):");
    JLabel userLabel4 = new JLabel("Ετήσιο Ασφάλιστρο Πρώτου Έτους = ");
    JLabel userLabel5 = new JLabel("Μέσο Ασφάλιστρο 10 πρώτων Ετών = ");
    JLabel userLabel11 = new JLabel("Μηνιαίο Μέσο Εισόδημα:");
    JLabel userLabel22 = new JLabel("Περιουσιακά Στοιχεία:");
    JLabel userLabel33 = new JLabel("Ηλικία παιδιού 1(αν υπάρχει):");
    JLabel userLabel44 = new JLabel("Ηλικία παιδιού 2(αν υπάρχει):");
    JLabel userLabel55 = new JLabel("Ηλικία παιδιού 3(αν υπάρχει):");
    JLabel userLabel66 = new JLabel("Ηλικία παιδιού 4(αν υπάρχει):");
    JLabel userLabel77 = new JLabel("Ηλικία παιδιού 5(αν υπάρχει):");
    JLabel userLabel88 = new JLabel("Υπολοιπόμενο δάνειο(αν υπάρχει):");
    JLabel userLabel99 = new JLabel("Διάρκεια Δανείου:");
    JTextField userLabelT1 = new JTextField(20);
    JTextField userLabelT2 = new JTextField(20);
    JTextField userLabelT3 = new JTextField(20);
    JTextField userLabelT11 = new JTextField(20);
    JTextField userLabelT22 = new JTextField(20);
    JTextField userLabelT33 = new JTextField(20);
    JTextField userLabelT44 = new JTextField(20);
    JTextField userLabelT55 = new JTextField(20);
    JTextField userLabelT66 = new JTextField(20);
    JTextField userLabelT77 = new JTextField(20);
    JTextField userLabelT88 = new JTextField(20);
    JTextField userLabelT99 = new JTextField(20);

    JButton calculate1 = new JButton("ΥΠΟΛΟΓΙΣΜΟΣ");
    JButton clear1 = new JButton("ΕΚΚΑΘΑΡΙΣΗ");

    JButton calculate2 = new JButton("ΥΠΟΛΟΓΙΣΜΟΣ");
    JButton clear2 = new JButton("ΕΚΚΑΘΑΡΙΣΗ");

    public static void main(String[] args) {
        TermCalculationTool frame = new TermCalculationTool();
        frame.setTitle("Υπολογισμός Ασφαλίστρου");
        frame.setVisible(true);
        frame.setBounds(350, 100, 1300, 700);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(155, 183, 212));
        Line2D lin1 = new Line2D.Float(20, 100, 494, 100);
        Line2D lin2 = new Line2D.Float(20, 100, 20, 560);
        Line2D lin3 = new Line2D.Float(20, 560, 494, 560);
        Line2D lin4 = new Line2D.Float(494, 560, 494, 100);
        g2.draw(lin1);
        g2.draw(lin2);
        g2.draw(lin3);
        g2.draw(lin4);
        g2.setColor(new Color(155, 183, 212));
        Line2D lin11 = new Line2D.Float(525, 100, 1025, 100);
        Line2D lin22 = new Line2D.Float(525, 100, 525, 600);
        Line2D lin33 = new Line2D.Float(525, 600, 1025, 600);
        Line2D lin44 = new Line2D.Float(1025, 600, 1025, 100);
        g2.draw(lin11);
        g2.draw(lin22);
        g2.draw(lin33);
        g2.draw(lin44);
    }

    private TermCalculationTool() {
        //container.setLayout(null);
        setLayout(new BorderLayout());
        container.setBackground(Color.WHITE);
        JLabel background = new JLabel(new ImageIcon("D:\\Term_Calculation_Tool\\src\\viber_image_2021-04-06_08-48-54.jpg"));
        container.add(background);
        userLabel1.setBounds(30, 100, 300, 35);
        userLabel2.setBounds(30, 150, 300, 35);
        userLabel3.setBounds(30, 200, 300, 35);
        userLabel4.setBounds(20, 300, 460, 35);
        userLabel5.setBounds(13, 350, 470, 35);

        userLabel11.setBounds(535, 70, 300, 35);
        userLabel33.setBounds(535, 120, 350, 35);
        userLabel44.setBounds(535, 170, 350, 35);
        userLabel55.setBounds(535, 220, 350, 35);
        userLabel66.setBounds(535, 270, 350, 35);
        userLabel77.setBounds(535, 320, 350, 35);
        userLabel88.setBounds(535, 370, 370, 35);
        userLabel22.setBounds(535, 420, 300, 35);
        userLabel99.setBounds(535, 470, 300, 35);
        clear2.setBounds(565, 520, 110, 35);
        calculate2.setBounds(790, 520, 120, 35);
        userLabelT11.setBounds(780, 70, 110, 35);
        userLabelT22.setBounds(747, 420, 110, 30);
        userLabelT33.setBounds(827, 120, 110, 30);
        userLabelT44.setBounds(827, 170, 110, 30);
        userLabelT55.setBounds(827, 220, 110, 30);
        userLabelT66.setBounds(827, 270, 110, 30);
        userLabelT77.setBounds(823, 320, 110, 30);
        userLabelT88.setBounds(875, 370, 110, 30);
        userLabelT99.setBounds(710, 470, 110, 30);

        userLabel11.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel22.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel33.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel44.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel55.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel66.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel77.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel88.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel99.setFont(new Font("Calibre", Font.BOLD, 20));
        userLabel11.setForeground(Color.BLACK);
        userLabel22.setForeground(Color.BLACK);
        userLabel33.setForeground(Color.BLACK);
        userLabel44.setForeground(Color.BLACK);
        userLabel55.setForeground(Color.BLACK);
        userLabel66.setForeground(Color.BLACK);
        userLabel77.setForeground(Color.BLACK);
        userLabel88.setForeground(Color.BLACK);
        userLabel99.setForeground(Color.BLACK);

        userLabel1.setFont(new Font("Calibre", Font.BOLD, 22));
        userLabel2.setFont(new Font("Calibre", Font.BOLD, 22));
        userLabel3.setFont(new Font("Calibre", Font.BOLD, 22));
        userLabel4.setFont(new Font("Calibre", Font.BOLD, 22));
        userLabel5.setFont(new Font("Calibre", Font.BOLD, 22));
        userLabel1.setForeground(Color.BLACK);
        userLabel2.setForeground(Color.BLACK);
        userLabel3.setForeground(Color.BLACK);
        userLabel4.setForeground(Color.BLACK);
        userLabel5.setForeground(Color.BLACK);
        /*
        userLabel4.setBackground(Color.GRAY);
        userLabel5.setBackground(Color.GRAY);
        */
        userLabel4.setOpaque(true);
        userLabel5.setOpaque(true);
        userLabelT1.setBounds(340, 100, 110, 35);

        userLabelT2.setBounds(340, 150, 110, 35);


        userLabelT3.setBounds(340, 200, 110, 35);


        calculate1.setBounds(60, 250, 150, 35);


        userLabelT1.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT2.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT3.setFont(new Font("Calibre", Font.BOLD, 25));

        userLabelT11.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT33.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT44.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT55.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT66.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT77.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT88.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT99.setFont(new Font("Calibre", Font.BOLD, 25));
        userLabelT22.setFont(new Font("Calibre", Font.BOLD, 25));

        clear1.setBounds(300, 250, 150, 35);
        /*
        calculate1.setBackground(Color.GRAY);
        clear1.setBackground(Color.GRAY);
        */
        calculate1.setForeground(Color.BLACK);
        clear1.setForeground(Color.BLACK);
        userLabelT1.setOpaque(false);
        userLabelT2.setOpaque(false);
        userLabelT3.setOpaque(false);
        background.add(userLabel1);
        background.add(userLabel2);
        background.add(userLabel3);
        background.add(userLabel4);
        background.add(userLabel5);
        background.add(userLabelT1);
        background.add(userLabelT2);
        background.add(userLabelT3);
        background.add(calculate1);
        background.add(clear1);
        background.add(userLabel11);

        background.add(userLabel33);
        background.add(userLabel44);
        background.add(userLabel55);
        background.add(userLabel66);
        background.add(userLabel77);
        background.add(userLabel88);
        background.add(userLabel99);
        background.add(calculate2);
        background.add(clear2);
        background.add(userLabelT11);
        background.add(userLabel22);
        background.add(userLabelT22);
        background.add(userLabelT33);
        background.add(userLabelT44);
        background.add(userLabelT55);
        background.add(userLabelT66);
        background.add(userLabelT77);
        background.add(userLabelT88);
        background.add(userLabelT99);
        calculate1.addActionListener(this);
        clear1.addActionListener(this);
        calculate2.addActionListener(this);
        clear2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculate1) {
            String duration = userLabelT3.getText();
            String age = userLabelT1.getText();
            String capital = userLabelT2.getText();
            if (Integer.parseInt(age) < 18 || Integer.parseInt(age) > 60) {
                JOptionPane.showMessageDialog(this,
                        "Ο ασφαλιζόμενος πρέπει να είναι άνω των 18 και κάτω των 60.",
                        "Ηλικία",
                        JOptionPane.WARNING_MESSAGE);

            } else if (duration.equals("") || age.equals("") || capital.equals("")) {
                JOptionPane.showMessageDialog(this,
                        "Όλα τα πεδία πρέπει να είναι συμπληρωμένα.",
                        "Πεδία",
                        JOptionPane.WARNING_MESSAGE);
            } else if (Integer.parseInt(duration) < 10) {
                JOptionPane.showMessageDialog(this,
                        "Η διάρκεια πρέπει να είναι άνω των 10 ετών.",
                        "Διάρκεια",
                        JOptionPane.WARNING_MESSAGE);
            } else {

                double firstFee = FeeCalculator.calculateFirstFee(Integer.parseInt(age), Integer.parseInt(capital));
                userLabel4.setText("Ετήσιο Ασφάλιστρο Πρώτου Έτους = " + String.format("%.2f", (firstFee + 30)));
                double averageFirstTenYears = 0.0;
                for (int i = 0; i < 10; i++) {
                    averageFirstTenYears += FeeCalculator.calculateFirstFee(Integer.parseInt(age) + i, Integer.parseInt(capital));
                }
                averageFirstTenYears += 30;
                averageFirstTenYears = averageFirstTenYears / 10;
                userLabel5.setText("Μέσο Ασφάλιστρο 10 πρώτων Ετών = " + String.format("%.2f", averageFirstTenYears));
            }
        } else if (e.getSource() == clear1) {
            userLabelT1.setText("");
            userLabelT2.setText("");
            userLabelT3.setText("");
        } else if (e.getSource() == clear2) {
            userLabelT11.setText("");
            userLabelT33.setText("");
            userLabelT44.setText("");
            userLabelT55.setText("");
            userLabelT66.setText("");
            userLabelT77.setText("");
            userLabelT88.setText("");

        } else if (e.getSource() == calculate2) {
            String salary = userLabelT11.getText();
            String childAge1 = userLabelT33.getText();
            String childAge2 = userLabelT44.getText();
            String childAge3 = userLabelT55.getText();
            String childAge4 = userLabelT66.getText();
            String childAge5 = userLabelT77.getText();
            String fortune = userLabelT22.getText();
            String loan = userLabelT88.getText();
            String loanDuration = userLabelT99.getText();
            int total_insurance_needed = 0;
            total_insurance_needed = total_insurance_needed + Integer.parseInt(salary) * 12 * 3;
            total_insurance_needed += Integer.parseInt(fortune) * 0.1;
            if (!loan.equals("")) {
                total_insurance_needed += total_insurance_needed + Integer.parseInt(loan);
            }
            if (!childAge1.equals("")) {
                for (int i = Integer.parseInt(childAge1); i <= 25; i++) {
                    total_insurance_needed += childAge(i);
                }
            }
            if (!childAge2.equals("")) {
                for (int i = Integer.parseInt(childAge2); i <= 25; i++) {
                    total_insurance_needed += childAge(i);
                }
            }
            if (!childAge3.equals("")) {
                for (int i = Integer.parseInt(childAge3); i <= 25; i++) {
                    total_insurance_needed += childAge(i);
                }
            }
            if (!childAge4.equals("")) {
                for (int i = Integer.parseInt(childAge4); i <= 25; i++) {
                    total_insurance_needed += childAge(i);
                }
            }
            if (!childAge5.equals("")) {
                for (int i = Integer.parseInt(childAge5); i <= 25; i++) {
                    total_insurance_needed += childAge(i);
                }
            }
            userLabelT2.setText(String.valueOf(total_insurance_needed));
            double firstFee = FeeCalculator.calculateFirstFee(Integer.parseInt(userLabelT1.getText()), total_insurance_needed);
            userLabel4.setText("Ετήσιο Ασφάλιστρο Πρώτου Έτους = " + String.format("%.2f", (firstFee + 30)));
            double averageFirstTenYears = 0.0;
            for (int i = 0; i < 10; i++) {
                averageFirstTenYears += FeeCalculator.calculateFirstFee(Integer.parseInt(userLabelT1.getText()) + i, total_insurance_needed);
            }
            averageFirstTenYears += 30;
            averageFirstTenYears = averageFirstTenYears / 10;
            userLabel5.setText("Μέσο Ασφάλιστρο 10 πρώτων Ετών = " + String.format("%.2f", averageFirstTenYears));
            if(childAge1.equals("")){
                childAge1 = "0";
            } if(childAge2.equals("")){
                childAge2 = "0";
            } if(childAge3.equals("")){
                childAge3 = "0";
            } if(childAge4.equals("")){
                childAge4 = "0";
            } if(childAge5.equals("")){
                childAge5 = "0";
            }
            int [] child = {Integer.parseInt(childAge1),Integer.parseInt(childAge2),Integer.parseInt(childAge3),Integer.parseInt(childAge4),Integer.parseInt(childAge5)};
            int youngestChild = findMin(child);
            if(loanDuration.equals("")){
                loanDuration = "0";
            }
            int value = (25 - youngestChild);
            if (value > Integer.parseInt(loanDuration)){
                userLabelT3.setText(String.valueOf(value));
            }else{
                userLabelT3.setText(loanDuration);
            }
        }
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for(int i=1;i<array.length;i++) {
            if(min > array[i] && array[i] != 0) {
                min = array[i];
            }
        }
        return min;
    }

    public static int childAge(int childAge1) {
        if (childAge1 == 1) {//panes brefika
            return 2000;
        } else if (childAge1 == 2) {//diafora ejoda
            return 1300;
        } else if (childAge1 == 3) {
            return 1300;
        } else if (childAge1 == 4) {
            return 1300;
        } else if (childAge1 == 5) {
            return 1300;
        } else if (childAge1 == 6) {//agglika drasthriothtes kaysima
            return 160 * 12;
        } else if (childAge1 == 7) {
            return 170 * 12;
        } else if (childAge1 == 8) {
            return 180 * 12;
        } else if (childAge1 == 9) {
            return 190 * 12;
        } else if (childAge1 == 10) {
            return 200 * 12;
        } else if (childAge1 == 11) {
            return 210 * 12;
        } else if (childAge1 == 12) {
            return 220 * 12;
        } else if (childAge1 == 13) {
            return 230 * 12;
        } else if (childAge1 == 14) {
            return 240 * 12;
        } else if (childAge1 == 15) {
            return 250 * 12;
        } else if (childAge1 == 16) {
            return 360 * 12;
        } else if (childAge1 == 17) {
            return 500 * 12;
        } else if (childAge1 == 18) {
            return 460 * 12;
        } else if (childAge1 == 19) {
            return 560 * 12;
        } else if (childAge1 == 20) {
            return 560 * 12;
        } else if (childAge1 == 21) {
            return 560 * 12;
        } else if (childAge1 == 22) {
            return 560 * 12;
        } else {
            return 150;
        }
    }

}