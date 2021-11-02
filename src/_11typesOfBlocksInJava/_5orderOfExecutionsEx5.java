package _11typesOfBlocksInJava;

class orderOfExecution
{
    int a;
    {
        a=10;
        System.out.println("Inside the 'instance block' and value: "+a);
    }
    static
    {
        int b=100;
        System.out.println("Inside the 'static block' and value: "+b);
    }
    orderOfExecution()
    {
        int c = 1000;
        System.out.println("Inside the 'default constructor' and value: "+c);
    }
    orderOfExecution(int c)
    {
        System.out.println("Inside the 'parameterized constructor' and value: "+c);
    }
    void ex()
    {
        int d = 100000;
        System.out.println("Inside the 'user defined method' and value: "+d);
    }
}
public class _5orderOfExecutionsEx5
{
    public static void main(String[] args)
    {
        int i = 1;
        System.out.println("Execution Starts From Main And Value: "+i);

        //NOTE every time we create an object using 'new' the instance block is executed
        orderOfExecution oe1 = new orderOfExecution();//executes static block, instance block, and default constructor
        orderOfExecution oe2 = new orderOfExecution(10000);//executes the instance block, parameterized constructor
        oe2.ex();//executes the methods
        System.out.println("Execution Ends At Main");
    }
}
