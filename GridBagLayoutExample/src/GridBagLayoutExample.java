
import java.awt.*;
import javax.swing.*;
public class GridBagLayoutExample extends GridBagLayout  {
    public static void main(String[] args) {
        JFrame f=new JFrame("GridBagLayoutExample");
        JButton b1=new JButton("button-1");
        JButton b2=new JButton("button-2");
        JButton b3=new JButton("button-3");
        JButton b4=new JButton("button-4");

        try {
            GridBagConstraints g=new GridBagConstraints();
            g.gridx=0;
            g.gridy=0;
            f.add(b1,g);

            g.gridx=1;
            g.gridy=1;
            f.add(b2,g);

            g.gridx=2;
            g.gridy=2;
            f.add(b3,g);

            g.gridx=3;
            g.gridy=3;
            f.add(b4,g);
        }
        catch (Exception e){
            System.out.println(e);
        }

        f.setLayout(new GridBagLayout());
        f.setSize(400,400);
        f.setVisible(true);
    }

}
