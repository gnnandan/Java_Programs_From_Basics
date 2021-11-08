package _11typesOfBlocksInJava;

public class _1instanceBlockEx1
{
    //instance block
    {
        System.out.println("inside the instance block");
    }
    _1instanceBlockEx1()
    {
        System.out.println("inside the default constructor");
    }
    public static void main(String[] args)
    {
        new _1instanceBlockEx1();
        System.out.println("Inside the main method");
    }
}
