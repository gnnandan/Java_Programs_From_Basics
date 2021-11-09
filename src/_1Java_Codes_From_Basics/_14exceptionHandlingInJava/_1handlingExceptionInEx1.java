package _1Java_Codes_From_Basics._14exceptionHandlingInJava;

import java.util.Scanner;

public class _1handlingExceptionInEx1
{
    public static void main(String[] args)
    {
        exceptionHandle exceptionHandle = new exceptionHandle();
        exceptionHandle.handle();
    }
}
class exceptionHandle
{
    public void handle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        try
        {
            System.out.println("A exception raised here: "+(a/b));// 10/0 is causing exception here
        }
        catch (Exception e)
        {
            System.out.println("0 division error cause halting of execution");
            System.out.println("exception occurred 'b' value must be non-zero positive number");
        }
    }
}
