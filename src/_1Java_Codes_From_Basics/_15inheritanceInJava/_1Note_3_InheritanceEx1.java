package _1Java_Codes_From_Basics._15inheritanceInJava;

//parent class or super class
class a
{
    String s1 = "I'm in class 'a'"; //parent class 1
}
class b extends a
{
    String s2 = "I'm in class 'b'"; //parent class 2
}

//child class
public class _1Note_3_InheritanceEx1 extends b
{
    public static void main(String[] args)
    {
        b b_class = new b();
        _1Note_3_InheritanceEx1 inex = new _1Note_3_InheritanceEx1();
        System.out.println("Accessing the members of parent class 'a': "+b_class.s1);
        System.out.println("Accessing the members of parent class 'b': "+b_class.s2);
        /* System.out.println(inex.s1);
        System.out.println(inex.s2);*/
    }
}
