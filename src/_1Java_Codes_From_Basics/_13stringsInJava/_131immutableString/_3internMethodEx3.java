package _13stringsInJava;

public class _3internMethodEx3
{
    public static void main(String[] args)
    {
        String s1 = new String("Nandan");
        String s2 = s1.intern();//used to create a copy of string object
        System.out.println("Content in s1: "+s1);
        System.out.println("Content in s2: "+s2);
        System.out.println(s1==s2);
    }
}
