package _1Java_Codes_From_Basics._14exceptionHandlingInJava;

public class _2runTimeStackEx2
{
    public static void main(String[] args)
    {

    }
}
class rts
{
    public static void wakeup()
    {
        sleep();
        System.out.println("I'm in sleep method");
    }
    public static void sleep()
    {
        System.out.println("I'm in wakeup method");
    }

    public static void main(String[] args)
    {
        System.out.println("I'm in main method");
        wakeup();
    }
}

