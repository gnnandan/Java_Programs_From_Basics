package _5arraysInJava;

import java.util.Scanner;

public class _2arraySimple_SumAvgMarksEx2
{
    public static void main(String[] args)
    {
        int i, avg, sum = 0;
        int marks[] = new int[6];
        Scanner scanner = new Scanner(System.in);

        //storing data in array
        for(i = 0;i<=marks.length-1;i++)
        {
            System.out.print("Enter the marks: ");
            //taking input
            marks[i] = scanner.nextInt();
        }

        //reading/ printing data
        for(i =0; i<=marks.length-1;i++)
        {
            sum = sum + marks[i];
        }

        avg = sum/marks.length;
        System.out.println("The total marks is: "+sum);
        System.out.println("The average of marks is: "+avg);
    }
}
