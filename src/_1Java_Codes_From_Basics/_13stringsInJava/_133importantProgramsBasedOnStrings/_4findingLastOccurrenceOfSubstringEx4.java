package _13stringsInJava._133importantProgramsBasedOnStrings;

import java.util.Scanner;

public class _4findingLastOccurrenceOfSubstringEx4
{
    public static void main(String[] args)
    {
        System.out.print("Enter the sentence: ");
        Scanner scanner = new Scanner(System.in);
        String m_str = scanner.next();
        System.out.println("The string is: "+m_str);

        System.out.print("Enter the substring to find its last occurrence: ");
        String s_str = scanner.next();
        int index = m_str.indexOf(s_str);
        if(index == -1)
        {
            System.out.println("The substring "+s_str+" is not found at any index so the index is "+index);
        }
        else
        {
            System.out.println("The substring "+s_str+" found at index "+index);
        }
    }
}
