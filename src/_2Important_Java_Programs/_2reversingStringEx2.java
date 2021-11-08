package _2Important_Java_Programs;

import java.util.Scanner;

public class _2reversingStringEx2
{
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println("The string is: "+s);
        String rev_s = "";
        int len = s.length();
        for(int i=len-1;i>=0;i--) //iteration starts from i = length-1(i.e last letter of the string)
        {
            rev_s = rev_s + s.charAt(i);
        }
        System.out.println("The reversed string is: "+rev_s);
    }
}
