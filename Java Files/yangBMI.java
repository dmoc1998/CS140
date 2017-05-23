import java.io.*;
import java.util.*;
public class yangBMI
{
	public static void main(String[] args)
	{
		//Create Scanner
		Scanner kb = new Scanner(System.in);

		//Ask for metric or Imperial
		System.out.println("Metric or Imperial? Press i for Imperial or any other letter key for Metric.");
		String option;
		option = kb.nextLine();
		char imp;
		imp = option.charAt(0);
		int BMI = 0;

		//Determine if using Metric or Imperial
		boolean imperial;
		imperial = imp=='i';
		if(imperial)
		{
			//Ask for weight in inches
			System.out.println("Please enter your weight in lbs.");
			int weightLb = kb.nextInt();

			//Ask for height in inches
			System.out.println("Please enter your height in inches.");
			int heightIn = kb.nextInt();

			//Calculate BMI
			BMI = (weightLb*703)/(heightIn*heightIn);
			System.out.println("Your BMI is " + BMI);
		}
		else
		{
			//Ask for weight in kg
			System.out.println("Please enter your weight in kg.");
			int weightKg = kb.nextInt();

			//Ask for height in meters
			System.out.println("Please enter your height in m.");
			int heightM = kb.nextInt();

			//Calculate BMI
			BMI = (weightKg/(heightM*heightM));
			System.out.println("Your BMI is " + BMI);
		}
		if(BMI <=24)
		{
			System.out.println("Your BMI status is normal.");
		}
		if(BMI >=24 && BMI <=29)
		{
			System.out.println("Your BMI status is overweight.");
		}
		if(BMI >30)
		{
			System.out.println("Your BMI status is obese.");
		}
	}
}
