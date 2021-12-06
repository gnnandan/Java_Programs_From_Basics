package _2Important_Java_Programs._1Strings;

import java.util.Scanner;

public class _6palindromeOrNor
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str= scanner.next();
        str = str.toLowerCase();

        int i=0, j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.println("The String Is Not Palindrome");
            }
            i++;
            j--;
        }
        System.out.println("The String Is Palindrome");
    }
}
