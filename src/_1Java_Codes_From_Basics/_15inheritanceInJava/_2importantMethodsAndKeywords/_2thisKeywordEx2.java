package _1Java_Codes_From_Basics._15inheritanceInJava._2importantMethodsAndKeywords;

/*NOTE: if the Instance variable and local variable are having same variable name
 that time it causes name clash(Shadow problem) & more priority is given to local variable.
 So In order to access the instance variable we will use this keyword.*/

class A
{
    String s = "ONE";
}

class B extends A
{
    String s = "TWO";
    void func()
    {
        String s = "THREE";
        System.out.println("If the local variable and instance variable are having same name then more priority is given to local variable, So the value of String 's' is: "+s);
        System.out.println("Inorder to access the Instance Variable. We need to use 'this keyword' like this: "+this.s);
        System.out.println("To access the variable of parent class we use: "+super.s);
    }

}

public class _2thisKeywordEx2
{
    public static void main(String[] args)
    {
        B b = new B();
        b.func();
    }
}
