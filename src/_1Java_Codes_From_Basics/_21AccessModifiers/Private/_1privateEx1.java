package _1Java_Codes_From_Basics._21AccessModifiers.Private;

class test
{
    private void func()
    {
        System.out.println("Private members can be accessed only within the same class but not out side the class");
    }
}

public class _1privateEx1
{
    public static void main(String[] args)
    {
        test test = new test();
        //test.func(); //---trying to access but shows error
    }
}
