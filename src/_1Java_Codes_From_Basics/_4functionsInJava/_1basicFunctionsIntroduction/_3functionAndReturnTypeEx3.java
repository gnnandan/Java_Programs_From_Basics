package _4functionsInJava;

import java.util.Scanner;

public class _3functionAndReturnTypeEx3
{
    public static void main(String[] args)
    {
        int a,b,c,sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        b = scanner.nextInt();
        System.out.print("Enter number 3: ");
        c = scanner.nextInt();

        sum = sumOfNumber(a,b,c);
        System.out.println("The sum of "+a+", "+b+", "+c+" = "+sum);

    }
    static int sumOfNumber(int i, int j, int k)
    {
        int sum = i+j+k;
        return sum;
    }
}
