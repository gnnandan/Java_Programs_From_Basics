package _2Important_Java_Programs._1Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _7findTheLengthOfTheLongestSubstring
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str= scanner.next();
        str = str.toLowerCase();
        getUniqueCharacterSubstringBruteForce(str);
    }
    static void getUniqueCharacterSubstringBruteForce(String input) {
        String output = "";
        for (int start = 0; start < input.length(); start++) {
            Set<Character> visited = new HashSet<>();
            int end = start;
            for (; end < input.length(); end++) {
                char currChar = input.charAt(end);
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);
                }
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end);
            }
        }
    }
}
