package _3loopingStatementsPrograms;

import java.util.Scanner;

public class _15dowhileEx5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int i = 1,sum =0;
        do
        {
            sum = sum + i;
            i++;
        }while(i<=num);
        System.out.println("The sum of "+num+" number is: "+sum);
    }
}
