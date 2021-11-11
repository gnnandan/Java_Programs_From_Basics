package _1Java_Codes_From_Basics._15inheritanceInJava._3typesOfFunctionsWithRespectToInheritance;
class Parent
{
    void marry()
    {
        System.out.println("marry @ age of 26");								// overriding method happening here in child class
    }
}
class Child extends Parent
{
    void marry()
    {
        System.out.println("marry @ age of 30");                                // overriding method w.r.t child class
    }
    void job()
    {
        System.out.println("Job is Mandatory");
    }
}
public class _2overridingMethodEx2
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.marry();
        c.job();
    }
}
