package _1Java_Codes_From_Basics._15inheritanceInJava._2importantMethodsAndKeywords;

class parent
{
    parent(int i)
    {
        System.out.println(i);
        System.out.println("Inside 'Parent Class' Constructor ");
    }
}

class child extends  parent
{
    child()
    {
        super(10);//super() method must be first statement
        System.out.println("Inside 'Child Class' Constructor");
        System.out.println("Using 'Child Class' Constructor with 'super() method' we are calling 'Parent Class Constructor'");
    }
}


public class _3thisMethodEx3
{
    public static void main(String[] args)
    {
        child ch = new child();
    }
}
