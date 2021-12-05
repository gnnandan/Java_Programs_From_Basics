package _1Java_Codes_From_Basics._22Abstraction;

abstract class demoParent
{
    public demoParent()
    {
        System.out.println("Inside abstract class constructor");
    }
    abstract void func();
}

class childDemo extends demoParent
{

    public childDemo()
    {
        /**
         * @super() to call the constructor of other class
           @this() to call the constructor of same class
         */
        super();
    }
    void func()
    {
        System.out.println("Inside the child class user defined method");
    }
}

public class _7abstractClassWithConstructor
{
    public static void main(String[] args)
    {
        demoParent demoParent;
        demoParent = new childDemo();
        demoParent.func();
    }
}
