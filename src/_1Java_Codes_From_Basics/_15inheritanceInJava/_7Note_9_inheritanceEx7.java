package _1Java_Codes_From_Basics._15inheritanceInJava;

class parentClass_4
{
    int i;
    int j;
    int k;
    int l;
    parentClass_4(int k, int l) //for parameterized constructor
    {
        super();
        this.k = k;
        this.l = l;
    }
}
class parentClass_44 extends parentClass_4
{
    parentClass_44(int i, int j)
    {
        super(333,444);//to call parameterized constructor of parentClass_4 we must pass the value to it

        // to point the variable we use this (solves shadow problem)
        this.i =i;
        this.j =j;
    }
    void displays()
    {
        System.out.println("'i' is: "+i);
        System.out.println("'j' is: "+j);
        System.out.println("'k' is: "+k);
        System.out.println("'l' is: "+l);
    }
}
public class _7Note_9_inheritanceEx7
{
    public static void main(String[] args)
    {
        parentClass_44 p44 = new parentClass_44(111,222);
        p44.displays();
    }
}
