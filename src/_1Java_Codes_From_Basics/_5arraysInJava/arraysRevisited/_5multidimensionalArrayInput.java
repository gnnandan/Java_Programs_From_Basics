package _1Java_Codes_From_Basics._5arraysInJava.arraysRevisited;

import java.util.Scanner;

public class _5multidimensionalArrayInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in array: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns in array: ");
        int columns = scanner.nextInt();

        //note
        int arr[][] = new int[row][columns];

        //forloop to take input
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print("Enter the elements for row: "+i+" and column: "+j+" = ");
                arr[i][j] = scanner.nextInt();
            }
        }


        System.out.println();
        //forloop to display data
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
