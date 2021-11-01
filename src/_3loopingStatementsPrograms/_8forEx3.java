package _3loopingStatementsPrograms;

import java.util.Scanner;

public class _8forEx3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ending number: ");
        int endnum = input.nextInt();

        System.out.print("Enter the starting number: ");
        int startnum = input.nextInt();

        for(int i = endnum;i>=startnum;i--)
        {
            System.out.print(i+" ");
        }
    }
}
