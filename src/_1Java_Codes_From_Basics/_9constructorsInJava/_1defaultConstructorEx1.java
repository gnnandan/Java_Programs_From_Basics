package _9constructorsInJava;

public class _1defaultConstructorEx1
{
    _1defaultConstructorEx1()
    {
        System.out.println("This is default constructor");
        String name ="Nandan";
        int age = 22;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args)
    {
        _1defaultConstructorEx1 className = new _1defaultConstructorEx1();
        // when ever we create a object to a class immediately constructor gets called
        System.out.println("This is main method");
    }
}
