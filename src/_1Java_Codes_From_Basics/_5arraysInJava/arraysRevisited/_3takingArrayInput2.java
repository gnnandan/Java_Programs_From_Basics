package _1Java_Codes_From_Basics._5arraysInJava.arraysRevisited;

import java.util.List;
import java.util.Scanner;

public class _3takingArrayInput2
{
    public static void main(String[] args)
    {
        //task management program

        System.out.print("Enter the number of tasks: ");
        Scanner scanner=new Scanner(System.in);
        int len = scanner.nextInt();

        String taskList[] = new String[len];

        //for loop for taking input tasks
        for(int i=0; i<len;i++)
        {
            System.out.print("Enter the task "+i+" :");
            taskList[i] = scanner.next();
        }

        System.out.println();

        //foreach loop to display the task list
        System.out.println("Priority"+"Task list");
        int i=1;
        for(String list:taskList)
        {
            System.out.println("    "+i+"        "+list);
            i+=1;
        }
    }
}
