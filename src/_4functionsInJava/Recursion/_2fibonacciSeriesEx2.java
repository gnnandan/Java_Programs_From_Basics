package _4functionsInJava.Recursion;

import java.util.Scanner;

public class _2fibonacciSeriesEx2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int result = fibonacciSeries(num);
        System.out.println("The fibonacciSeries of number "+num+" is: "+result);
    }
    static int fibonacciSeries(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
    }
}
