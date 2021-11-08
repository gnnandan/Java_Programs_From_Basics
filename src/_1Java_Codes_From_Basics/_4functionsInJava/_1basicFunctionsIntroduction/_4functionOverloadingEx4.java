package _4functionsInJava;

public class _4functionOverloadingEx4
{
    public static void main(String[] args)
    {
        System.out.println("Function Overloading");
        System.out.println("-----");
        data(10);
        System.out.println("-----");
        data(10.0f);
        System.out.println("-----");
        data("Ten");
    }

    static void data(int i)
    {
        System.out.println("The value of 'i' is: "+i);
        System.out.println("Type is "+((Object) i).getClass().getName());
    }
    static void data(float j)
    {
        System.out.println("The value of 'j' is: "+j);
        System.out.println("Type is "+((Object) j).getClass().getName());
    }
    static void data(String str)
    {
        System.out.println("The value of 'str' is: "+str);
        System.out.println("Type is "+str.getClass().getName());
    }
}
