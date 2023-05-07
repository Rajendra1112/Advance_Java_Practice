//Writing data in file and reading data from file using character streams classes


import java.io.*;

public class Demo {
    public static void main(String[] args) {

        //program to create new file and writing data in it.
//        try {
//            FileWriter fw=new FileWriter("D:\\Pratices\\Advance Java\\LatestPractice\\FileWriteRead\\src\\apple.txt");
//            try {
//                fw.write("Apple is a fruit.");
//            }
//            finally {
//                fw.close();
//            }
//        }
//        catch (IOException e){
//            System.out.println("exception handled success.");
//        }


        //Program to read data from file
//        try {
//            FileReader fr=new FileReader("D:\\Pratices\\Advance Java\\LatestPractice\\FileWriteRead\\src\\apple.txt");
//            try {
//                int i;
//                while((i=fr.read())!=-1){
//                    System.out.print((char)i);
//                }
//
//            }
//            finally {
//                fr.close();
//            }
//        }
//        catch (IOException e){
//            System.out.println("exception handled success.");
//        }


        //Program to copy data from one file to another file using character stream classes
        try {
            FileReader fr=new FileReader("D:\\Pratices\\Advance Java\\LatestPractice\\FileWriteRead\\src\\apple.txt");
            FileWriter fw=new FileWriter("D:\\Pratices\\Advance Java\\LatestPractice\\FileWriteRead\\src\\apple1.txt");
            try {
                int i;
                while((i=fr.read())!=-1){
                    fw.write((char)i);
                }
            }
            finally {
                fr.close();
                fw.close();
            }
        }
        catch (IOException e){
            System.out.println("exception handled success.");
        }
    }
}