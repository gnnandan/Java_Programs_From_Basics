package _1Java_Codes_From_Basics._15inheritanceInJava;

class class1
{
    private String ns1 = "I'm in class 'a'"; //parent class 1
}
class class2 extends class1
{
    String ns2 = "I'm in class 'b'"; //parent class 2
}
public class _2Note_4_inheritanceEx2
{
    public static void main(String[] args)
    {
        class2 class_2 = new class2();
        _2Note_4_inheritanceEx2 inex1 = new _2Note_4_inheritanceEx2();
        //System.out.println(class_2.ns1);//private members can't able to access
        System.out.println(class_2.ns2);
    }
}
