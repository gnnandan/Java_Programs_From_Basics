package _5arraysInJava;

import java.util.Scanner;

public class _4arrayAndWhileLoopEX4
{
    public static void main(String[] args)
    {
        int i;
        System.out.println("This program is only accept and store the even numbers");

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the length of numbers: ");
        //int len = scanner.nextInt();
        int[] arr = new int[4];

        i=0;
//        int num;
//        System.out.println("Enter the number: ");
//        num = scanner.nextInt();
        while(i<4)
        {
            System.out.println("Enter the number: ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.print("The array contents are: ");
        i=0;
        while(i < 4)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}
