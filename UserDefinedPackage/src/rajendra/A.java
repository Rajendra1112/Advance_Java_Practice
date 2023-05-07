package rajendra;

//Example of private access modifier

//When attributes(fields) or methods are private it can be accessed within class only.
//class A {
//    private int a = 110;
//
//    private void show() {
//        System.out.println("value of a is: " + a);
//    }
//
//    public static void main(String[] args) {
//        A a1 = new A();
//        a1.show();
//    }
//}


//Example of default access modifier
//When attributes or methods are default it can be accessed within class and within package(i.e.
//other classes of the same package also can access them) only.

//public class A {
//    void show() {
//        System.out.println("Hello World!");
//    }
//}

//class B {
//    public static void main(String[] args) {
//        A a1 = new A();
//        a1.show();
//    }
//}



//Example of protected access modifier
//When attributes or methods are protected it can be accessed within class, within package and
//by class of outside package through sub-class (i.e.the accessing class of outside package should be
// sub-class of class where the attributes and methods declared or defined.

public class A {
    protected void show() {
        System.out.println("Hello World!");
    }

}

//class B extends A {
//    public static void main(String[] args) {
//        B a1 = new B();
//        a1.show();
//    }
//}


//Example of public access modifier
//When attributes or methods are public it can be accessed anywhere.
//public class A {
//    public void show() {
//        System.out.println("Hello World!");
//    }
//}

//class B{
//    public static void main(String[] args) {
//        A a1 = new A();
//        a1.show();
//    }
//}


