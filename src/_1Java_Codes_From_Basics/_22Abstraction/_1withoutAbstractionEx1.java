package _1Java_Codes_From_Basics._22Abstraction;

class vehicle
{
    void move()
    {
        System.out.println("Each vehicle has different power so it moves in different speed");
    }
    void start()//overridden method
    {
        System.out.println("Each vehicle has different engine so starting the vehicle varies from vehicle to vehicle");
    }

}
class bike extends vehicle
{
    void start()//overriding method
    {
        System.out.println("Bike can be start using self-start or kick-start");
    }
}
class car extends vehicle
{
    void start()//overriding method
    {
        System.out.println("Car can be start using only key");
    }
}

public class _1withoutAbstractionEx1
{
    public static void main(String[] args)
    {
        vehicle v = new vehicle();
        bike b = new bike();
        car c = new car();

        v.move();
        v.start();
        System.out.println();
        b.move();
        b.start();
        System.out.println();
        c.move();
        c.start();
    }
}
