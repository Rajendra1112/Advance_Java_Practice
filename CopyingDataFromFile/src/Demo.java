import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try {

            FileInputStream fr = new FileInputStream("D:\\Pratices\\Advance Java\\LatestPractice\\CopyingDataFromFile\\src\\apple1.txt");
            FileOutputStream fw = new FileOutputStream("D:\\Pratices\\Advance Java\\LatestPractice\\CopyingDataFromFile\\src\\apple2.txt");
            try {
                int i;
                while ((i = fr.read()) != -1) {
                    fw.write((char)i);
                }
            }
                finally{
                    fr.close();
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("exception handled.");
            }
        }
    }
