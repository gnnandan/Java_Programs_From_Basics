package _3loopingStatementsPrograms;

import java.util.Scanner;

public class _14dowhileEX4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for multiplication: ");
        int num = scanner.nextInt();
        System.out.println("Multiplication table of "+num);
        int i=1;
        do
        {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }while(i<=10);
    }
}
