package _1Java_Codes_From_Basics._15inheritanceInJava._4ExecutionProceduresOfStaticAndNonStaticMembersInheritance;


class parentA
{
    String s = "Instance Variable Of Parent Class";
    {
        System.out.println(s);
        System.out.println("---------------------------------------");
        System.out.println("First Instance Block Of Parent Class");
    }
    {
        parentFunc();
        System.out.println("Second Instance Block Of Parent Class");
    }
    parentA()
    {
        System.out.println("User Defined Parent Class Constructor");
        System.out.println("***************************************");
    }
    void parentFunc()
    {
        System.out.println("Parent Class Instance Method");
    }
}
class childA extends parentA
{
    String ss = "Instance Variable Of Child Class";
    {
        System.out.println(ss);
        System.out.println("---------------------------------------");
        System.out.println("First Instance Block Of Child Class");
    }
    {
        childFunc();
        System.out.println("Second Instance Block Of Child Class");
    }
    childA()
    {
        System.out.println("User Defined Child Class Constructor");
    }
    void childFunc()
    {
        System.out.println("Child Class Instance Method");
    }
}


public class _1instanceMembersInInheritanceEx1
{
    public static void main(String[] args)
    {
        //to access Instance Members Of Parent Class & Child Class Create a Object For Child Class
        childA ca = new childA();
    }
}
