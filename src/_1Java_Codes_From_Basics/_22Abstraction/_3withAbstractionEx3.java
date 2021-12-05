package _1Java_Codes_From_Basics._22Abstraction;

abstract class bank
{
    public void data()//concrete class
    {
        System.out.println("Each bank has different rate of interest");
        System.out.println("Rate Of Interest Follows Like This");
    }

    abstract void rateOfInterest(); //abstract method
}

class hdfc extends bank
{
    void rateOfInterest()
    {
        System.out.println("HDFC Bank's Rate Of Interest Is 2.50% to 5.50%");
    }
}

class sbi extends bank
{
    void rateOfInterest()
    {
        System.out.println("SBI Bank's Rate Of Interest Is 2.90% to 5.40%");
    }
}

class icici extends bank
{
    void rateOfInterest()
    {
        System.out.println("ICICI Bank's Rate Of Interest Is 2.50% to 5.50%");
    }
}


public class _3withAbstractionEx3
{
    public static void main(String[] args)
    {

        hdfc b1 = new hdfc();
        b1.data();
        System.out.println();
        b1.rateOfInterest();
        System.out.println();

        sbi b2 = new sbi();
        b2.rateOfInterest();
        System.out.println();

        icici b3 = new icici();
        b3.rateOfInterest();
    }
}
