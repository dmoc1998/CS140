//Daniel Moc
//5/23/17
//Project 3

import java.util.*;
import java.io.*;
public class proj3a
{
	//Method aka. "Function isPrime"
	public static void isPrime(int n)
	{
		boolean prime = true;
		if(n < 2)
		{
			prime = false;
		}
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				prime = false;
				break;
			}
		}
		if(prime)
		{
			System.out.printf(n + " is a prime number");
		}
		else
		{
			System.out.printf(n + " is not a prime number");
		}
	}
	
	//Main method
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = kb.nextInt();
		isPrime(num);
	}
}