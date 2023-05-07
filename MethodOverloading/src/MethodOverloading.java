import java.lang.reflect.Method;

class Methods{

    //Example 1 of method overloading
    void printInfo(){
        int age=22;
        String name="manoj";
        System.out.println(age+" "+name);
    }
    void printInfo(int Age){
        System.out.println(Age);
    }

    void printInfo(int Age, String Name){
        System.out.println(Age+" "+Name);
    }


    //Example 2 of method overloading
    void sum(){
        int a=11,b=13,c;
        c=a+b;
        System.out.println(c);
    }

    void sum(int y){
        int a=10,b=y,c;
        c=a+b;
        System.out.println(c);
    }

    void sum(int x,int y){
        int a=x,b=y,c;
        c=a+b;
        System.out.println(c);
    }

    void sum(int x,double y){
        int a=x;
        double b=y;
        double c=a+b;
        System.out.println(c);
    }

}
public class MethodOverloading {
    public static void main(String[] args){
        Methods m1=new Methods();

        //calling methods of same name and compiler called method according to the parameter passed
        m1.printInfo();
        m1.printInfo(20);
        m1.printInfo(20,"rajendra thapa");

        //calling methods of same name and compiler called method according to the parameter passed
        m1.sum();
        m1.sum(12);
        m1.sum(11,77);
        m1.sum(12,33.26);
    }
}
