import javax.swing.*;
import java.awt.event.*;

public class Sum extends JFrame implements ActionListener{
    JFrame f;
    JTextField tf1,tf2,tf3;
    JButton b;
    JLabel l1,l2,l3;
    Sum(){
        f=new JFrame("sum");
        l1=new JLabel("first number:");
        l1.setBounds(0,0,100,20);
        tf1=new JTextField();
        tf1.setBounds(100,0,100,20);


        l2=new JLabel("second number:");
        l2.setBounds(0,40,100,20);
        tf2=new JTextField();
        tf2.setBounds(100,40,100,20);

        b=new JButton("SUM");
        b.setBounds(30,80,100,20);

        l3=new JLabel("sum:");
        l3.setBounds(0,120,100,20);
        tf3=new JTextField();
        tf3.setBounds(100,120,100,20);

        add(l1);
        add(tf1);

        add(l2);
        add(tf2);

        add(b);

        add(l3);
        add(tf3);

        b.addActionListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent a){
        int n1=Integer.parseInt(tf1.getText());
        int n2=Integer.parseInt(tf2.getText());
        int n3=n1+n2;
        tf3.setText(String.valueOf(n3));
    }

    public static void main(String[] args){
        new Sum();
    }
}

