import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class FileReader {
    public static void main(String[] args) {
        try {
        File r = new File("D:\\Pratices\\Advance Java\\LatestPractice\\BuiltInPackages\\src\\hello.txt");
        Scanner sc = new Scanner(r);

            while (sc.hasNextLine()) {
                System.out.println(sc.hasNextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.hasNextLine());
            }
        }
        catch (IOException e){
            System.out.println("exception handled");
        }
    }
}
