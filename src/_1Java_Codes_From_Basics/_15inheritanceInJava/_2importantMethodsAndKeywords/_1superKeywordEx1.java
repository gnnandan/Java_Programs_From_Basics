package _1Java_Codes_From_Basics._15inheritanceInJava._2importantMethodsAndKeywords;

/*NOTE: During the inheritance if the parent class and child class having a same variable name
 that time it causes name clash & more priority is given to child class instance variable.
 So In order to access the instance variable  of parent class we will use super keyword.*/

class superEx
{
    String s = "ONE";
}

class childEx extends superEx
{
    String s = "TWO";
    void func()
    {
        System.out.println("More Priority Is Given To Child Class Instance Variable, So the value of String 's' is: "+s);
        System.out.println("Inorder to access the Instance Variable of Parent Class we need to use 'super keyword' like this: "+super.s);
    }

}
public class _1superKeywordEx1
{
    public static void main(String[] args)
    {
        //create a object where inheritance is actually happening
        childEx cs = new childEx();
        cs.func();
    }
}
