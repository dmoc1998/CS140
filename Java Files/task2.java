//Daniel Moc
//CS 140
//Project 1, problem 2 - months
//4/25/17

import java.util.*;
import java.io.*;
public class task2
{
	public static void main(String[] args)
	{
		//Scanner
		Scanner kb = new Scanner(System.in);

	//Ask for month input
		System.out.print("Enter month (1-12): ");
		int month = kb.nextInt();

	//Ask for day input
		System.out.print("Enter day (1-31): ");
		int day = kb.nextInt();

	//Create invalid areas
		if(month <=0 || month >12)
		{
			System.out.println("Invalid month!");
			System.exit(0);
		}
		if(day <=0 || day >31)
		{
			System.out.println("Invalid day!");
			System.exit(0);
		}

	//Calculations
		switch(month)
		{
			case 1:
				System.out.println(month + "/" + day + " is the Winter Season.");
				break;
			case 2:
				System.out.println(month + "/" + day + " is the Winter Season.");
				break;
			case 3:
				if(day <=20)
				{
					System.out.println(month + "/" + day + " is the Winter Season.");
				} else {
					System.out.println(month + "/" + day + " is the Spring Season.");
				}
				break;
			case 4:
				System.out.println(month + "/" + day + " is the Spring Season.");
				break;
			case 5:
				System.out.println(month + "/" + day + " is the Spring Season.");
				break;
			case 6:
				if(day <=20)
				{
					System.out.println(month + "/" + day + " is the Spring Season.");
				} else {
					System.out.println(month + "/" + day + " is the Summer Season.");
				}
				break;
			case 7:
				System.out.println(month + "/" + day + " is the Summer Season.");
				break;
			case 8:
				System.out.println(month + "/" + day + " is the Summer Season.");
				break;
			case 9:
				if(day <=20)
				{
					System.out.println(month + "/" + day + " is the Summer Season.");
				} else {
					System.out.println(month + "/" + day + " is the Fall Season.");
				}
				break;
			case 10:
				System.out.println(month + "/" + day + " is the Fall Season.");
				break;
			case 11:
				System.out.println(month + "/" + day + " is the Fall Season.");
				break;
			case 12:
				if(day <=20)
				{
					System.out.println(month + "/" + day + " is the Fall Season.");
				} else {
					System.out.println(month + "/" + day + " is the Winter Season.");
				}
				break;
		}
	}
}
