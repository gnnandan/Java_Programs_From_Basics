package _13stringsInJava;

public class _7compareToMethod
{
    public static void main(String[] args)
    {
        String s1 = "Nandan";
        String s2 = "NandanGN";
        System.out.println("Use of 'compareTo()' method");
        int res = s1.compareTo(s2);
        System.out.println("The result is: "+res);
        if(res == 0)
        {
            System.out.println("String s1 and s2 are equal");
        }
        else if(res > 0)
        {
            System.out.println("String s1 is greater than s2");
        }
        else if(res < 0)
        {
            System.out.println("String s2 is greater than s1");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
