import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
    //create constructor
    FlowLayoutExample(){
        //create frame
        JFrame f=new JFrame("FlowLayoutExample");

        //create button
        JButton b1=new JButton("B1");
        JButton b2=new JButton("B2");
        JButton b3=new JButton("B3");
        JButton b4=new JButton("B4");

        //add button in frame
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);


        //set layout
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));

        //final code
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        FlowLayoutExample fl=new FlowLayoutExample();
    }
}
