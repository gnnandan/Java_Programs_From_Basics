package _2Important_Java_Programs._1Strings;

import java.util.Scanner;

public class _4countTheOccurrenceOfAGivenCharacter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str= scanner.next();

        System.out.print("Enter The Searching String: ");
        char searchStr= scanner.next().charAt(0);
        System.out.println("The string is: "+str);

        int count=0;
        for(int i =0;i<str.length();i++)
        {
            //System.out.println(str.charAt(i));
            if(str.charAt(i)==searchStr)
            {
                count++;
            }
        }
        System.out.println("The char "+searchStr+" is repeated "+count+" times");
    }
}
