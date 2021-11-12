package _1Java_Codes_From_Basics._16polymorphismInJava;

class brand
{
    void carBrand()
    {
        System.out.println("Car Brands That Are My Favourite");
    }
}

class Tata extends brand
{
    void carBrand()
    {
        System.out.println("Tata Brand Rangerover Discovery Sport");
    }
    void originBrand()//specialized method
    {
        System.out.println("This car brand is belonging to 'TATA' and It is from 'INDIA'");
    }
}

class Hyundai extends brand
{
    void carBrand()
    {
        System.out.println("Hyundai Brand i20 Asta");
    }
}

public class _2upcastingAnddowncastingPolymorphismEx2
{
    public static void main(String[] args)
    {
        brand cars = new brand();

        cars = new Tata();
        cars.carBrand(); //UPCASTING

        //DOWNCASTING SYNTAX: ((child_ClassName)(referenceVariable_of ParentClass)).specializedMethod()
        ((Tata)(cars)).originBrand();//technique to access specialized method (DOWNCASTING)

        cars = new Hyundai();
        cars.carBrand();
    }
}
