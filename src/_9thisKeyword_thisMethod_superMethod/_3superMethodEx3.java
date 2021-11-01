package _9thisKeyword_thisMethod_superMethod;

public class _3superMethodEx3
{
    _3superMethodEx3()
    {
        //super() - is automatically initialized by compiler
        System.out.println("This is default constructor");
    }
    _3superMethodEx3(String s)
    {
        super(); // - *NOTE* super() must be the first statement in constructor
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        new _3superMethodEx3();
        new _3superMethodEx3("This is parameterized constructor");
    }
}
