package _13stringsInJava._132mutableString;

public class _4ensureCapacityEx4
{
    public static void main(String[] args)
    {
        StringBuilder sb1 = new StringBuilder("Nandan G N");
        System.out.println("Before ensuring capacity of mutable string sb1 is: "+sb1.capacity());
        sb1.ensureCapacity(100);//ensuring capacity
        System.out.println("After ensuring capacity of mutable string sb1 is: "+sb1.capacity());
    }
}
