package _9thisKeyword_thisMethod_superMethod;

public class _2thisMethodEx2
{
    //default constructor -1
    _2thisMethodEx2()
    {
        System.out.println("This is default constructor");
    }

    //parameterized constructor -2
    _2thisMethodEx2(int a)
    {
        //used to call the another constructor
        this();//calling default constructor
        System.out.println("This is parameterized constructor with type 'int' and value: "+a);
    }

    //parameterized constructor -3
    _2thisMethodEx2(String s)
    {
        this(10);//calling parameterized constructor -2
        System.out.println("This is parameterized constructor with type 'String' and value: "+s);
    }
    _2thisMethodEx2(int b, float c)
    {
        this("calling parameterized constructor -3");
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }

    public static void main(String[] args)
    {
        System.out.println("'this() - method' it is used call one constructor within the another constructor within same class");
        new _2thisMethodEx2(10,100.0f);
    }
}
