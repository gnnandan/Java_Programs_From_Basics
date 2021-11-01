package _8waysOfInitializingTheObject;

import java.util.Scanner;

public class _3initializeObjectUsingMethodEx3
{
    //you can use constructor here also but i used in separate class because this main class length is so big
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String studentName = scanner.next();

        System.out.print("Enter the age: ");
        int studentAge = scanner.nextInt();

        System.out.print("Enter the phone: ");
        int studentPhone = scanner.nextInt();

        //calling constructor(This is Parameterized constructor)
        constructorEx cs = new constructorEx(studentName,studentAge,studentPhone);

    }
}
class constructorEx
{
    //instance variable
    String name;
    int age;
    int phone;

    //initializing object using constructor
    constructorEx(String sname, int sage, int sphone)
    {
        name = sname;
        age = sage;
        phone = sphone;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
    }
}
