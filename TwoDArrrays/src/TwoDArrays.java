import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args){
        //2-D Arrays
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number of rows and columns of matrix:");
//        int rows=sc.nextInt();
//        int columns=sc.nextInt();
//        int[][] matrix=new int[rows][columns];
//        System.out.println("enter the elements of the matrix:");
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

        //to search element in given 2-D Arrays
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns of matrix:");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int[][] matrix=new int[rows][columns];
        System.out.println("enter the elements of the matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the element to search and display its indices:");
        int x=sc.nextInt();
        System.out.println("the required matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Indices of entered number " + x + " is " + "(" + i + "," + j + ")");
                    break;
                }
            }
        }
        System.out.println("elements of matrix along with their corresponding indices:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("(" + i + "," + j + ")"+"="+matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
