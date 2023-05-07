import java.io.*;
public class Demo {
    public static void main(String[] args) {
        File f=new File("D:\\Pratices\\Advance Java\\LatestPractice\\CreatingNewFile\\src\\rajendra.txt");
        try {
            if(f.createNewFile()){
                System.out.println("new file created successfully...!");
            }
            else {
                System.out.println("file already exist...!");
            }

        }
        catch (IOException i){
            System.out.println("IOException was handled successfully...!");
        }

    }
}
