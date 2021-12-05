package _1Java_Codes_From_Basics._22Abstraction;

abstract class vehicleClass
{
    void move()
    {
        System.out.println("Each vehicle has different power so it moves in different speed"); //concrete method
    }
//    void start()//overridden method
//    {
//        System.out.println("Each vehicle has different engine so starting the vehicle varies from vehicle to vehicle");
//    }
    /**
     * @Abstraction-Explanation
     * here void start() method is overriding method
     * where its child classes is altering its property according to their requirement
     * anyway if we wrote ant thing in overridden method it won't get executed
     * so inorder to hide the implementation we use Abstraction
     */
    abstract void start(); //abstract method

}
class bikeClass extends vehicleClass
{
    void start()//overriding method
    {
        System.out.println("Bike can be start using self-start or kick-start");
    }
}
class carClass extends vehicleClass
{
    void start()//overriding method
    {
        System.out.println("Car can be start using only key");
    }
}

public class _2withAbstractionEx2
{
    public static void main(String[] args)
    {
        //vehicleClass vehicleClass =  new vehicleClass()
        bikeClass bikeClass = new bikeClass();
        bikeClass.move();
        bikeClass.start();

        System.out.println();
        carClass carClass = new carClass();
        carClass.move();
        carClass.start();
    }
}
