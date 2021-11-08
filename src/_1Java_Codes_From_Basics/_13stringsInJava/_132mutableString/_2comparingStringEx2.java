package _13stringsInJava._132mutableString;

public class _2comparingStringEx2
{
    public static void main(String[] args)
    {
        StringBuilder sb1 = new StringBuilder("Nandan");
        StringBuilder sb2 = new StringBuilder("Nandan");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
}
