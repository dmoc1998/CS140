//Daniel Moc
//Lab 5
//4/27/17

import java.util.*;
import java.io.*;
public class lab5
{
		public static void main(String[] args)
		{
				//Scanner
				Scanner kb = new Scanner(System.in);
				char yes = 'Y';
				do{
				//Ask for Metric or Imperial
				System.out.println("Metric or Imperial? Press i for Imperial or any other letter key for Metric.");
				String option;
				option = kb.nextLine();
				char imp;
				imp = option.charAt(0);
				int BMI = 0;
				
				
				//Determine if using Metric or Imperial
				boolean imperial;
				imperial = imp=='i';
				if(imperial) {
					//Ask for weight in pounds
					System.out.println("Please enter your weight in lb.");
					int weightLb = kb.nextInt();
					
					//Ask for height in inches
					System.out.println("Please enter your height in in.");
					int heightIn = kb.nextInt();
					
					//Calculate BMI
					BMI = (weightLb*703)/(heightIn*heightIn);
					System.out.println("Your BMI is " + BMI);
				}
				boolean metric;
				metric = imp=='m';
				if(metric) {
					//Ask for weight in kg
					System.out.println("Please enter your weight in kg.");
					int weightKg = kb.nextInt();
					
					//Ask for height in m
					System.out.println("Please enter your height in m.");
					int heightM = kb.nextInt();
					
					//Calculate BMI
					BMI = (weightKg/(heightM*heightM));
					System.out.println("Your BMI is " + BMI);
				}
				if(BMI <=24) {
					System.out.println("Your BMI status is normal.");
				}
				if(BMI >= 24 && BMI <=29) {
					System.out.println("Your BMI status is overweight.");
				}
				if(BMI >30) {
					System.out.println("Your BMI status is obese.");
				}
				
				//Activate the loop
				System.out.println("Do you want to calculate another BMI? Enter Y or y for Yes.");
				
				kb.nextLine();
				
				String option2 = kb.nextLine();
				
				yes = option2.charAt(0);
				}
				
				while(yes == 'Y' || yes == 'y');
		}
}
					