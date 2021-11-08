package _4functionsInJava._2typesOfmethodBasesOnParametersAndReturn;

import java.util.Scanner;

public class _4NoParameterAndWithRetrun
{
    public static void main(String[] args)
    {
        System.out.println("METHOD TYPE: NO PARAMETER AND WITH RETURN VALUE.");
        System.out.println("------------------------------------------------");

        int result = sum();
        System.out.println("The sum is :"+result);
    }

    static int sum()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();
        int sum = a+b;
        return sum;
    }
}
