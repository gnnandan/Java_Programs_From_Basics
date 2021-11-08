package _6OOPSConcepts;

//Initializing object value using reference variable
public class _2oopsEx2
{
    public static void main(String[] args)
    {
        //Object creation
        car c1 = new car();
        // values for objects is given using ref variables
        c1.carBrand = "TATA";
        c1.carName = "RANGE ROVER";
        c1.carColor = "Red";

        // methods are called with the help of ref variable.
        c1.carselected();
        c1.carInteriorFeature();
        c1.safetyFeatures();
        c1.carDimensions();

    }
}

class car
{
    String carBrand;
    String carName;
    String carColor;

    void carselected()
    {
        System.out.println("Selected Car");
        System.out.println("Car Name: "+carName);
        System.out.println("Car Brand: "+carBrand);
        System.out.println("Car Color: "+carColor);
        System.out.println();
    }
    void carInteriorFeature()
    {
        System.out.println("The car "+carName+" from "+carBrand+" has ton of interior features like\n1.instrumental cluster\n2.digital connections(apple carplay, android auto\n3.bose sound system");
        System.out.println();
    }
    void safetyFeatures()
    {
        System.out.println("The car "+carName+" has\n1.4 Airbags\n2.EBS Breaking System\n3.Cruise control\n4. 4 sides disc break ");
        System.out.println();
    }
    void carDimensions()
    {
        System.out.println("The car "+carName+" has\n1. width = 4 meters\n2. height = 5.4inch");
        System.out.println();
    }

}
