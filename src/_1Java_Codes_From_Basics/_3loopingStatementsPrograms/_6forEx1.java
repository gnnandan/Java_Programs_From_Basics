package _3loopingStatementsPrograms;

import java.util.Scanner;

public class _6forEx1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int startnum = input.nextInt();

        System.out.print("Enter the ending number: ");
        int endnum = input.nextInt();

        int position =0;
        for(int i = startnum;i<=endnum;i++)
        {
            System.out.println("Position: "+position+" and Number: "+i);
            position+=1;
        }
    }
}
