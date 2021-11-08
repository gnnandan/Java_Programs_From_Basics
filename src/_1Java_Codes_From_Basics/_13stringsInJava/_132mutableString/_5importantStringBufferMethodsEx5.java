package _13stringsInJava._132mutableString;

public class _5importantStringBufferMethodsEx5
{
    public static void main(String[] args)
    {
        StringBuffer sf = new StringBuffer("Hello This Is Nandan G N");
        System.out.println(sf);
        System.out.println("Finding char at position 7 using 'charAt(int index)': "+sf.charAt(7));

        sf.setCharAt(10,'@');//setting character in particular position like this
        System.out.println("Setting char @ at position 10 using 'setCharAt(int index, char ch)': "+sf);

        System.out.println("deleting char @ at position 10 using 'deleteCharAt(int index)': "+sf.deleteCharAt(10));

        System.out.println("reversing char using 'reverse()': "+sf.reverse());

        StringBuffer newsf = new StringBuffer("Hello This Is Nandan G N");
        newsf.setLength(5);//setting the string length
        System.out.println("setting the length of string using 'setLength()': "+newsf);
    }
}
