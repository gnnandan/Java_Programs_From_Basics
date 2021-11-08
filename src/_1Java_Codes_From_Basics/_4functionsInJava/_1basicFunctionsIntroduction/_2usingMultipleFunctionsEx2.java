package _4functionsInJava;

public class _2usingMultipleFunctionsEx2
{
    public static void main(String[] args)
    {
        System.out.println("-----Execution Starts-----");
        System.out.println("This is inside main method");
        func1Block();
        func2Block();
        func3Block();
        System.out.println("-----Execution Stops-----");

    }
    static void func1Block()
    {
        String var1 = "Inside function 1 block";
        System.out.println(var1);
    }

    static void func2Block()
    {
        String var2 = "Inside function 2 block";
        System.out.println(var2);
    }

    static void func3Block()
    {
        String var3= "Inside function 3 block";
        System.out.println(var3);
    }
}
