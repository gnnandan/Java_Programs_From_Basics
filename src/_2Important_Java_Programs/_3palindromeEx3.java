package _2Important_Java_Programs;

import java.util.Scanner;

public class _3palindromeEx3
{
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println("The string is: "+s);

        String rev_s = "";
        int len = s.length();
        for(int i=len-1;i>=0;i--)
        {
            rev_s = rev_s+s.charAt(i);
        }
        System.out.println("The reveresed string is: "+rev_s);
        if(s.equals(rev_s))
        {
            System.out.println("The strings are palindrome");
        }
        else
        {
            System.out.println("The strings are not palindrome");
        }

    }
}
