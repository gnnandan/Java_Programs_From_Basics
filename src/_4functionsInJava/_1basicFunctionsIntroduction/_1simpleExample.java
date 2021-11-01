package _4functionsInJava._1basicFunctionsIntroduction;

import java.util.Scanner;

public class _1simpleExample
{
    public static void main(String[] args)
    {
        sum();//calling method
    }
    static void sum()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();

        int sum = a+b;
        System.out.println("The sum of a:"+a+" and b:"+b+" is :"+sum);
    }
}
