package _13stringsInJava;

public class _1comparingStringEx1
{
    public static void main(String[] args)
    {
        String s1 = "Nandan";
        String s2 = "nandan";

        //comparision using "=="
        if(s1 == s2)
        {
            System.out.println("String s1 is equal to s2");
        }
        else
        {
            System.out.println("String s1 is not equal to s2");
        }

        //comparison using ".equals()" method
        System.out.println(s1.equals(s2));

        //comparison using ".equalsIgnoreCase() compares even if the string is with different cases"
        System.out.println(s1.equalsIgnoreCase(s2));

        //comparison using ".compareTo()" method this comparison is based on the Unicode value of each character in the strings
        System.out.println(s1.compareTo(s2));
    }
}
