import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
    //create constructor
    BorderLayoutExample(){
        //create frame
        JFrame f=new JFrame("FlowLayoutExample");

        //create button
        JButton b1=new JButton("B1");
        JButton b2=new JButton("B2");
        JButton b3=new JButton("B3");
        JButton b4=new JButton("B4");
        JButton b5=new JButton("B5");



        //add button in frame
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);



        //final code
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        BorderLayoutExample bl=new BorderLayoutExample();
    }
}
