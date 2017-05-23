import java.util.*;
import java.io.*;

public class project2a
{
	public static void main(String[] args)
	{		
		//Scanner kb
		Scanner kb = new Scanner(System.in);
		
		//prompt user and get pizza size choice
		System.out.println("Pizza Size (inches)		Cost");
		System.out.println("	10			$10.99");
		System.out.println("	12			$12.99");
		System.out.println("	14			$14.99");
		System.out.println("	16			$16.99");
		System.out.println("What size pizza would you like?");
		
		int pizzaSize, chances = 0;
		pizzaSize = kb.nextInt();
		
		//Determine valid pizza size
		while(!(pizzaSize == 10) && !(pizzaSize == 12) && !(pizzaSize == 14) && !(pizzaSize == 16) && chances < 4)
		{
			System.out.println("Please enter one of the available sizes.");
			chances++;
			kb.nextInt();
			if(chances == 4)
			{
					System.out.println("System error, sorry :P");
					System.exit(0);
			}
		}
		
		//Crust choice
		String crustChoice = kb.nextLine();
		int crustChances = 0;
		System.out.println("Please enter the crust you would like:");
		System.out.println("The available crust types are hand-tossed, thin-crust, and deep-dish");
		kb.nextLine();
		
		if(!(crustChoice.equals("hand-tossed")) && crustChances < 3)
		{
			System.out.println("Please enter one of the available crusts.");
			crustChances++;
			kb.nextInt();
			if(crustChances == 3)
			{
				System.out.println("The default choice is thin-crust.");
			}
		}
	}
}