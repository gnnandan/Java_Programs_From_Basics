//Calculations of gross salary
package _2conditionalStatementsPrograms;

import java.util.Scanner;

public class _1ifelseEX
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		float bs, hra, da, gs;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your basic salary: ");
		bs = sc.nextFloat();

		if (bs <= 1500)
		{
			da = bs * 10 / 100;
			hra = bs * 90 / 100;
		} else
		{
			hra = 1500;
			da = bs * 98 / 100;
		}
		gs = bs + da + hra;
		System.out.print("The gross salary of a person is: " + gs);

	}

}
