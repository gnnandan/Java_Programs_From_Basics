package _3loopingStatementsPrograms;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class _13dowhileEx3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ending number: ");
        int endnum = input.nextInt();
        System.out.print("Enter the starting number: ");
        int startnum = input.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want reverse order of range of number or not: Say 'Y' or 'N': ");
        String reverseNumberOrNot = scanner.nextLine();
        switch (reverseNumberOrNot)
        {
            case "Y":
                int i =endnum;
                do
                {
                    System.out.println("The number: "+i);
                    i--;
                }while(i>=startnum);
                break;

            case "N":
                int j =startnum;
                do
                {
                    System.out.println("The number: "+j);
                    j++;
                }while(j<=endnum);
                break;

            default:
                System.out.println("Please use uppercase 'Y' or 'N'");
                break;
        }
    }
}
