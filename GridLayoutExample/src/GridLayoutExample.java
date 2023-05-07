import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    GridLayoutExample(){
        JFrame f=new JFrame("GridLayoutExample");

        JButton b1=new JButton("B1");
        JButton b2=new JButton("B2");
        JButton b3=new JButton("B3");
        JButton b4=new JButton("B4");
        JButton b5=new JButton("B5");
        JButton b6=new JButton("B6");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);

        f.setLayout(new GridLayout(2,3));
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
