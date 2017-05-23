//Daniel Moc
//CS 140
//Project 1, Problem 1 - hourly pay rate
//4/25/17

import java.util.*;
import java.io.*;
public class task1
{
	public static void main(String[] args)
	{
		//Scanner
		Scanner kb = new Scanner(System.in);

	//Variables

		int hoursWorked;
		double rate;
		int normalHours;
		double overtimePay;
		double extraPay;


	//Ask for hours and pay rate

		System.out.println("Please enter the hours you worked this week:");
		hoursWorked = kb.nextInt();

		System.out.println("Please enter your pay rate:");
		System.out.print("$");
		rate = kb.nextDouble();

	//Determine gross pay and stuff

		if(hoursWorked >= 15 && hoursWorked <= 40)
		{
			double grossPay1 = (hoursWorked * rate);
			System.out.println("Your gross pay is $" + grossPay1);
		}
		else if(hoursWorked < 15)
		{
			System.out.println("Your gross pay is $0.");
			System.out.println("Sorry, you need to work at least 15 hours to get paid this week.");
			System.out.println("Your work hours will be deferred to next week.");
			System.out.println("Hours deferred: " + hoursWorked);
		}

		else if(hoursWorked > 40 && hoursWorked <= 60)
		{
			int extraHours = (hoursWorked - 40);
			hoursWorked = (hoursWorked - extraHours);
			double grossPay1 = (hoursWorked * rate);
			extraPay = (extraHours * rate * 1.5);
			overtimePay = grossPay1 + extraPay;
			System.out.println("You have overtime hours.");
			System.out.println("Your gross pay is $" + overtimePay);
		}

		else if(hoursWorked > 60)
		{
			int hoursIgnored = (hoursWorked - 60);
			hoursWorked = 40;
			int extraHours = 20;
			extraPay = (extraHours * rate * 1.5);
			double grossPay1 = (hoursWorked * rate);
			double max = (grossPay1 + extraPay);
			System.out.println("Sorry, you cannot work more than 60 hours a week.");
			System.out.println("You will make the maximum gross pay of $" + max);
			System.out.println("Hours deferred: " + hoursIgnored);
		}	
	}
}
