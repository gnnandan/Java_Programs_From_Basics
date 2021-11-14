package _1Java_Codes_From_Basics._18typesOfCommentsInJava;

public class _3documentation
{
    /**
     *This is documentation comment
     */
    /**
     * @param a first value
     * @param b second value
     * @return sum of a and b
     */
    public static void main(String[] args)
    {
        int result = sum(10,20);
        System.out.println("the sum is: "+result);
    }
    static int sum(int a, int b)
    {
        return a+b;
    }
}
