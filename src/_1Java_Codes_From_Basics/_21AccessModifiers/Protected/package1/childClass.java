//accessing protected members in same package

package _1Java_Codes_From_Basics._21AccessModifiers.Protected.package1;

public class childClass extends parentClass
{
    public static void main(String[] args)
    {
        childClass cc = new childClass();
        System.out.println("Accessing protected members of parent class within the same package");
        cc.func();
    }
}
