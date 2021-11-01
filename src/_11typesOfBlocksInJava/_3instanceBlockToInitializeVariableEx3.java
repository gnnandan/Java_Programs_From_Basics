package _11typesOfBlocksInJava;

public class _3instanceBlockToInitializeVariableEx3
{
    String data;//instance variable
    {
        data = "NandanFiles";
        System.out.println("The data belongs to: "+data);
    }

    public static void main(String[] args)
    {
        System.out.println("Instance Variable Can Also Be used To Initialize Instance Variables");
        new _3instanceBlockToInitializeVariableEx3();//only way to access the instance block
    }
}
