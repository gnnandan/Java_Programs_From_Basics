package _4functionsInJava;

public class _5functionsWithVariableNumberOfArguments
{
    public static void main(String[] args)
    {
        double d1=10.0, d2=12.1, d3=14.0, d4=16.0, d5=7.0;
        System.out.printf("Average in first call of same function() with variable argument is: "+average(d1,d2));
        System.out.printf("\nAverage in second call of same function() with variable argument is: "+average(d1,d2,d3));
        System.out.printf("\nAverage in third call of same function() with variable argument is: "+average(d1,d2,d3,d4));
        System.out.printf("\nAverage in fourth call of same function() with variable argument is: "+average(d1,d2,d3,d4,d5));
    }
    static double average(double...numbers)
    {
        //initialization
        double total = 0.0;
        for(double d:numbers)
        {
            total = total + d;
        }
        double avg;
        avg = total/numbers.length;
        return avg;
    }
}
