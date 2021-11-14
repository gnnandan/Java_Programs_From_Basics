package _1Java_Codes_From_Basics._2conditionalStatementsPrograms;

import java.util.Scanner;

public class _6switchCase
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from '0 to 3': ");
        int input_num = scanner.nextInt();

        switch(input_num)
        {
            case 0:
                System.out.println("The number in case: "+input_num+" block");
                break;
            case 1:
                System.out.println("The number in case: "+input_num+" block");
                break;
            case 2:
                System.out.println("The number in case: "+input_num+" block");
                break;
            case 3:
                System.out.println("The number in case: "+input_num+" block");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
    }
}
