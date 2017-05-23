import java.io.*;
import java.util.*;
import java.text.*;
public class lab3b
{
	public static void main(String[] args)
	{
		//Create Scanner
		Scanner kb = new Scanner(System.in);

		//Ask for Weight and Height
		System.out.print("Weight: ");
		double weight = kb.nextDouble();

		System.out.print("Height ");
		double height = kb.nextDouble();

		//Make space
		System.out.println();

		//Calculate and Display BMI (imperial)
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Weight: " + df.format(weight));
		System.out.println("Height: " + df.format(height));
		System.out.println("BMI: " + df.format((weight/(height*height))*703));
	}
}

