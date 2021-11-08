package _8waysOfInitializingTheObject;

import java.util.Scanner;

public class _2initializeObjectUsingMethodEx2
{
    public static void main(String[] args)
    {
        data rv = new data();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String studentName = scanner.next();

        System.out.print("Enter the age: ");
        int studentAge = scanner.nextInt();


        rv.setName(studentName);
        rv.setAge(studentAge);

        System.out.println("Name: "+rv.getName());
        System.out.println("Age: "+rv.getAge());

    }
}
class data
{
    String name;
    int age;

    //initializing object using method
    public void setName(String sname)
    {
        name = sname;
    }
    public void  setAge(int sage)
    {
        age = sage;
    }
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
}
