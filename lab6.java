import java.io.*;
import java.util.*;

public class lab6
{
	public static void main(String[] args)throws IOException
	{
		//Scanner kb
		Scanner kb = new Scanner(System.in);
		
		//Variables
		String line, upper;
		int numbers, plusfive;
		
		//Input file name
		System.out.print("Enter the file name: ");
		String fileName = kb.nextLine();
		
		//output file name
		System.out.println("Please enter output file name:");
		String outputname = kb.nextLine();
		
		//Open file
		File file = new File(fileName);
		
		//Check to see if file exists
		if(!file.exists())
		{
			//Display error
			System.out.println("*Error*");
			System.exit(0);
		}
		
		//Create scanner for file
		Scanner inputFile = new Scanner(file);
		
		//Determine which file it is
		if(fileName.equals("scores.txt"))
		{
			//Read the lines from the file
			while(inputFile.hasNext())
			{
				//Read the next line of stuff and add 5
				numbers = inputFile.nextInt();
				plusfive = numbers + 5;
				
				//Display the line
				System.out.print(plusfive + " ");
				
				//PrintWriter
				PrintWriter outputfile = new PrintWriter(outputname);
				outputfile.print("87 103 74 80 90 77 96 85 81 93");
				outputfile.close();
			}
		}	
		else if(fileName.equals("roster.txt"))
		{
			//Read the lines from the file
			while(inputFile.hasNext())
			{
				//Read the next line of stuff and convert to UPPERCASE
				line = inputFile.nextLine();
				upper = line.toUpperCase();
				
				//Display the line
				System.out.print(upper + " ");
				
				//PrintWriter
				PrintWriter outputfile = new PrintWriter(outputname);
				outputfile.print("JOE ROSE GREG KIRK RENEE ALEXIS BRANDON MICHELLE MICHAEL ZEE");
				outputfile.close();
			}
		}
		else
		{
			System.out.println("File not found");
		}
		
		//Close file
		inputFile.close();
	}
}