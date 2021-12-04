package _1Java_Codes_From_Basics._5arraysInJava.arraysRevisited;

public class _1arrayEx1
{
    public static void main(String[] args)
    {
        int i;

        //array declaration and initialization
        int[] marks = {10,20,30,40,50,60};

        System.out.print("Looping over array way-1: ");
        //looping over array way 1
        for(i=0;i<=marks.length-1;i++)
        {
            System.out.print(marks[i]+" ");
        }

        System.out.println();

        System.out.print("Looping over array way-2: ");
        //looping over array way 2
        for (int j:marks)
        {
            System.out.print(j+" ");
        }
    }
}
