package _1Java_Codes_From_Basics._15inheritanceInJava._3typesOfFunctionsWithRespectToInheritance;
class parentClass
{
    void marry()
    {
        System.out.println("marry @ age of 26");								// overriding method happening here in child class
    }
}
class childClass extends parentClass
{
    //overridden method
    void marry()
    {
        System.out.println("marry @ age of 30");                                // overriding method w.r.t child class
    }

    //unique method/specialized method in child class
    void job()                                                                  //specialized method 1
    {
        System.out.println("Job is Mandatory");
    }
    void decision()                                                            //specialized method 2
    {
        System.out.println("Yes");
    }
}
public class _3specializedMethodEx3
{
    public static void main(String[] args)
    {
        childClass c = new childClass();
        c.marry();
        c.job();
        c.decision();
    }
}
