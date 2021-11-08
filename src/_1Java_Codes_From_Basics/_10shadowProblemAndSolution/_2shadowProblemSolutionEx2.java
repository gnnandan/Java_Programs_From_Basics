package _10shadowProblemAndSolution;

import java.util.Scanner;

public class _2shadowProblemSolutionEx2
{
    public static void main(String[] args)
    {
        shadowProblemSolutionEx solution_ex = new shadowProblemSolutionEx();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the name: ");
        String s_name = scanner.next();
        System.out.print("Enter the id: ");
        int s_id = scanner.nextInt();
        solution_ex.setData(s_id,s_name);
        System.out.println("The Id is: "+solution_ex.getStudentId());
        System.out.println("The Name: "+solution_ex.getStudentName());
    }
}
class shadowProblemSolutionEx
{
    /*
       shadow problem occurs when the instance variable and local variable are of same name
       at that time the compiler gives full preference for local variable
    */
    private int studentId;
    private String studentName;
    public void setData(int studentId, String studentName)
    {
        //shadow problem causing here and its solution is using "this" keyword
        this.studentId = studentId;
        this.studentName= studentName;
    }
    int getStudentId()
    {
        return studentId;
    }
    String getStudentName()
    {
        return studentName;
    }
}


