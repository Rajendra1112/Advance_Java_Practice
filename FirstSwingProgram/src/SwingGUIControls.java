import javax.swing.*;
public class SwingGUIControls {
    SwingGUIControls(){
        JFrame f=new JFrame("SwingGUIControls");


        JLabel l1=new JLabel("First Name:");
        l1.setBounds(0,0,100,20);
        f.add(l1);
        JTextField tf1=new JTextField();
        tf1.setBounds(100,0,100,20);
        f.add(tf1);


        JLabel l2=new JLabel("Last Name:");
        l2.setBounds(0,50,100,20);
        f.add(l2);
        JTextField tf2=new JTextField();
        tf2.setBounds(100,50,100,20);
        f.add(tf2);

        JLabel l3=new JLabel("Password:");
        l3.setBounds(0,100,100,20);
        f.add(l3);
        JPasswordField p=new JPasswordField();
        p.setBounds(100,100,100,20);
        f.add(p);

        JRadioButton jb1=new JRadioButton("Male");
        JRadioButton jb2=new JRadioButton("Female");
        jb1.setBounds(0,150,100,50);
        jb2.setBounds(100,150,100,50);
        ButtonGroup bg=new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        f.add(jb1);
        f.add(jb2);

        JLabel l4=new JLabel("Leave Comment Here.");
        l4.setBounds(0,200,150,20);
        f.add(l4);
        JTextArea ta=new JTextArea();
        ta.setBounds(150,200,200,100);
        f.add(ta);

        JCheckBox cb1=new JCheckBox("KTM");
        cb1.setBounds(0,300,100,50);
        f.add(cb1);
        JCheckBox cb2=new JCheckBox("BHA");
        cb2.setBounds(100,300,100,50);
        f.add(cb2);
        JCheckBox cb3=new JCheckBox("LAL");
        cb3.setBounds(200,300,100,50);
        f.add(cb3);
        JCheckBox cb4=new JCheckBox("SIU");
        cb4.setBounds(300,300,100,50);
        f.add(cb4);

        JLabel l5= new JLabel("Country:");
        l5.setBounds(0,350,100,20);
        f.add(l5);

        String[] countryName={"nepal","india","china","usa","canada"};
        JComboBox cb=new JComboBox(countryName);
        cb.setBounds(0,370,100,20);
        f.add(cb);

        String[][] data={ {"1","Ram","Thapa"},{"2","Ramila","Thapa"}};
        String[] tableHead={"SN","firstname","lastname"};
        JTable t=new JTable(data,tableHead);
        t.setBounds(0,400,300,50);
        f.add(t);

        JButton b1=new JButton("Submit");
        b1.setBounds(0,500,100,20);
        f.add(b1);



        f.setLayout(null);
        f.setSize(400,800);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new SwingGUIControls();
    }
}
