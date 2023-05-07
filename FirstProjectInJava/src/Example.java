
//import java.util.*;
public class Example {
    public static void main(String[] args) {



/*
    //to print on different line or in same line
    System.out.println("hello world");
    System.out.print("from rajendra thapa\n");
    System.out.print("who lives in nepal");


//to print some easy patterns
    System.out.println("\n*");
    System.out.println("**");
    System.out.println("***");
    System.out.println("****");


// to perform basic math operations on two integers
        int a=10;
        int b=20;
        int sum=a+b;
        int mul=a*b;
        int div=a/b;
        int sub=a-b;
        System.out.println("sum="+sum);
        System.out.println("mul="+mul);
        System.out.println("div="+div);
        System.out.println("sub="+sub);


//to take input of type integers from user and print sum of that input
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum: "+sum);


        //to take input as string:
        //to take single token(word) and print
        Scanner s1=new Scanner(System.in);
        String f_name=s1.next();
        System.out.println(f_name);


        //to take multiple tokens(words) and print
        Scanner s2=new Scanner(System.in);
        String full_name=s2.nextLine();
        System.out.println(full_name);


// if, else if, else condition
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the number for checking:");
        int a=sn.nextInt();
        if(a>10)
            System.out.println("You entered "+a+" which is greater than 10.");
        else if(a==10)
            System.out.println("You entered "+a+" which is equal to 10.");
        else
            System.out.println("You entered "+a+" which is less than 10.");


//if,else if,else second example
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("enter third number:");
        int c=sc.nextInt();
        if(a>b){
            if(a>c)
                System.out.println(a+" is the greatest number.");
            else
                System.out.println(c+" is the greatest number.");
        }
        else if(b>c)
            System.out.println(b+" is the greatest number.");
        else
            System.out.println(c+" is the greatest number.");


        //switch condition
        System.out.println("enter the first three letter of a day:");
Scanner day=new Scanner(System.in);
String day_name=day.next();
switch (day_name){
    case "sun":
        System.out.println("you choose sunday");
        break;
    case "mon":
        System.out.println("you choose monday");
        break;
    case "tue":
        System.out.println("you choose tuesday");
        break;
    case "wed":
        System.out.println("you choose wednesday");
        break;
    case "thu":
        System.out.println("you choose thursday");
        break;
    case "fri":
        System.out.println("you choose friday");
        break;
    case "sat":
        System.out.println("you choose saturday");
    default:
        System.out.println("invalid option");
}
System.out.println("end of switch condition");


        //for loop
for(int i=0;i<=10;i++){
    System.out.println(i);
}


     //while loop
        int a=0;
        while(a<=5)
        {
            System.out.println(a);
            a++;
        }


        //do while loop
        int a=0;
        do{
            System.out.println(a);
            a++;
        } while(a<=5);


        //to print
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n?");
        n=sc.nextInt();

        //using for loop
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of first "+n+" natural number using for loop is:"+sum);


        //using while loop
        int count=1;
        sum=0;
        while(count<=n)
        {
            sum=sum+count;
            count=count+1;
        }
        System.out.println("sum of first "+n+" natural number using while loop is:"+sum);



//using do while loop
        count=1;
        sum=0;
        do{
            sum=sum+count;
            count=count+1;
        }while(count<=n);
        System.out.println("sum of first "+n+" natural number using do while loop is:"+sum);


   //print the multiplication table of entered number
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find its multiplication table?");
        n=sc.nextInt();
        int sum=n;
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+sum);
            sum=sum+n;
        }

//to print pattern of solid rectangle
*****
*****
*****
*****

int n=4;    //no of rows
int m=5;    //no of columns
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for columns
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }


//to print patter of hollow rectangle
*****
*   *
*   *
*****
        int n=4;    //no of rows
        int m=5;    //no of columns
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for columns
            for(int j=1;j<=m;j++){
                //cell=(i,j) i.e. we are in ith and jth cell
                //print those cells only where value of i=1 or j=1 or i=n or j=m
                if(i==1 || j==1 || i==n || j==m)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        //to print patter of half pyramid

*
**
***
****
        int n=4;    //no of rows
            //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for columns
            for(int j=1;j<=i;j++){
                //cell=(i,j) i.e. we are in ith and jth cell
                    System.out.print("*");
            }
            System.out.println();
        }

        //to print patter of inverted half pyramid
****
***
**
*
        int n=4;    //no of rows
        //outer loop for rows
        for(int i=n;i>=1;i--){
            //inner loop for columns
            for(int j=1;j<=i;j++){
                //cell=(i,j) i.e. we are in ith and jth cell
                System.out.print("*");
            }
            System.out.println();
        }


//to print patter of half pyramid rotate through 180 degree
   *
  **
 ***
****
        int n=4;//for no of rows
        //outer for loop for rows
        for(int i=1;i<=n;i++){

            //inner for loop to print space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //inner for loop to print *
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }



//to print following patter
1
12
123
1234
12345
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


//to print following pattern
12345
1234
123
12
1

        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


//to print following pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


        int n=5;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }


//to print following pattern
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }



//to print following pattern
1 0 1 0 1
0 1 0 1
1 0 1
0 1
1
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

//to print following pattern
    1
   01
  101
 0101
10101

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }


//to print following pattern
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


// to print following pattern
    *****
   *****
  *****
 *****
*****
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }


//to print following pattern
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);//to print number in each row equal to row no times
                System.out.print(" ");
            }
            System.out.println();
        }


//
    1
   212
  32123
 4321234
543212345


        int n=5;//for no of rows
        //outer for loop for rows
        for(int i=1;i<=n;i++){

            //inner for loop to print space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //inner for loop to print first half of  number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            //inner for loop to print second half of  number
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

//diamond pattern
   *
  ***
 *****
*******
*******
 *****
  ***
   *

        int n=4;

        //for first pyramid
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for second inverted pyramid
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
    }
}
