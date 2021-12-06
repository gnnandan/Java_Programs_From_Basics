package _2Important_Java_Programs._1Strings;

import java.util.Scanner;

public class _3countingNumberOfVowelsAndConsonant
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str= scanner.next();
        System.out.println("The string is: "+str);
        str = str.toLowerCase();
        int vCount=0, cCount=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vCount+=1;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                cCount+=1;
            }
        }
        System.out.println("The Vowels are: "+vCount);
        System.out.println("The Consonant are: "+cCount);
    }
}
