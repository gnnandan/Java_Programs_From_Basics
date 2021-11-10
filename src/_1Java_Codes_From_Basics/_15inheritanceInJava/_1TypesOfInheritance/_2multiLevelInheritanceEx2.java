package _1Java_Codes_From_Basics._15inheritanceInJava._1TypesOfInheritance;
class A
{
    void func1()
    {
        System.out.println("Parent 1");
        System.out.println("inside the fun1 method");
    }
}
class B extends A
{
    void func2()
    {
        System.out.println("Parent 2");
        System.out.println("inside the fun2 method");
    }
}
class C extends B
{
    void func3()
    {
        System.out.println("Child");
        System.out.println("inside the fun3 method");
    }
}
public class _2multiLevelInheritanceEx2
{
    public static void main(String[] args)
    {
        System.out.println("Execution Started");
        System.out.println();
        collectInherited();
        System.out.println();
        System.out.println("Execution Ended");
    }

    static void collectInherited()
    {
        C c= new C();
        c.func1();
        c.func2();
        c.func3();
    }
}
