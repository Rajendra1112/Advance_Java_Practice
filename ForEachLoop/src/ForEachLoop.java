import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args){

        //Array
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of array:");
//        int size=sc.nextInt();
//        int[] a=new int[size];
//        System.out.println("enter the elements of array:");
//        for(int i=0;i<a.length;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.println("elements of array are:");
//
//        //for each loop
//        for(int elementsOfArray: a){
//            System.out.println(elementsOfArray);
//        }

        //ArrayList
        ArrayList<Integer> list=new ArrayList<Integer>();


        //operations in ArrayList
        //add element
        list.add(111);
        list.add(2);
        list.add(4);
        list.add(7);
        System.out.println("required list is: "+list);

        //get element
        int number=list.get(2);
        System.out.println("element that we get is: "+number);

        //add element in between
        list.add(1,77);
        System.out.println("resulted list after adding element in between is: "+list);

        //set element
        list.set(2,99);
        System.out.println("resulted list after set operation is: "+list);

        //remove element
        list.remove(3);
        System.out.println("final list after removing element is: "+list);

        //size of an ArrayList
        int sizeOfArrayList=list.size();
        System.out.println("size of an ArrayList is : "+sizeOfArrayList);


        //iteration on ArrayList
        //implementation of loops in ArrayList

        //for loop
        System.out.print("remaining elements in ArrayList after different operations are: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //for each loop
        for(int elementsInArrayList:list){
            System.out.println(elementsInArrayList);
        }

        //sorting the ArrayList using function defined in Collections class
        Collections.sort(list);
        System.out.println("final list after sorting element: "+list);

//     int[] a=new int[10];
//     for(int m=0;m<a.length;m++){
//         a[m]=m;
//     }
//     for(int n:a){
//         System.out.println(n);
//     }
    }
}
