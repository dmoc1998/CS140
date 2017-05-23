import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class proj2
{
	public static void main(String[] args)
	{
		//Scanner kb
		Scanner kb = new Scanner(System.in);
		
		//Decimals
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		//Variables
		char crustType; 				//code for type
		String crust; 					//name of crust
		int inches;						//pizza size
		int chances = 0;				//number of chances to enter size
		boolean flag = true;			//flag for size
		int crustChances = 0;			//number of chances to enter crust
		boolean flag2 = true;			//flag for crust		
		double cost = 0.0;				//pizza cost
		final double taxRate = 0.085;	//amount tax owed
		String discount;				//inputted discount (Holiday10, Winter20, VIPmax)
		final double holiday10 = 0.10;	//10% off
		final double winter20 = 0.20;	//20% off
		final double vipmax = 0.25;		//25% off
		double lastTotal = 0.0;			//total of everything
		int numberOfToppings = 0;
		String toppings = "cheese";
		int numberOfPizzas = 0;			//# of pizzas
		int numberOfPizzas2 = 0;
		String pizzaSize2 = "no pizzas";
		String toppings2 = "cheese";
		String toppings3 = "cheese";
		int numberOfPizzas3 = 0;
		String pizzaSize3 = "no pizzas";
		String pizzaSize = "no pizzas";	//size of pizzas
		char repeat;
		
		do{
		chances = 0;
		flag = true;
		//Determine pizza size
		System.out.println("Pizza Size (inches)		Cost");
		System.out.println("	10			$10.99");
		System.out.println("	12			$12.99");
		System.out.println("	14			$14.99");
		System.out.println("	16			$16.99");
		System.out.println("What size pizza would you like?");
		
		while(flag && chances < 5)
		{
			inches = kb.nextInt();
			switch(inches)
			{
				case 10: cost = 10.99;
				flag = false;
				numberOfPizzas++;
				pizzaSize = "ten inch pizza(s)";
				break;
				
				case 12: cost = 12.99;
				numberOfPizzas++;
				pizzaSize = "twelve inch pizza(s)";
				flag = false;
				break;
				
				case 14: cost = 14.99;
				numberOfPizzas++;
				pizzaSize = "fourteen inch pizza(s)";
				flag = false;
				break;
				
				case 16: cost = 16.99;
				numberOfPizzas++;
				pizzaSize = "sixteen inch pizza(s)";
				flag = false;
				break;
				
				default: if(chances <= 5)
				{
					System.out.println("Please enter one of the available sizes.");
					chances++;
				}
			}
		}
		if(chances > 4)
		{
			System.out.println("Sorry, system error :P");
			System.exit(0);
		}

		//Determine pizza crust
		System.out.println("Please enter the crust you would like:");
		System.out.println("The available crust types are hand-tossed, thin-crust, and deep-dish");
		System.out.println("Press h for hand-tossed, t for thin-crust, and d for deep-dish");
		kb.nextLine();
		
		crustChances = 0;
		flag2 = true;
		while(flag2 && crustChances < 3)
		{
			crustType = kb.nextLine().charAt(0);
			switch(crustType)
			{
				case 'h': crust = "hand-tossed";
				cost += 1;
				flag2 = false;
				break;
				
				case 'H': crust = "hand-tossed";
				cost += 1;
				flag2 = false;
				break;
				
				case 't': crust = "thin-crust";
				flag2 = false;
				break;
				
				case 'T': crust = "thin-crust";
				flag2 = false;
				break;
				
				case 'd': crust = "deep-dish";
				cost += 2;
				flag2 = false;
				break;
				
				case 'D': crust = "deep-dish";
				cost += 2;
				flag2 = false;
				break;
				
				default: if(crustChances < 3)
				{
					System.out.println("Please enter one of the available crusts.");
					crustChances++;
				}
			}
		}
		if(crustChances >= 3)
		{
			System.out.println("The default crust is thin-crust.");
			crust = "thin-crust";
		}
		
		//Determine additional toppings
		System.out.println("All pizzas come with cheese.");
		System.out.println("Additional toppings are $1.25 each, choose from:");
		System.out.println("Pepperoni, Sausage, Onion, Mushroom");
		
		//Pepperoni
		System.out.println("Do you want pepperoni? (y/n)");
		numberOfToppings = kb.nextLine().charAt(0);
		if(numberOfToppings == 'Y' || numberOfToppings == 'y')
		{
			numberOfToppings++;
			toppings = toppings + ", pepperoni";
			cost = cost + 1.25;
		}
		//Sausage
		System.out.println("Do you want sausage? (y/n)");
		numberOfToppings = kb.nextLine().charAt(0);
		if(numberOfToppings == 'Y' || numberOfToppings == 'y')
		{
			numberOfToppings++;
			toppings = toppings + ", sausage";
			cost = cost + 1.25;
		}
		//Onion
		System.out.println("Do you want onions? (y/n)");
		numberOfToppings = kb.nextLine().charAt(0);
		if(numberOfToppings == 'Y' || numberOfToppings == 'y')
		{
			numberOfToppings++;
			toppings = toppings + ", onion";
			cost = cost + 1.25;
		}
		//Mushroom
		System.out.println("Do you want mushrooms? (y/n)");
		numberOfToppings = kb.nextLine().charAt(0);
		if(numberOfToppings == 'Y' || numberOfToppings == 'y')
		{
			numberOfToppings++;
			toppings = toppings + ", mushroom";
			cost = cost + 1.25;
		}
		
		//Determine discounts
		System.out.print("Enter coupon code (if any): ");
		discount = kb.nextLine();
		switch(discount)
		{
			case "holiday10": cost = cost - (cost * holiday10);
			break;
			
			case "winter20": cost = cost - (cost * winter20);
			break;
			
			case "vipmax": cost = cost - (cost * winter20);
			break;
		}
		
		//Calculations
		System.out.println("Your order is: " + numberOfPizzas + " " + pizzaSize + ", with " + toppings);
		cost = cost + (cost * taxRate);
		lastTotal = cost + lastTotal;
		System.out.println("Final Cost: $" + df.format(lastTotal));
		System.out.println("Would you like to order another pizza? Press y for yes and n for no");
		repeat = kb.nextLine().charAt(0);
		} while (repeat == 'y' || repeat == 'Y');
	}
}
