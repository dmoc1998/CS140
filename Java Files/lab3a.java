import java.io.*;
import java.util.*;
import java.text.*;
public class lab3a
{
	public static void main (String[] args)
	{
		//Create Scanner
		Scanner kb = new Scanner(System.in);

		//Ask for weight and height in kg and m
		System.out.print("Weight: ");
		double weight = kb.nextDouble();
		System.out.print("Height: ");
		double height = kb.nextDouble();
		
		//Make space
		System.out.println();

		//Calculate and Display BMI
		DecimalFormat df = new DecimalFormat("###.00");
		System.out.println("Weight: " + df.format(weight));
		System.out.println("Height: " + df.format(height));
		System.out.println("BMI: " + df.format(weight/(height*height)));
	}
}
