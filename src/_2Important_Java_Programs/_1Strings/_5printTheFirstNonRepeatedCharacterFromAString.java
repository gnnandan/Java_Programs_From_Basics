package _2Important_Java_Programs._1Strings;

import java.util.Scanner;

public class _5printTheFirstNonRepeatedCharacterFromAString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str= scanner.next();
        str = str.toLowerCase();
        for(char i:str.toCharArray())
        {
            if(str.indexOf(i)==str.lastIndexOf(i))
            {
                System.out.println("First Non Repeating Character Is: "+i);
                break;
            }
        }
    }
}
