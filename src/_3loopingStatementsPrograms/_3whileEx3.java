package _3loopingStatementsPrograms;

import java.util.Scanner;

public class _3whileEx3
{
    public static void main(String[] args)
    {
        //decrementing the loop
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ending number: ");
        int endRange = input.nextInt();
        System.out.println("Enter the starting number: ");
        int startRange = input.nextInt();

        // initialization
        int i = endRange;
        // condition
        while(i>=startRange)
        {
            System.out.print(i+" ");
            //decrementation/incrementation
            i--;
        }
    }
}
