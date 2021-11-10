package _1Java_Codes_From_Basics._15inheritanceInJava;

class parentClass_2
{
    int i;
    int j;
//    parentClass_2()  //for 'default constructor'
//    {
//        super();
//        i=111;
//        j=222;
//        System.out.println("'x' is: "+x);
//    }
    parentClass_2(int x) //for parameterized constructor
    {
        super();
        i=111;
        j=222;
        System.out.println("'x' is: "+x);
    }
}
class parentClass_22 extends parentClass_2
{
    parentClass_22()
    {
//        super() //to call default constructor of parentClass_2
        super(1000);//to call parameterized constructor of parentClass_2 and passing the parameter value
    }
    void display()
    {
        System.out.println("'i' is: "+i);
        System.out.println("'j' is: "+j);
    }
}

public class _5Note_7_inheritanceEx5
{
    public static void main(String[] args)
    {
        //constructor won't participate in inheritance
        parentClass_22 p22 = new parentClass_22();
        p22.display();
    }
}
