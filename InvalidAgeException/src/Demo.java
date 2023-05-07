class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
public class Demo {
    public static void main(String[] args) {
        try {
            voting(2);
        }
        catch (Exception e){
            System.out.println("user defined exception handled.");
        }
        finally {
            System.out.println("finally block is always executed.");
        }
    }
    public static void voting(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("not eligible for voting.");
        }
        else {
            System.out.println("eligible for voting.");
        }
    }
}
