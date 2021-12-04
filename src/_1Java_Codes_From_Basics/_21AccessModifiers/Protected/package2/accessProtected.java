package _1Java_Codes_From_Basics._21AccessModifiers.Protected.package2;

//importing parent class package
import _1Java_Codes_From_Basics._21AccessModifiers.Protected.package1.parentClass;

//extending parent class with subclass
public class accessProtected extends parentClass
{
    public static void main(String[] args)
    {
        accessProtected accessProtected = new accessProtected();
        System.out.println("Accessing protected members of parent class of different package through child class/subclass");

        //Accessing the protected members of parent class of different package
        accessProtected.func();

    }
}
