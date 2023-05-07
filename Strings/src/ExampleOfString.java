import java.util.Scanner;

public class ExampleOfString {
    public static void main(String []args){
        //String is a class so it is a non primitive data type
        // Some methods that are defined in String class

        // + sign==> For String concatenation
//        String fName="rajendra";
//        String lName="thapa";
//        String fullName=fName+" "+lName;    // In string space is also a valid character
//        System.out.println(fullName);


        // .length() ==> to find length of string
//        System.out.println(fullName.length());



        // to access each character of string as we know that string is a sequence of character
        // .charAt() ==> to access character of string in that index
//        for(int i=0;i<fullName.length();i++){
//            System.out.println(fullName.charAt(i));
//        }


        //comparing strings
        //s1>s2 if value is +ve
        //s1=s2 if value is 0
        //s1<s2 if value is -ve


        //example 1 here s1>s2
//        String name1="ramz";
//        String name2="ramy";
//        if(name1.compareTo(name2)==0){
//            System.out.println("strings are equal.");
//        } else if (name1.compareTo(name2)>0) {
//            System.out.println("string "+name1+" is greater than string "+name2);
//        }
//        else{
//            System.out.println("string "+name1+" is less than string "+name2);
//        }


        //example 2 here s1<s2
//        String name3="rama";
//        String name4="ramb";
//        if(name3.compareTo(name4)==0){
//            System.out.println("strings are equal.");
//        } else if (name3.compareTo(name4)>0) {
//            System.out.println("string "+name3+" is greater than string "+name4);
//        }
//        else{
//            System.out.println("string "+name3+" is less than string "+name4);
//        }


        //example 3 here s1=s2
//        String name5="apple";
//        String name6="apple";
//        if(name5.compareTo(name6)==0){
//            System.out.println("strings are equal.");
//        } else if (name5.compareTo(name6)>0) {
//            System.out.println("string "+name5+" is greater than string "+name6);
//        }
//        else{
//            System.out.println("string "+name5+" is less than string "+name6);
//        }

        //strings comparision using .compareTO(String_name) method
//        String name1="ramz";
//        String name2="ramy";
//        System.out.println(name1.compareTo(name2));
//        System.out.println(name2.compareTo(name1));


        //taking string as input
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter full name and address:");
//        String name=sc.nextLine();
//        String address=sc.next();
//        System.out.println("Name is: "+name+"\nAddress is: "+address);

        //.substring(initial index,final index)
        //Example 1
//        String message="Hello my name is Rajendra.";
//        System.out.println(message.substring(17,message.length()));

        //Example 2
//        String message1="Hello";
//        System.out.println(message1.substring(1,4));
        //Note: Here last index is non inclusive i.e. searching goes up to 3rd index when 4 is mention


        //StringBuilder data type
//        StringBuilder sb=new StringBuilder("Rajendra");
//        System.out.println("value stored in sb: "+sb);


        //Some methods related to StringBuilder data type

        // .charAT(index) => access char of any index of StringBuilder and we can use it too.
//        System.out.println(sb.charAt(4));

        // .setCharAt(index,'char_value') => set char at any index
//        sb.setCharAt(0,'G');
//        System.out.println("value of sb after char set on 0th index: "+sb);

        //.insert(index,'char_value') => insert char at any index will shift the old index towards
        //right i.e. old index will become old index+1
//        sb.insert(sb.length(),'e');
//        System.out.println("value of sb after inserting char: "+sb);

        //.delete(initial index,final index) => delete char or substring from StringBound
//        sb.delete(2,6);
        //Note: Here last index is non-inclusive i.e. searching goes up to 5th index when 6 is mention
//        System.out.println("value of sb after deleting characters: "+sb);

        //Example 2
//        StringBuilder name2=new StringBuilder("Rakesh");
//        System.out.println(name2.delete(3,8));
//
//        sb.append("endra");
//        sb.append('a');
//        System.out.println(sb);

        //.length() method => to find length or size of StringBuilder
//        System.out.println(sb.length());;
//        System.out.println(name2.length());;

        //reverse string i.e. reverse value of StringBuilder
//        StringBuilder message=new StringBuilder("hello nepal");
//        for(int i=0;i<message.length()/2;i++){
//            int front=i;
//            int back=message.length()-1-i;
//            char frontchar=message.charAt(front);
//            char backchar=message.charAt(back);
//            message.setCharAt(front,backchar);
//            message.setCharAt(back,frontchar);
//        }
//        System.out.println(message);


        //reversing string using .reverse() method
//        message=message.reverse();
//        System.out.println(message);


        int a=10;
        int b=20;
        System.out.println(a==b);//false
        System.out.println(a!=b);//true
        System.out.println(a<b);//true
        System.out.println(a>b);//false
        System.out.println(a<=b);//true
        System.out.println(a>=b);//false

    }
}
