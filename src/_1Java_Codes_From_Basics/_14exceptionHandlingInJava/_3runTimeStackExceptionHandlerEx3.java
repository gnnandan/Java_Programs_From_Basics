package _1Java_Codes_From_Basics._14exceptionHandlingInJava;

import java.util.Scanner;

public class _3runTimeStackExceptionHandlerEx3
{

    public static  void wakeup()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("a/b is: "+(a/b));
        sleep();
    }

    public static void sleep()
    {
        System.out.println("Program goes to sleep mode");
    }

    public static void main(String[] args)
    {

        try
        {
            wakeup();
        }
        catch (Exception e)
        {
            System.out.println("Exception occured: '0' division error");
            System.out.println("Exception handled in main method");
        }
    }
}

