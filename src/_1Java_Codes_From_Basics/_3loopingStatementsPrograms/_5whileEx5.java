//sum of natural numbers
package _3loopingStatementsPrograms;

import java.util.Scanner;

public class _5whileEx5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = 0,i = 1;
        while(i<=num)
        {
            sum = sum+i;
            i++;
        }
        System.out.println("The sum of " +num+" natural number is "+sum);
    }
}
