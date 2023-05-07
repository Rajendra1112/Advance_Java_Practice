import javax.swing.*;
import java.awt.event.*;

public class Demo extends JFrame {
    JTextField tf1,tf2,tf3;
    JLabel l;
    Demo()
    {
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        l=new JLabel();

        tf1.setBounds(0,0,100,20);
        tf2.setBounds(0,30,100,20);
        tf3.setBounds(0,60,100,20);
        l.setBounds(0,90,100,20);

        add(tf1);
        add(tf2);
        add(tf3);
        add(l);


        tf3.addKeyListener(new K());

        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }
    public class K extends KeyAdapter{
        public void keyPressed(KeyEvent k){
            double n1=Double.parseDouble(tf1.getText());
            double n2=Double.parseDouble(tf2.getText());
            double n3=n1+n2;
            l.setText(String.valueOf(n3));
        }
    }

    public static void main(String[] args) {
        new Demo();
    }
}
