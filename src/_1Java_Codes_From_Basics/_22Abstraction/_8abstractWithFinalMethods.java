package _1Java_Codes_From_Basics._22Abstraction;

abstract class testParent
{
    final void func1()
    {
        System.out.println("Inside the parent class final method");
    }
    abstract void func2();
}

class testChild extends testParent
{
    void func2()
    {
        System.out.println("Inside the child class method");
    }
}


public class _8abstractWithFinalMethods
{
    public static void main(String[] args)
    {
        testParent testParent;
        testParent = new testChild();
        testParent.func1();
        testParent.func2();
    }
}
