package _12typeInstanceMethodAndStaticMethod;

public class _2staticMethodEx2
{
    public static void main(String[] args)
    {
        System.out.println("This is main method");
        System.out.println("Execution starts");
        exampleStaticMethod ex = new exampleStaticMethod();
        exampleStaticMethod.example();//calling static method
        System.out.println("Execution ends");
    }
}
class exampleStaticMethod
{
    static void example()
    {
        System.out.println("This is inside static method");
    }
    static
    {
        System.out.println("This is inside static block");
    }
}
