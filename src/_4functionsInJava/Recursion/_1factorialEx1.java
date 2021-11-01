package _4functionsInJava.Recursion;

import java.util.Scanner;

public class _1factorialEx1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int result = factorial(num);
        System.out.println("The factorial of number "+num+" is: " + result);
    }
    static int factorial(int n)
    {
        if(n==0)
        {
            //recursion happening here
            return 1;
        }
        else
        {
            //recursion happening here
            return(n * factorial(n-1));
        }
    }
}
