package _1Java_Codes_From_Basics._17ImportStatementsAndPackages._1ImportInJava;

import java.util.Scanner; //-----> here we are importing

public class _1differenceImportEx1
{
    public static void main(String[] args)
    {
        String name;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.next();
        System.out.println("Name is: "+name);
    }
}
