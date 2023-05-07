
interface AnimalEat{
    void eat();
}

interface AnimalWalk{
    void walk();
}
public class Demo implements AnimalEat,AnimalWalk {
    public void eat(){
        System.out.println("animal is eating.");
    }
    public void walk(){
        System.out.println("animal is walking.");
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.eat();
        d.walk();
    }
}
