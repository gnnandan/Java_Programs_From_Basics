package _1Java_Codes_From_Basics._14exceptionHandlingInJava;

import java.util.Scanner;

public class _1ExceptionEx1
{
    public static void main(String[] args)
    {
        exceptionRaised exceptionRaised = new exceptionRaised();
        exceptionRaised.exceptionEx();
    }
}

class exceptionRaised
{
    public void exceptionEx()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("A exception raised here: "+(a/b));// 10/0 is causing exception here
    }
}
