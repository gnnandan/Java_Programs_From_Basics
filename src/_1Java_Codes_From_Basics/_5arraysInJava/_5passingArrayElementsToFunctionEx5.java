package _5arraysInJava;

public class _5passingArrayElementsToFunctionEx5
{
    public static void main(String[] args)
    {
        int i;
        int[] marks = {55,66,89,77,89,70};

        for(i=0;i<6;i++)
        {
            modify(marks[i]);
            System.out.println(marks[i]);
        }
    }
    static void modify(int m)
    {
        m = m*2;
        System.out.print(m+" ");
    }
}
