package _2Important_Java_Programs;

import java.util.Scanner;

public class _1readingStringInputEx1
{
    public static void main(String[] args)
    {
        System.out.println("Reading input string using 'next() and nextLine()'");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();//taking input using .next()
        System.out.println("'scanner.next()': "+name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String s = sc.nextLine();//taking input using .nextLine()
        System.out.println("'scanner.nextLine()': " + s);
    }
}
