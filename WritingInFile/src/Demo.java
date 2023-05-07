import java.io.*;

        //Writing in file using FileWrite class which is character stream class
        //and handling exception using try catch block
public class Demo {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("D:\\Pratices\\Advance Java\\LatestPractice\\WritingInFile\\src\\rajendra.txt");
            try {
                f.write("*** hello nepal ***");
            }
            finally {
                f.close();
            }
            System.out.println("successfully write in file.");
        }
        catch (IOException i){
            System.out.println("Exception Handled Successfully.");
        }
    }
}


//Writing in file using FileWrite class and handling exception by ByPass method.

//class A{
//            public static void main(String[] args)throws IOException {
//                FileWriter f1=new FileWriter("D:\\Pratices\\Advance Java\\LatestPractice\\WritingInFile\\src\\raj.txt");
//                f1.write("hello i am rajendra thapa");
//                f1.close();
//                System.out.println("writing in file is successful.");
//            }
//        }
