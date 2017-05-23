//Daniel Moc
//Lab 5b
//4/27/2017

import java.util.*;
import java.io.*;
public class lab5b
{
	public static void main(String[] args)
	{
		//Scanner
		Scanner kb = new Scanner(System.in);
		
		char yes = 'Y';
		
		do{
		System.out.println("Please enter number of rows: ");
		
		int rows = kb.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		//Activate the loop
		System.out.println("Would you like to try again? Press y for yes.");
		kb.nextLine();
		String repeat = kb.nextLine();
		yes = repeat.charAt(0);
		}
		
		while(yes == 'Y' || yes == 'y');
		
	}
}