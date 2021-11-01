package _5arraysInJava;

public class _9singleDimensionArrayReturnEx9
{
    public static void main(String[] args)
    {
        //creating an array
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        //calling a function
        doSum(a);

        //passing returned array
        int c[] = returnDoSum();
        int sumc=0;
        for(int j = 0;j<= c.length-1;j++)
        {
            sumc = sumc + c[j];
        }
        System.out.println("The sum of (Returned) array 'c' is: "+sumc);


    }
    static void doSum(int b[])
    {
        int sum = 0;
        for(int i=0;i <= b.length-1;i++)
        {
            sum = sum+b[i];
        }
        System.out.println("The sum of (Unreturned) array 'a' is: "+sum);
    }

    static int[] returnDoSum()
    {
        int c[] = {11,12,13,14,15,16,17,18,19,20};
        return c;
    }
}
