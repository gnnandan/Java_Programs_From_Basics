package _1Java_Codes_From_Basics._17ImportStatementsAndPackages._2PackagesInJava;

class a
{
    public void fun1()
    {
        System.out.println("Inside Class - 1");
    }
}
class b
{
    public void fun2()
    {
        System.out.println("Inside Class - 2");
    }
}
class c
{
    public void fun3()
    {
        System.out.println("Inside Class - 3");
    }
}
class d
{
    public void fun4()
    {
        System.out.println("Inside Class - 4");
    }
}
public class _3addingMultipleClasses
{
    public static void main(String[] args)
    {
        System.out.println("From Main Class");
        a Class_a = new a();
        b Class_b = new b();
        c Class_c = new c();
        d Class_d = new d();
        Class_a.fun1();
        Class_b.fun2();
        Class_c.fun3();
        Class_d.fun4();

    }
}
