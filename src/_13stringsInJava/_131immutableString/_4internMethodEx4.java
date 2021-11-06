package _13stringsInJava;

public class _4internMethodEx4
{
    public static void main(String[] args)
    {
        String s1="Nandan";
        String s2 = new String("Nandan");
        String s3 = s1.intern();
        System.out.println("Content in s1: "+s1);
        System.out.println("Content in s2: "+s2);
        System.out.println("Content in s3: "+s3);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
    }
}
