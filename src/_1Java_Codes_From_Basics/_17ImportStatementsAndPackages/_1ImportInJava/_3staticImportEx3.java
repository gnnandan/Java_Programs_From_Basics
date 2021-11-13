package _1Java_Codes_From_Basics._17ImportStatementsAndPackages._1ImportInJava;
import  static  java.lang.Math.*;
import java.util.Scanner;
public class _3staticImportEx3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("The square root of number "+num+" is: "+sqrt(num));
    }
}
