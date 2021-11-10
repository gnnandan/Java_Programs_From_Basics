package _1Java_Codes_From_Basics._15inheritanceInJava._1TypesOfInheritance;

class sameParent
{
    public void methodA()
    {
        System.out.println("method of Parent Class");
    }
}
class child1 extends sameParent
{
    public void methodB()
    {
        System.out.println("method of Child Class");
    }
}
class child2 extends sameParent
{
    public void methodC()
    {
        System.out.println("method of Child Class");
    }
}
class child3 extends sameParent
{
    public void methodD()
    {
        System.out.println("method of Child Class");
    }
}
public class _3hierarchicalInheritanceEx3
{
    public static void main(String[] args)
    {
        //here 3 different inherits. So we created separate  object for each inherit
        child1 c1 = new child1();
        child2 c2 = new child2();
        child3 c3 = new child3();
        c1.methodA();
        c1.methodB();
        c2.methodC();
        c3.methodD();
    }
}
