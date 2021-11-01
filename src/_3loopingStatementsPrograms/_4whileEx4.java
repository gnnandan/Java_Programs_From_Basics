//multiplication tables
package _3loopingStatementsPrograms;

import java.util.Scanner;

public class _4whileEx4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for multiplication: ");
        int num = scanner.nextInt();
        int i = 1;
        while(i<=10)
        {
            //remember the logic
            System.out.println(num+" * "+i+" = "+num*i);
            i+=1;
        }
    }
}
