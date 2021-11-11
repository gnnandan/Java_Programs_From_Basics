package _1Java_Codes_From_Basics._15inheritanceInJava._3typesOfFunctionsWithRespectToInheritance;

class plane
{
    String name; // instance variable
    void takeOff()
    {
        System.out.println("plane is taking off");
    }
    void fly()
    {
        System.out.println("plane is flying"); // we are inheriting the method fly()
    }
    void land()
    {
        System.out.println("plane is landing");
    }
}

class cargoPlane extends plane
{
    void fly()
    {
        super.name = "Cargo Plane";
        System.out.println(super.name+" Flies at 931 km/h"); // inherited method
    }
    void cargoplane()
    {
        System.out.println(super.name+" Is Used Carry Goods");
    }
}

class passengerPlane extends plane
{
    void fly()// inherited method
    {
        super.name = "Passenger Plane";
        System.out.println(super.name+" Flies At 880 - 926 km/h");
    }
    void passengersPlane()
    {
        System.out.println(super.name+" Is Used Carry Peoples");
    }
}
class fighterJet extends plane
{
    void fly()// inherited method
    {
        super.name = "Fighter Jet";
        System.out.println(super.name+" Flies At 7,200 km/h");
    }
    void fighterPlane()
    {
        System.out.println(super.name+" Is Used Carry Arms");
    }
}

public class _1inheritedMethodEx1
{
    public static void main(String[] args)
    {
        //create a object where we use extends
        cargoPlane type1 = new cargoPlane();
        passengerPlane type2 = new passengerPlane();
        fighterJet type3 = new fighterJet();


        type1.takeOff();
        type1.fly();
        type1.cargoplane();
        type1.land();

        System.out.println("-------------------------");
        type1.takeOff();
        type2.fly();
        type2.passengersPlane();
        type1.land();

        System.out.println("-------------------------");
        type1.takeOff();
        type3.fly();
        type3.fighterPlane();
        type1.land();
    }
}
