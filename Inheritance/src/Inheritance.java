//Example of single inheritance
class A {
    void methodInA(){
        System.out.println("method in A parent class.");
    }
}

class B extends A{
    void methodInB(){
        System.out.println("method in B sub class.");
    }

}
public  class Inheritance {
    public static void main(String[] args) {
        B b1=new B();
        b1.methodInA();
        b1.methodInB();
    }
}


//Example of multilevel inheritance

//class A {
//    void methodInA(){
//        System.out.println("method in A parent class.");
//    }
//}
//
//class B extends A{
//    void methodInB(){
//        System.out.println("method in B sub class.");
//    }
//}
//
//class C extends B{
//    void methodInC(){
//        System.out.println("method in C sub class.");
//    }
//
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        C c1=new C();
//        c1.methodInA();
//        c1.methodInB();
//        c1.methodInC();
//
//    }
//}


//Example of Hierarchical inheritance
//class A {
//    void methodInA(){
//        System.out.println("method in A parent class.");
//    }
//}
//
//class B extends A{
//    void methodInB(){
//        System.out.println("method in B sub class.");
//    }
//
//}
//
//class C extends A{
//    void methodInC(){
//        System.out.println("method in C sub class.");
//    }
//
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        B b1=new B();
//        b1.methodInA();
//        b1.methodInB();
//        C c1=new C();
//        c1.methodInA();
//        c1.methodInC();
//    }
//}

//Multiple inheritance using interface
//interface A{
//    void show();
//}
//
//interface B{
//    void show();
//}
//
////class c implements both requirement of client A nad B as both have same requirements show();
//class C implements A,B{
//    public void show(){
//        System.out.println("implementation of methods of interface A and B");
//    }
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        C c1=new C();
//        c1.show();
//    }
//}