package _1Java_Codes_From_Basics._14exceptionHandlingInJava;

import java.beans.IndexedPropertyChangeEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _4multipleTryAndCatchBlocksEx4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Enter a: ");
            int a = scanner.nextInt();
            System.out.println("Enter b: ");
            int b = scanner.nextInt();
            System.out.println("a/b is: "+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("'0' division  error is not applicable");
        }
        catch(InputMismatchException e)
        {
            System.out.println("please enter valid input");
        }
        catch(Exception e)
        {
            System.out.println("Invalid");
        }
    }
}
