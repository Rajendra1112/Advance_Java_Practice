
//throw keyword is used to throw exception explicitly
//throw keyword is followed by new keyword as it usually throw customized exception
//so we use throw keyword mainly while creating customized exception

//use of throws keyword is to throw exception to JVM or other method so that they handle
//that exception i.e. if we do not want to handle exception by ourselves then we use throws
//keyword to throw it to JVM or caller method which handle it.

//Example of exception handling using throws keyword and without using throws keywords

//checked exception handling using throws keyword instead of try catch block
public class Demo {
    public static void main(String[] args)throws InterruptedException

    {
        for(int i=0;i<10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}


//checked exception handling using try and catch block instead of throws keyword
//public class Demo {
//    public static void main(String[] args)
//
//    {
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException e){
//                System.out.println(e);
//            }
//        }
//    }
//}
