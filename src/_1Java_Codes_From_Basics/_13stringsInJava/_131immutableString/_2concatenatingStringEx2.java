package _13stringsInJava;

public class _2concatenatingStringEx2
{
    public static void main(String[] args)
    {
        String s1 = "codershandbook";
        String s2 = ".in";
        System.out.println("concatenate using '+' operator: "+s1+s2 );
        System.out.println("concatenate using 'concate()' method: "+s1.concat(s2));
    }
}
