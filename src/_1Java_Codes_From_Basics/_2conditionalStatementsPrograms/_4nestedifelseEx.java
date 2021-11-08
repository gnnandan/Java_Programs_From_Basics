package _2conditionalStatementsPrograms;

import java.util.Scanner;

public class _4nestedifelseEx
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        if(num == 0)
        {
            System.out.println("The number is equal to zero");
        }
        else if(num > 0)
        {
            if(num%2==0)
            {
                System.out.println("The number is Positive even number");
            }
            else
            {
                System.out.println("The number is Positive odd number");
            }
        }
        else if(num < 0)
        {
            if(num%2==0)
            {
                System.out.println("The number is Negative even number");
            }
            else
            {
                System.out.println("The number is Negative odd number");
            }
        }
    }
}
