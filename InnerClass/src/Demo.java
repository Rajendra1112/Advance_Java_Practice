class A{
    int age;
    public void show(){
        System.out.println("inside show method");
    }
    class B{
        public void display(){
            System.out.println("inside display method");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        A a1=new A();
        a1.show();
        A.B b1=a1.new B();
        b1.display();
    }
}
