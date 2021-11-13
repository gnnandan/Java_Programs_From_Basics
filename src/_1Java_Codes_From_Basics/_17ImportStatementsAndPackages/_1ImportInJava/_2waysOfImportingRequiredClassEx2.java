package _1Java_Codes_From_Basics._17ImportStatementsAndPackages._1ImportInJava;

import java.util.Scanner;//using import statement

public class _2waysOfImportingRequiredClassEx2
{
    public static void main(String[] args)
    {
        String name;
        //java.util.Scanner scanner  = new java.util.Scanner(System.in);//using inline importing class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.next();
        System.out.println("Name is: "+name);
    }
}
