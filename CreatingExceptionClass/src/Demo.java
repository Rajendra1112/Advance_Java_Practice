
//user defined exception
class InvalidAgeException extends Exception{
    InvalidAgeException(String str)
    {
        System.out.println(str);
    }
}
public class Demo {
    public static void main(String[] args) {
        try {
            testForVoting(22);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    public static void testForVoting(int age)throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("not eligible for voting");
        }
        else {
            System.out.println("eligible for voting");
        }
    }
}
