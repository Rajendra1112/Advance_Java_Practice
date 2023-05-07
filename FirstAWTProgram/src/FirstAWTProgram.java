import java.awt.*;

public class FirstAWTProgram extends Frame {
    FirstAWTProgram(){  //constructor of created class
        Button b=new Button("Click Here");  //to add component on container first create obj of that component
        b.setBounds(20,30,80,40);   //position and size of button component
        add(b); //add button component in the frame container
        setSize(400,400);   //set size of frame that is window box
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        FirstAWTProgram f1=new FirstAWTProgram();
    }
}
