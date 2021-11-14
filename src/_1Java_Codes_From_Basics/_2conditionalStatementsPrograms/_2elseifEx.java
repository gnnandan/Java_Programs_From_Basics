//student marks and average calculator
package _1Java_Codes_From_Basics._2conditionalStatementsPrograms;

import java.util.Scanner;

public class _2elseifEx
{
    public static void main(String[] args)
    {
        int m1, m2, m3, m4, m5, m6;
        float total, avg, per;
        String grade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of 6 subjects one by one");
        m1 = scanner.nextInt();
        ;
        m2 = scanner.nextInt();
        m3 = scanner.nextInt();
        m4 = scanner.nextInt();
        m5 = scanner.nextInt();
        m6 = scanner.nextInt();

        total = m1 + m2 + m3 + m4 + m5 + m6;

        avg = total / 6;
        per = (total / 600) * 100;
        if (per >= 80)
        {
            grade = "A+";
            System.out.println("Your total marks is "+total+" and percentage is "+per+" and grade is "+grade);
        }
        else if(per>=70)
        {
            grade = "A";
            System.out.println("Your total marks is "+total+" and percentage is "+per+" and grade is "+grade);
        }
        else if(per>= 60)
        {
            grade = "B+";
            System.out.println("Your total marks is "+total+" and percentage is "+per+" and grade is "+grade);
        }
        else if(per >= 50)
        {
            grade = "B";
            System.out.println("Your total marks is "+total+" and percentage is "+per+" and grade is "+grade);
        }
        else
        {
            grade = "c";
            System.out.println("Your total marks is "+total+" and percentage is "+per+" and grade is "+grade);
        }
    }
}
