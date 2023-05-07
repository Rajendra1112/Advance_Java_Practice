import java.io.*;


//Reading data from file using FileReader which is character stream class
//and handling exception using try catch block
public class Demo {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("D:\\Pratices\\Advance Java\\LatestPractice\\ReadingFromFile\\src\\r.txt");
            try {
                int i;
                while ((i=fr.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally {
                fr.close();
            }

        }
        catch (IOException i)
        {
            System.out.println("exception handle.");
        }
    }
}
