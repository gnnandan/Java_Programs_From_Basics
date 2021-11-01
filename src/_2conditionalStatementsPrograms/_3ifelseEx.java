package _2conditionalStatementsPrograms;

import java.util.Enumeration;
import java.util.Random;
import java.util.Scanner;

public class _3ifelseEx
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        Random rand = new Random();

        if (num > rand.nextInt(10))
        {
            System.out.println("The number "+num+" greater then random number");
        }

    }
}
