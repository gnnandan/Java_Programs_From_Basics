package _1Java_Codes_From_Basics._21AccessModifiers.Public.Package2;

import _1Java_Codes_From_Basics._21AccessModifiers.Public.Package1.package1Class;
public class _1publicEx1
{
    public static void main(String[] args)
    {
        package1Class pac1 = new package1Class();
        pac1.test();
        System.out.println("'NOTE' When we create a class with public we can access it and its members everywhere");
        System.out.println("Here we are accessing the public class 'package1Class' and method 'test()' of different package called 'Package1'");
    }
}
