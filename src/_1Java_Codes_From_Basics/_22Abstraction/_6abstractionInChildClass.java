package _1Java_Codes_From_Basics._22Abstraction;

abstract class Bird
{
    abstract void fly();
    abstract void eat();
}
class Pigeon extends Bird
{
    void fly()
    {
        System.out.println("pigeon fly very low");
    }
    void eat()
    {
        System.out.println("pigeon eats grains");
    }
}
abstract class Eagle extends Bird
{
    void fly()
    {
        System.out.println("eagle fly very high");
    }
    abstract void eat();
}
class MountainEagle extends Eagle
{
    void eat()
    {
        System.out.println("Mountain eagles hunt and eat over mountains");
    }
}
class GoldenEagle extends Eagle
{
    void eat()
    {
        System.out.println("Golden eagles hunt and eat over oceans");
    }
}
class sky
{
    void allow(Bird b)
    {
        b.fly();
        b.eat();
    }
}


public class _6abstractionInChildClass
{
    public static void main(String[] args)
    {
        Pigeon pigeon =new Pigeon();
        GoldenEagle goldenEagle = new GoldenEagle();
        MountainEagle mountainEagle = new MountainEagle();
        sky sky = new sky();

        sky.allow(pigeon);
        System.out.println();
        sky.allow(goldenEagle);
        System.out.println();
        sky.allow(mountainEagle);
    }
}
