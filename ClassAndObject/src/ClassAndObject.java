class Demo{
    String f_name="rajendra";
    String l_name="thapa";
    void showInfo(){
        System.out.println("full_name: "+f_name+" "+l_name);
    }
}

class Operation{
    int a,b;
    void printSum(){
        System.out.println("sum: "+(a+b));
    }
    void printSubtraction(){
        System.out.println("sub: "+(a-b));
    }
    void printMultiply(){
        System.out.println("mul: "+(a*b));
    }
    void printDivide(){
        System.out.println("div: "+(a/b));
    }
    void printRemainder(){
        System.out.println("rem: "+(a%b));
    }
}

public class ClassAndObject {
    public static void main(String[] args){
        //object of class Demo
        Demo d1=new Demo();
        d1.showInfo();

        //object of class Operation
        Operation o1=new Operation();
        o1.a=10;
        o1.b=20;
        o1.printSum();
        o1.printSubtraction();
        o1.printMultiply();
        o1.printDivide();
        o1.printRemainder();
    }
}
