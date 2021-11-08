package _5arraysInJava;

public class _6passingArrayReferenceToFunctionEx6
{
    public static void main(String[] args)
    {
        int i;
        int[] a = {10,20,30,40,50,60,70};

        arrEle(a);

        for(i=0;i<=a.length-1;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    static void arrEle(int[] m)
    {
        for(int i=0;i<=m.length-1;i++)
        {
            m[i] = m[i] * 2;
        }
    }
}
