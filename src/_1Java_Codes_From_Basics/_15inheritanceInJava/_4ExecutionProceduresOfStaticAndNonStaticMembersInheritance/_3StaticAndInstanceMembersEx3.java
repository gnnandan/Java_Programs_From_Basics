package _1Java_Codes_From_Basics._15inheritanceInJava._4ExecutionProceduresOfStaticAndNonStaticMembersInheritance;
class parentC
{
    String iV_P = "Instance Variable Of Patent Class"; //Instance Variable
    static String sV_P = "Static Variable Of Parent Class"; //static Variable

    {
        System.out.println(iV_P);
        System.out.println("Instance Block Of Parent Class"); //Instance Block
        instanceFunc_P();
    }
    static
    {
        System.out.println(sV_P);
        System.out.println("Static Block Of Parent Class"); // Static Block
        staticFunc_P();
    }
    parentC()
    {
        System.out.println("Instance Method Of Parent Class Constructor"); // User defined constructor
    }

    void instanceFunc_P()
    {
        System.out.println("Parent Class Instance Function"); // instance method/function
    }
    static void staticFunc_P()
    {
        System.out.println("Parent Class Static Function"); // static method/function
    }
}

class childC extends parentC
{
    String iV_C = "Instance Variable Of Child Class";//Instance Variable
    static String sV_C = "Static Variable Of Child Class";//static Variable
    {
        System.out.println(iV_C);
        System.out.println("Instance Block Of Child Class");    //Instance Block
        instanceFunc_C();
    }
    static
    {
        System.out.println(sV_C);
        System.out.println("Static Block Of Child Class");// Static Block
        staticFunc_C();
    }

    childC()
    {
        System.out.println("Instance Method Of Child Class Constructor");// User defined constructor
    }

    void instanceFunc_C()
    {
        System.out.println("Child Class Instance Function");    // instance method/function
    }

    static void staticFunc_C()
    {
        System.out.println("Child Class Static Function");// static method/function
    }
}

public class _3StaticAndInstanceMembersEx3
{
    public static void main(String[] args)
    {
        childC cc = new childC();
    }
}
