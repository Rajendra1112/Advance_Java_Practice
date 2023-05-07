public class Demo {
    int l=10,b=5;
    public void AreaOfRectangle(){
        int a;
        a=l*b;
        System.out.println(a);
    }

    public void PerimeterOfRectangle(){
        int p;
        p=2*(l+b);
        System.out.println(p);
    }
    public static void main(String[] args){
        Demo d=new Demo();
        d.AreaOfRectangle();
        d.PerimeterOfRectangle();
    }
}
