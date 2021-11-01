package _3loopingStatementsPrograms;

import java.util.Scanner;

public class _9forEx4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for multiplication: ");
        int num = scanner.nextInt();
        for(int i =1;i<=10;i++)
        {
            System.out.println(num + " * " + i +" = "+num*i);
        }
    }
}
