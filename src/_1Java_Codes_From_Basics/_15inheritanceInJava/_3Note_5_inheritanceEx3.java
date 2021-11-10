package _1Java_Codes_From_Basics._15inheritanceInJava;

class parentClass1
{
    void func1()
    {
        System.out.println("Inside parent class 1");
    }
}
class parentClass2 extends  parentClass1
{
    void func2()
    {
        System.out.println("Inside parent class 2");
    }
}
public class _3Note_5_inheritanceEx3
{
    public static void main(String[] args)
    {
        //create a instance where ever extends is happening
        parentClass2 p2 = new parentClass2();
        System.out.println("Calling members(functions) from child class");
        p2.func1();
        p2.func2();
    }
}
