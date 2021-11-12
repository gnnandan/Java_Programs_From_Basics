package _1Java_Codes_From_Basics._16polymorphismInJava;

class vehicle
{
    void brand()
    {
        System.out.println("Best Collections"); //form 1
    }
}

class cycle extends vehicle
{
    void brand()
    {
        System.out.println("My favourite cycle is 'Polygon' and 'Hero'");//form 2
    }
}

class bike extends vehicle
{
    void brand()
    {
        System.out.println("My favourite bike is 'Bajaj Pulzar' and 'Yamaha MT-15'");//form 4
    }
}

class car extends vehicle
{
    void brand()
    {
        System.out.println("My favourite car is 'Tata' and 'Hyundai'");//form 3
    }
}

public class _1polymorphismEx1
{
    public static void main(String[] args)
    {//---------reference
        vehicle collections  = new vehicle();//creating reference to parent class

        //parent reference to child objects(new cycle, new car, new bike)
        collections = new cycle();
        collections.brand();
        collections = new bike();
        collections.brand();
        collections = new car();
        collections.brand();
    }
}
