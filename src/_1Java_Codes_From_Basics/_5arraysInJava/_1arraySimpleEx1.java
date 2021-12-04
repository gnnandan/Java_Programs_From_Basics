package _1Java_Codes_From_Basics._5arraysInJava;

import java.util.Scanner;

public class _1arraySimpleEx1
{
    public static void main(String[] args)
    {
        //declaring required variables
        int i;
        Scanner scanner = new Scanner(System.in);

        //array declaration and initialization
        int[] id = {80, 70, 60, 77, 88, 70};
        //position     0    1   2   3   4   5

        //accessing array elements
        System.out.println("The marks of subject 2: "+id[1]);

        //finding the array length
        System.out.println("The length of the array is: "+id.length);

        //looping/iterating through the array
        // -------way 1----------
        for(i=0;i<=id.length-1;i++)
        {
            System.out.print(id[i]+" ");
        }

        System.out.println();

        //looping/iterating through the array
        // -------way 2----------
        for(int j : id)
        {
            System.out.print(j+" ");
        }
    }

}
