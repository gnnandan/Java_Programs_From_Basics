package _12typeInstanceMethodAndStaticMethod;

public class _1instanceMethodEx1
{
    public static void main(String[] args)
    {
        System.out.println("This is main method");
        System.out.println("Execution starts");
        exampleInstanceMethod ex = new exampleInstanceMethod();
        ex.example();//calling instance method
        System.out.println("Execution ends");
    }
}

class exampleInstanceMethod
{
    void example()
    {
        System.out.println("This is insatance method");
    }
    {
        System.out.println("This is instance block");
    }
}
