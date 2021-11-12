package _1Java_Codes_From_Basics._16polymorphismInJava;

// VIRTUAL POLYMORPHISM USING THE METHOD OVERLOADING.
class plane
{
    String name;
    void takeOff()
    {
        System.out.println("plane is taking off");
    }
    void fly()
    {
        System.out.println("plane is flying");
    }
    void land()
    {
        System.out.println("plane is landing");
    }
}
class cargoPlane extends plane
{
    {
        super.name = "Cargo Plane";
    }
    void fly()
    {
        System.out.println(name+" plane is flying");
    }
    void carryCargo()
    {
        System.out.println(name+" used to carry goods");
    }
}
class passengerPlane extends plane
{
    {
        super.name = "Passenger Plane";
    }
    void fly()
    {
        System.out.println(name+" plane is flying");
    }
    void carryPassenger()
    {
        System.out.println(name+" used to carry passengers");
    }
}
class fighterJet extends plane
{
    {
        super.name = "Fighter Plane";
    }
    void fly()
    {
        System.out.println(name+" is flying");
    }
    void carryArms()
    {
        System.out.println(name+" used to carry arms");
    }
}
class airport
{
    //method overloading here
    void allow(cargoPlane p)
    {
        p.takeOff();
        p.fly();
        p.carryCargo();
        p.land();
    }

    void allow(passengerPlane p)
    {
        p.takeOff();
        p.fly();
        p.carryPassenger();
        p.land();
    }
    void allow(fighterJet p)
    {
        p.takeOff();
        p.fly();
        p.carryArms();
        p.land();
    }
}

public class _3methodOverloadingVirtualPolymorphismEx3
{
    public static void main(String[] args)
    {
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fighterJet fj = new fighterJet();
        airport a = new airport();

        System.out.println("---------------------------");
        a.allow(cp);
        System.out.println("---------------------------");
        a.allow(pp);
        System.out.println("---------------------------");
        a.allow(fj);
    }
}
