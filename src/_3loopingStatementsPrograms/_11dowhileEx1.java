package _3loopingStatementsPrograms;

import java.util.Scanner;

public class _11dowhileEx1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int startnum = input.nextInt();

        System.out.print("Enter the ending number: ");
        int endnum = input.nextInt();
        int i =startnum;
        do
        {
            System.out.println("The Numbers is: "+i);
            i++;
        }while(i<=endnum);
    }

}
