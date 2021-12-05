package _1Java_Codes_From_Basics._22Abstraction;

abstract class Bank
{
    abstract void rateOfInterest(); //abstract method
}

class HDFC extends Bank
{
    void rateOfInterest()
    {
        System.out.println("HDFC Bank's Rate Of Interest Is 2.50% to 5.50%");
    }
}

class SBI extends Bank
{
    void rateOfInterest()
    {
        System.out.println("SBI Bank's Rate Of Interest Is 2.90% to 5.40%");
    }
}

class ICICI extends Bank
{
    void rateOfInterest()
    {
        System.out.println("ICICI Bank's Rate Of Interest Is 2.50% to 5.50%");
    }
}


public class _4abstractionAndPolymorphismEx4
{
    public static void main(String[] args)
    {
        System.out.println("Parent Reference Child Object(Polymorphism) & Abstraction");
        System.out.println();

        //parent class reference
        Bank banks;

        //child object with parent reference - 1
        banks = new HDFC();
        banks.rateOfInterest();
        System.out.println();

        //child object with parent reference - 2
        banks = new SBI();
        banks.rateOfInterest();
        System.out.println();

        //child object with parent reference - 3
        banks = new ICICI();
        banks.rateOfInterest();
    }
}
