import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Demo extends JFrame implements ActionListener{ //ActionListener interface is implemented
    JTextField tf;
    Demo(){
        tf=new JTextField();
        tf.setBounds(100,50,100,20);
        add(tf);
        JButton b1=new JButton("Click Here");
        b1.setBounds(100,100,100,50);
        add(b1);

        b1.addActionListener(this); //Registration

        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
       tf.setText("Hello Nepal");
    }

    public static void main(String[] args) {
        new Demo();
    }
}