package _1Java_Codes_From_Basics._21AccessModifiers.Default;

class test
{
    public void fun1()
    {
        System.out.println("inside class test");
    }
}

class mainClass
{
    public static void main(String[] args)
    {
        test d = new test();
        d.fun1();
        System.out.println("inside main class");
        System.out.println("Accessing members of same page with different class using 'default'");
    }
}
