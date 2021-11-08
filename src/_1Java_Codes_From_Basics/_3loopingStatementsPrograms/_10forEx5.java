package _3loopingStatementsPrograms;

import sun.awt.windows.ThemeReader;

import java.util.Scanner;

public class _10forEx5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of "+num+" number is "+sum);
    }
}
