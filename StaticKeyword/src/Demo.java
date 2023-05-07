class Mobile{
    String brand;
    float price;

    //here name variable is common for all the object of mobile class, so it should be static
    static String name;
    void showInfo(){
        System.out.println("brand:"+brand+" "+"price:"+" "+price+"name:"+name);
    }
    static void showInfo1(Mobile obj){
        //non-static variable is not used in static method
        //we indirectly use non-static variable through object reference
        System.out.println("brand:"+obj.brand+" "+"price:"+" "+obj.price+"name:"+name);
    }
}
public class Demo {
    public static void main(String[] args) {

        //mobile 1
        Mobile m1=new Mobile();
        m1.brand="apple";
        m1.price=1234;
        //when instance variable is static then it will be member or part  of class not member or part
        //of object of that class

        //we access static variable through the help of class not through object as value of static
        // variable is common for all the object and there is no need to initialise value of static
        // variable for each object we initialise its value once in program.
        Mobile.name="smart phone";

        //mobile 2
        Mobile m2=new Mobile();
        m2.brand="apple";
        m2.price=1404;



        //accessing above method by obj of the class
        m1.showInfo();
        m2.showInfo();


        //static method is access through help of class and due to the use of non-static variable
        //in static method we need to pass obj of that class as parameter to resolve confusion
        //of whose object value is that.

        Mobile m3=new Mobile();
        m3.brand="vivo";
        m3.price=1100;
        Mobile.showInfo1(m3);
    }
}
