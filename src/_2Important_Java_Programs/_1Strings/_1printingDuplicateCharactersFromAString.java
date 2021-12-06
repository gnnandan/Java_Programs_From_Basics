package _2Important_Java_Programs._1Strings;

import java.util.Scanner;

public class _1printingDuplicateCharactersFromAString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str= scanner.next();
        System.out.println("The string is: "+str);

        //storing the input string to array of char type
        char[] charArray = str.toCharArray();

        System.out.print("The duplicate characters are: ");

        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(charArray[i]==charArray[j])
                {
                    System.out.print(charArray[j]+" ");
                }
            }
        }
    }
}
