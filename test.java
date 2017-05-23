import java.util.*;
import java.io.*;
public class test
{
	public static void main (String[] args)
	{
		// Prompts user for additonal toppings
		System.out.println("All pizzas come with cheese." );
		System.out.println("Additional toppings are $1.25 each, choose from Pepperoni, Sausage, Onion, or Mushroom." );
	
		// Pepperoni
		System.out.println("Do you want Pepperoni? (Y/N)" );
		numberOfToppings = keyboard.nextLine().charAt(0);
		if (numberOfToppings == 'Y' || numberOfToppings == 'y' )
			numberOfToppings = numberOfToppings + 1; 
			toppings = toppings + " Pepperoni";
	
		// Sausage
		System.out.println("Do you want Sausage? (Y/N)" );
		numberOfToppings = keyboard.nextLine().charAt(0);
		if (numberOfToppings == 'Y' || numberOfToppings == 'y' )
			numberOfToppings = numberOfToppings + 1;
			toppings = toppings + " Sausage";
	
		// Onion
		System.out.println("Do you want Onion? (Y/N)" );
		numberOfToppings = keyboard.nextLine().charAt(0);
		if (numberOfToppings == 'Y' || numberOfToppings == 'y' )
			numberOfToppings = numberOfToppings + 1;
			toppings = toppings + " Onion";
	
		// Mushroom
		System.out.println("Do you want Mushroom? (Y/N)" );
		numberOfToppings = keyboard.nextLine().charAt(0);
		if (numberOfToppings == 'Y' || numberOfToppings == 'y' )
			numberOfToppings = numberOfToppings + 1;
			toppings = toppings + " Mushroom";