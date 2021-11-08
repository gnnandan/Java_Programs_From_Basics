package _13stringsInJava._133importantProgramsBasedOnStrings;

import java.util.Locale;
import java.util.Scanner;

public class _5findingOccurrenceOfVowelsAndConsonantFromString
{
    public static void main(String[] args)
    {
        System.out.print("Enter the sentence: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        str = str.toLowerCase();//making a uniform format
        System.out.println("The string is: "+str);

        int len = str.length(); //finding the length
        int v_count=0,c_count=0;//initializing to zero at first

        for(int i=0;i<=len-1;i++)
        {
            //when ever vowel occurs in a string increment v_count to 1 else c_count to 1
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                v_count++;
            }
            else
            {
                c_count++;
            }
        }
        System.out.println("The vowel count is: "+v_count);
        System.out.println("The consonant count is: "+c_count);
    }
}
