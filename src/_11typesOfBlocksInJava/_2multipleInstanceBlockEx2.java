package _11typesOfBlocksInJava;

public class _2multipleInstanceBlockEx2
{
    _2multipleInstanceBlockEx2(int a)
    {
        System.out.println("Inside parameterized constructor");
        System.out.println("Value: "+a);
    }
    {
        System.out.println("Inside Instance Block 1");
    }
    {
        System.out.println("Inside Instance Block 2");
    }
    {
        System.out.println("Inside Instance Block 3");
    }
    public static void main(String[] args)
    {
        new _2multipleInstanceBlockEx2(10);
        System.out.println("Inside Main Method");
    }
}
