import javax.swing.*;
import java.awt.event.*;

public class MyOwnClass extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3;
    MyOwnClass(){
        JLabel l1,l2,l3;
        l1=new JLabel("first number:");
        l2=new JLabel("second number:");
        l3=new JLabel("result:");

        l1.setBounds(0,0,200,20);
        l2.setBounds(0,30,200,20);
        l3.setBounds(0,60,200,20);

        add(l1);
        add(l2);
        add(l3);

        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();

        tf1.setBounds(210,0,100,20);
        tf2.setBounds(210,30,100,20);
        tf3.setBounds(210,60,100,20);

        add(tf1);
        add(tf2);
        add(tf3);

        JButton b=new JButton("Multiply");
        b.setBounds(0,100,200,20);
        add(b);

        b.addActionListener(this);

        setLayout(null);
        setSize(400,500);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent a){
        int n1=Integer.parseInt(tf1.getText());
        int n2=Integer.parseInt(tf2.getText());
        int n3=n1*n2;
        tf3.setText(String.valueOf(n3));
    }

    public static void main(String[] args) {
         new MyOwnClass();
    }
}