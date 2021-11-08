package _5arraysInJava;

import java.util.Scanner;

public class _3arrayEx3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many friends you have: ");
        int num = scanner.nextInt();
        String[] Friends = new String[num];


        //storing data
        for(int i = 0;i< Friends.length;i++)
        {
            System.out.print("Enter your friends one by one: ");
            Friends[i] = scanner.next();
        }

        //reading the stored data
        // we can use for loop or for each loop
        System.out.println("\nYour friends are");
        for(String read: Friends)
        {
            System.out.println(read);
        }
    }
}
