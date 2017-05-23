// Daniel Moc
// 5/23/17
// Project 3A

import java.util.*;
import java.io.*;
public class proj3a
{
	//Method aka. "Function isPrime"
	public static void isPrime(int n)
	{
		boolean prime = true;
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
		
		int num = 0;
		int chances = 0;
		for(int i = 0; i < 3; i++){
		 System.out.println("Enter a number: ");
		 num = kb.nextInt();
		 if(num < 2 && i ==2){
			 System.out.println("Invalid input again! You ran out of tries buddy");
			 System.exit(0);
		 }
		 else if(num < 2 && i < 3)
		 {
			 System.out.println("Invalid input");
			 continue;
		 }
		 else if(num >= 2 && i < 2)
		 {
			 break;
		 }	
		}
		isPrime(num);
	}
}