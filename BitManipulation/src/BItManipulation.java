import java.util.Scanner;

public class BItManipulation {
    public static void main(String[] args){


        //Bitwise Manipulation or Bit Masking

        // 1) Get Bit operation to get bit of any position of given number
        //Example 1
//        int n=5;    //5=0101
//        int i=3;  //4th bit as we count from right so we are going to get 0 from 0101
//        int bitMask=1<<i; //1<<3 i.e. shift left to 0001 by 3 unit i.e. 1000
//        if((bitMask & n)==0){   //do AND operation betwn to bitMask and n we get 0000 which is zero value..
//            System.out.println("bit was zero");
//        }else{
//            System.out.println("bit was one");
//        }

        //Example 2
//        int n=7;    //7=0111
//        int i=1;  //2nd bit as we count from right so we are going to get 1 from 0111
//        int bitMask=1<<i; //1<<1 i.e. shift left to 0001 by 1 unit i.e. 0010
//        if((bitMask & n)==0){   //do AND operation betwn to bitMask and n we get 0010 which is non-zero value.
//            System.out.println("bit was zero");
//        }else{
//            System.out.println("bit was one");
//        }


        // 2) Set Bit operation to set 0 bit to 1

//        int n=7;
//        int i=3;
//        int bitMask=1<<i;
//        int newNumber=bitMask | n;
//        System.out.println(newNumber);

        // 3) Clear Bit operation to clear bit of any position of given number i.e. to make 0 bit

//        int n=5;
//        int i=2;
//        int bitMask=1<<i;
//        int notBitMask=~bitMask;
//        int newNumber=notBitMask & n;
//        System.out.println(newNumber);


        //Update operation to update bit of any position from 0 to 1 or from 1 to 0
        int n=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 for clear operation and 1 for set operation:");
        int operation=sc.nextInt();
        System.out.println("enter position of bit to update its value:");
        int i=sc.nextInt();
        int  bitMask=1<<i;
        if(operation==1){
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }else{
            int notBitMask=~bitMask;
            int newNumber=notBitMask & n;
            System.out.println(newNumber);
        }
    }
}
