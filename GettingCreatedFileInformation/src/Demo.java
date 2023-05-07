import java.io.*;
public class Demo {
    public static void main(String[] args) {
        File f=new File("D:\\Pratices\\Advance Java\\LatestPractice\\CreatingNewFile\\src\\rajendra.txt");
        if(f.exists()){
            System.out.println("file name: "+f.getName());
            System.out.println("file location: "+f.getAbsolutePath());
            System.out.println("file size: "+f.length());
            System.out.println("Writable: "+f.canWrite());
            System.out.println("Readable: "+f.canRead());
        }
        else
        {
            System.out.println("File doesn't exits in given location.");
        }
    }

}
