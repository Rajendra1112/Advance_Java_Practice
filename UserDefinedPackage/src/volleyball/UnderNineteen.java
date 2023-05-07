package volleyball;

public class UnderNineteen {
    void show1(){
        System.out.println("we are under 19.");
    }
}

class UnderEighteen{
    void show2(){
        System.out.println("we are under 18.");
    }
}

class Test{
    public static void main(String[] args) {
        UnderNineteen un1=new UnderNineteen();
        un1.show1();
        UnderEighteen ue1=new UnderEighteen();
        ue1.show2();
    }
}
