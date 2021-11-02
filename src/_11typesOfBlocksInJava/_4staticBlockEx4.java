package _11typesOfBlocksInJava;

public class _4staticBlockEx4
{
    //instance block
    int a;
    {
        a=10;
        System.out.println("Inside the instance block and value is: "+a);
    }

    //static block
    static
    {
        int b = 20;
        System.out.println("Inside the static block and value is: "+b);

    }
    public static void main(String[] args)
    {
        _4staticBlockEx4 ex4 = new _4staticBlockEx4();
        System.out.println("Inside the main method");
    }
}
