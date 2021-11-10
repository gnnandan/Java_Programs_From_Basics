package _1Java_Codes_From_Basics._15inheritanceInJava;

class parentClass_1
{
    static void func_1()
    {
        System.out.println("Inside static method/function of 'parentClass_1' ");
    }
}
class parentClass_11 extends  parentClass_1
{
    void func_11()
    {
        System.out.println("Inside user defined function of 'parentClass_11'");
    }
}
public class _4Note_6_inheritanceEx4
{
    public static void main(String[] args)
    {
        parentClass_11 p11 = new parentClass_11();
        parentClass_1.func_1(); //calling static method/function of parent class
        p11.func_11(); //calling user defined method/function of parent class
    }
}
