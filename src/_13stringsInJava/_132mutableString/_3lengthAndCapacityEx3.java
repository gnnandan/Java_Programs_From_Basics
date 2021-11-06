package _13stringsInJava._132mutableString;

public class _3lengthAndCapacityEx3
{
    public static void main(String[] args)
    {
        StringBuilder sb1 = new StringBuilder("Nandan G N");
        StringBuilder sb2 = new StringBuilder("gnnandan7@gmail.com");

        System.out.println("The mutable string is: "+sb1);
        System.out.println("The length of mutable string sb1: "+sb1.length());
        System.out.println("The capacity of mutable string sb1: "+sb1.capacity());
        System.out.println();
        System.out.println("The mutable string is: "+sb2);
        System.out.println("The length of mutable string sb2: "+sb2.length());
        System.out.println("The capacity of mutable string sb2: "+sb2.capacity());
    }
}
