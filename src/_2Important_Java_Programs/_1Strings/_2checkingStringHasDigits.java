package _2Important_Java_Programs._1Strings;

import java.util.Scanner;

public class _2checkingStringHasDigits
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str= scanner.next();
        System.out.println("The string is: "+str);
        char[] data = str.toCharArray();

        //used to store the sequence
        StringBuilder  digits=new StringBuilder();
        for(char c: data)
        {
            if(Character.isDigit(c))
            {
                digits.append(c);
            }
        }
        System.out.println("The numbers are: "+digits);
    }
}
