class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                System.out.println(i);
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println("exception handled successfully.");
            }

        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for(int i=11;i<=20;i++){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("exception handled successfully.");
            }

        }
    }
}
public class Demo {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
