public class Demo {
    double radius;
    Demo(double r){
        radius=r;
    }
    double Area(){
        double a;
        a=3.1415*radius*radius;
        return a;
    }
    double Perimeter(){
        double p;
        p=2*3.1415*radius;
        return p;
    }

    public static void main(String[] args) {
        Demo d=new Demo(7);
        double area=d.Area();
        double perimeter=d.Perimeter();
        System.out.println("area of circle is: "+area);
        System.out.println("perimeter of circle is: "+perimeter);
    }
}
