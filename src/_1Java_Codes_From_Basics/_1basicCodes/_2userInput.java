package _1basicCodes;

import java.util.Scanner;

public class _2userInput
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name, email;
		int age;

		// calling scanner class to take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");

		// calling input variable with scanner, next, and datatype
		name = sc.next();

		System.out.print("Enter your email: ");
		email = sc.next();

		System.out.print("Enter your age: ");
		age = sc.nextInt();

		System.out.println("Name: " + name + "\nemail:" + email + "\nage:" + age);

	}

}
