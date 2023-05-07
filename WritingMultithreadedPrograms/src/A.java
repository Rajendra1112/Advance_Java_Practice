
//creating thread

//By extending thread class
//class B extends Thread{
//    //overriding run() method which is defined in super-class Thread
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println("rajendra");
//        }
//    }
//}
//
//public class A {
//    public static void main(String[] args) {
//        B b=new B();
//        b.start();
//    }
//}

//by implementing runnable interface
class MakingThread implements Runnable{
    public void run(){
        System.out.println("new thread is running");
    }
}

public  class A{
    public static void main(String[] args) {
        MakingThread m=new MakingThread();
        Thread t=new Thread(m);
        t.start();
    }
}


