class Pen{
    String color;
    String type;
    int length;
    int cost;
    public void write(){
        System.out.println("used to write.");
    }

    public void info(){
        System.out.println("Color of the pen is: "+this.color);
        System.out.println("Type of the pen is: "+this.type);
        System.out.println("Length of the pen is: "+this.length+"cm");
        System.out.println("Cost of the pen is: $"+this.cost);
    }

    Pen(){

    }
    Pen(String color,String type,int length,int cost){
        this.color=color;
        this.type=type;
        this.length=length;
        this.cost=cost;

    }
}

class Bird{
    int weight=200;
    String birdName;
    public void printName(){
        System.out.println("Name of bird is: "+this.birdName);
    }
}

class Student{
    String sName;
    int sAge;

    //function overloading
    public void studentInfo(String s_name)
    {
        this.sName=s_name;
        System.out.println(sName);
    }

    public void studentInfo(int s_age)
    {
        this.sAge=s_age;
        System.out.println(sAge);
    }

    public void studentInfo(String s_name,int s_age)
    {
        this.sName=s_name;
        this.sAge=s_age;
        System.out.println("name: "+sName+"\n"+"age: "+sAge);
    }
}

public class OOPS {
    public static void main(String[] args){
        Pen p1=new Pen();   //first object of Pen class
        p1.color="yellow";
        p1.type="ballpoint";
        p1.length=8;
        p1.cost=10;
        p1.write();

        System.out.println("information of pen 1:");
        p1.info();

        System.out.println("information of pen 2:");
        Pen p2=new Pen("green","gel",7,15); //second obj of Pen class
        p2.info();

        Bird b1=new Bird(); //first object of Bird class

        //accessing properties defined in Bird class through its object.
        System.out.println("Weight of bird is: "+b1.weight+"pounds.");



        Bird b2=new Bird();
        b2.birdName="Peacock";
        Bird b3=new Bird();
        b3.birdName="Crow";
        //accessing method defined in Bird class through its object.
        b2.printName();
        b3.printName();

        //function overloading
        Student s1=new Student();
        s1.studentInfo(24);
        s1.studentInfo("rajendra");
        s1.studentInfo("ramkumar",20);

        //function overloading
        Student s2=new Student();
        s2.sName="Bhim";
        s2.sAge=15;
        s2.studentInfo(s2.sName,s2.sAge);
    }
}
