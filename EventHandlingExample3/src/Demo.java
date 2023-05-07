import javax.swing.*;
import java.awt.event.*;

public class Demo extends JFrame implements ActionListener{
    JTextField tf1, tf2, tf3,tf4;
    JLabel l1,l2,l3,l4;

    Demo() {
        l1 = new JLabel("principal:");
        l2 = new JLabel("time:");
        l3 = new JLabel("rate:");
        l4 = new JLabel("simple interest:");


        l1.setBounds(0, 0, 200, 20);
        l2.setBounds(0, 30, 200, 20);
        l3.setBounds(0, 60, 200, 20);
        l4.setBounds(0, 90, 200, 20);


        add(l1);
        add(l2);
        add(l3);
        add(l4);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();

        tf1.setBounds(210, 0, 100, 20);
        tf2.setBounds(210, 30, 100, 20);
        tf3.setBounds(210, 60, 100, 20);
        tf4.setBounds(210, 90, 100, 20);



        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);

        JButton b = new JButton("Calculate");
        b.setBounds(0, 150, 200, 20);
        add(b);

        b.addActionListener(this);

        setLayout(null);
        setSize(400, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        double p = Double.parseDouble(tf1.getText());
        double t = Double.parseDouble(tf2.getText());
        double r = Double.parseDouble(tf3.getText());
        double si=(p*t*r)/100;
        tf4.setText(String.valueOf(si));
    }

    public static void main(String[] args) {
        new Demo();
    }
}

