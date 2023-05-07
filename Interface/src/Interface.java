
//Example of interface in java
import java.util.Scanner;
interface client{
    void input();//by default public and abstract
    void output();//by default public and abstract
}

class Development implements client{
    String name;
    double salary;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        name=sc.nextLine();

        System.out.println("enter your salary:");
        salary=sc.nextDouble();
    }

    public void output(){
        System.out.println("your name is: "+name);
        System.out.println("your salary is: "+salary);
    }

    public static void main(String[] args) {
        client c=new Development();
        c.input();
        c.output();
    }
}