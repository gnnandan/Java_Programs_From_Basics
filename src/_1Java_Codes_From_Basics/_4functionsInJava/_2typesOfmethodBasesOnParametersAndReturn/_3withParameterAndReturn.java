package _4functionsInJava._2typesOfmethodBasesOnParametersAndReturn;

import java.util.Scanner;

public class _3withParameterAndReturn
{
    public static void main(String[] args)
    {
        System.out.println("METHOD TYPE: METHOD WITH PARAMETER AND RETURN VALUE.");
        System.out.println("-----------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        float b = scanner.nextFloat();

        /* NOTE
        while returning the value from function
        the returned value should store in some variable
        so every time when we return something from the
        function store it in some variable and then print
        the result

        here in function syntax - we are replacing void with returning datatype
        */

        float result = sum(a,b);
        System.out.println("The sum of a:"+a+" and b:"+b+" is :"+result);
    }
    static float sum(int x, float y)
    {
        float sum = x+y;
        return sum;
    }
}
