package _4functionsInJava._2typesOfmethodBasesOnParametersAndReturn;

import java.util.Scanner;

public class _2withParameterAndNoReturn
{
    public static void main(String[] args)
    {
        System.out.println("METHOD TYPE: METHOD WITH PARAMETER AND NO RETURN VALUE.");
        System.out.println("-------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        float b = scanner.nextFloat();

        /* NOTE
        while calling the method if we used some parameter means
        then we should use the same datatype in function name like this
         */
        sum(a,b);
    }
    static void sum(int x, float y)
    {
        float sum = x+y;
        System.out.println("The sum of a:"+x+" and b:"+x+" is :"+sum);
    }
}
