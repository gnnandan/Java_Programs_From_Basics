package _6OOPSConcepts;

public class _1oopsEx1
{
    public static void main(String[] args)
    {
        //this is main class

        //creating an object to a class lion

        lion l1 = new lion(); //SYNTAX:  class_name variable = new class_name();

        //calling member functions of the lion class
        l1.weight();
        l1.height();
        l1.color();

    }
}
class lion
{

    //these are data members
    String weight_lion = "120kg";
    String height_lion = "200cm";
    String color_lion = "Orange-Brown";

    //these are member functions
    void weight()
    {
        System.out.println("The lion's weight is around: "+weight_lion);
    }
    void height()
    {
        System.out.println("The lion's height is around: "+height_lion);
    }
    void color()
    {
        System.out.println("The lion's color is: "+color_lion);
    }
}
