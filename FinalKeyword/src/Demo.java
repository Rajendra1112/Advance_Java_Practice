class A{
    void mobileNumber(){
        System.out.println("98765");
    }

    final void ATMPin(){
        System.out.println("6666");
    }
}

class B extends A{
    void mobileNumber(){

        System.out.println("This is the mobile no: 98765");
    }

    //final method of parent class cannot be overridden in sub-classes
//    void ATMPin(){
//        System.out.println("6666");
//    }
}

public class Demo {
    public static void main(String[] args) {

        //final variable
        final int A=20;
        System.out.println(A);

        //re-assginment is not possible in final variable
//        A=20;
//        A=30;


        //accessing methods
        B b1=new B();
        b1.mobileNumber();  //sub-class method is accessed
        b1.ATMPin();    //parent class method is accessed
    }
}
