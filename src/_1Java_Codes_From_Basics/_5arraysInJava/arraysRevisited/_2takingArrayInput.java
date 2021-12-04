package _1Java_Codes_From_Basics._5arraysInJava.arraysRevisited;

import java.util.Scanner;

public class _2takingArrayInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");

        int lenArr= scanner.nextInt();

        int[] elements = new int[lenArr];

        //(taking input array elements)
        for(int i=0;i<elements.length;i++)
        {
            System.out.print("Enter the number: ");
            elements[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.print("The elements of array is: ");

        //(displaying the elements)
        for (int data : elements)
        {
            System.out.print(data*data+" ");
        }
    }
}
