import javax.swing.*;
import java.awt.event.*;

public class Demo extends JFrame {
    JTextField tf1,tf2;
    JLabel l;
    JButton b;
    Demo()
    {
        tf1=new JTextField();
        tf2=new JTextField();
        b=new JButton();
        l=new JLabel();

        tf1.setBounds(0,0,100,20);
        tf2.setBounds(0,30,100,20);
        b.setBounds(0,60,100,20);
        l.setBounds(0,90,100,20);

        add(tf1);
        add(tf2);
        add(b);
        add(l);


        b.addMouseListener(new M());

        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }
    public class M extends MouseAdapter {
        public void mousePressed(MouseEvent m){
            double n1=Double.parseDouble(tf1.getText());
            double n2=Double.parseDouble(tf2.getText());
            double n3=n1+n2;
            l.setText(String.valueOf(n3));
        }
        public void mouseReleased(MouseEvent m){
            double n1=Double.parseDouble(tf1.getText());
            double n2=Double.parseDouble(tf2.getText());
            double n3=n1-n2;
            l.setText(String.valueOf(n3));
        }
    }

    public static void main(String[] args) {
        new Demo();
    }
}
