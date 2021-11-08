package _9constructorsInJava;
public class _3constructorOverloadingEx3
{
    public static void main(String[] args)
    {
        System.out.println("Constructor Overloading\n");

        //to read the default constructor
        new constructorOverloading();
        //for parameterized constructor with order string type
        new constructorOverloading("OVERLOADING: number of parameter");

        //for parameterized constructor with order string type then int type
        new constructorOverloading("OVERLOADING: type of parameter",10);

        //for parameterized constructor with order int type then string type
        new constructorOverloading(100,"OVERLOADING: order of parameter");

    }
}
class constructorOverloading
{
    private String a;
    constructorOverloading()
    {
        System.out.println("This is default constructor");
        System.out.println();
    }

    constructorOverloading(String a)
    {

        System.out.println(a);
        System.out.println();
    }

    constructorOverloading(String aa,int bb)
    {
        System.out.println("aa: "+aa);
        System.out.println("bb: "+bb);
        System.out.println();
    }

    constructorOverloading(int bbb,String aaa)
    {
        System.out.println("aaa: "+aaa);
        System.out.println("bbb: "+bbb);
        System.out.println();
    }
}
