package _1Java_Codes_From_Basics._15inheritanceInJava;

class parentClass_3
{
    int i;
    int j;
    parentClass_3() //for parameterized constructor
    {
        super();
        System.out.println("This is default constructor");
    }
}
class parentClass_33 extends parentClass_3
{
    parentClass_33(int i, int j)
    {
        super();//to call default constructor of parentClass_3

        // to point the variable we use this (solves shadow problem)
        this.i =i;
        this.j =j;
    }
    void displays()
    {
        System.out.println("'i' is: "+i);
        System.out.println("'j' is: "+j);
    }
}

public class _6Note_8_inheritanceEx6
{
    public static void main(String[] args)
    {
        parentClass_33 p33 = new parentClass_33(111,222); //since it is a parameterized constructor in 'parentClass_22. So we need to pass value'
        p33.displays();
    }
}
