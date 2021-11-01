package _3loopingStatementsPrograms;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class _1whileEx1
{
    public static void main(String[] args)
    {
        //printing the number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int startRange = input.nextInt();
        System.out.println("Enter the ending number: ");
        int endRange = input.nextInt();

        //initialize the number
        int i = startRange;
        while( i < endRange + 1)
        {
            System.out.println("The number: "+i);
            //increment the number
            i+=1; //NOTE - This is important step if we forget to increment means it will go infinite loop
        }
    }
}
