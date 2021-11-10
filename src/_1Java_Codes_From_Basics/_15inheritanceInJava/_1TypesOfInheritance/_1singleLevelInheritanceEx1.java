package _1Java_Codes_From_Basics._15inheritanceInJava._1TypesOfInheritance;

class parentClass
{
    String s;
    void parentMethod()
    {
        s = "From Parent/Super Class";
        System.out.println(s);
        System.out.println("Ready To Inherit Properties(variable) and Behavior(functions) to 'Child/Base Class'");
    }

}
class childClass extends parentClass
{
    String s;
    void childMethod()
    {
        s = "From Child/Base Class";
        System.out.println(s);
        System.out.println("Inherited Properties(variable) and Behavior(functions) from parent class");
    }
}


public class _1singleLevelInheritanceEx1
{
    public static void main(String[] args)
    {
        System.out.println("Execution starts");
        System.out.println("------------------------------------");
        inherted("Every Program starts to executes from 'Main Method'");
        System.out.println("------------------------------------");
        System.out.println("Execution ends");
    }
    static void inherted(String s)
    {
        System.out.println(s);
        childClass cc = new childClass();
        cc.parentMethod();
        cc.childMethod();
    }
}
