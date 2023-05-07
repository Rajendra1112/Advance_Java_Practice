//Example of method overriding
class A{
    void show(){
        System.out.println("Name: Rajendra Thapa");
    }
}

class B extends A{
    void show(){
        System.out.println("Name: Rajendra Thapa");
        System.out.println("Phone No: 984563");
    }
}
public class Demo {
    public static void main(String[] args) {
        B b=new B();
        b.show();   //method inside child class is accessed
    }
}
