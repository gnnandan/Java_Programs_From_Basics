package _9constructorsInJava;

import java.util.Scanner;

public class _2parameterizedConstructorEx2
{
    _2parameterizedConstructorEx2(String name, int age) //parameterized constructor
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String sName = scanner.next();

        System.out.print("Enter your age: ");
        int sAge = scanner.nextInt();

        /* NOTE
            _2parameterizedConstructorEx2 obj = new _2parameterizedConstructorEx2(sName,sAge);
            To access constructor only "new _2parameterizedConstructorEx2(sName,sAge);" is enough
         */
        //we should call the constructor with same datatype which is used as a parameter
        new _2parameterizedConstructorEx2(sName,sAge);
    }
}
