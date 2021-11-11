package _1Java_Codes_From_Basics._15inheritanceInJava._2importantMethodsAndKeywords;

class aa
{
    aa()
    {
        System.out.println("This is default constructor inside parent class");
    }
    aa(String s)
    {
        this();
        System.out.println("Calling another constructor of same class using 'this() method' inside parent class");
        System.out.println(s);
    }
}

class bb extends aa
{
    bb()
    {
        super("calling parent class parameterized constructor");
        System.out.println("This is default constructor inside child class");
    }
    bb(String s)
    {
        this();
        System.out.println("Calling another constructor of same class using 'this() method' inside child class");
        System.out.println(s);

    }
}



public class _4thisMethodEx4
{
    public static void main(String[] args)
    {
        bb obj  = new bb("calling child class parameterized constructor");

    }
}
