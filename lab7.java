//Daniel Moc
//5/11/2017
//Lab 7

import java.util.Scanner;
public class lab7
{
	public static void main (String [] args)
	{
		//Variables
		int choice; 				//the user's choice
		double value = 0;			//the value returned from the method
		char letter;  				//the Y or N from the user's decision to exit 
		double radius; 				//the radius of the circle
		double length; 				//the length of the rectangle 
		double width,height; 		//the width and height of the rectangle 
		double base;  				//the base of the triangle 
		double side1,side2,side3;  	//sides of the triangle
		
		//Scanner
		Scanner kb = new Scanner (System.in);
		
		//Display menu
		do
		{
			//PrintMenu
			printMenu();
			choice = kb.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter the radius of the circle:  ");
					radius = kb.nextDouble();
					value = circleArea(radius);										//get circleArea and put in 'value'
					System.out.println("The area of the circle is " + value);
					break;
				case 2:
					System.out.print("Enter the length of the rectangle:  "); 
					length = kb.nextDouble();
					System.out.print("Enter the width of the rectangle:  ");
					width = kb.nextDouble();
					value = rectangleArea(length,width);							//get rectangleArea and put in 'value'
					System.out.println("The area of the rectangle is " + value); 
					break;
				case 3:
					System.out.print("Enter the height of the triangle:  "); 
					height = kb.nextDouble(); 
					System.out.print("Enter the base of the triangle:  "); 
					base = kb.nextDouble();
					value = triangleArea(height,base);								//get triangleArea and put in 'value'
					System.out.println("The area of the triangle is " + value); 
					break;
				 case 4:
					System.out.print("Enter the radius of the circle:  ");
					radius = kb.nextDouble();
					value = circleCircumference(radius);							//get circleCircumference and put in 'value'
					System.out.println("The circumference of the circle is " + value); 
					break;
				case 5:
					System.out.print("Enter the length of the rectangle:  "); 
					length = kb.nextDouble(); 
					System.out.print("Enter the width of the rectangle:  "); 
					width = kb.nextDouble();
					value = rectanglePerimeter(length,width);						//get rectanglePerimeter and put in 'value'
					System.out.println("The perimeter of the rectangle is " + value); 
					break;
				case 6:
					System.out.print("Enter the length of side 1 of the triangle:  ");
					side1 = kb.nextDouble();
					System.out.print("Enter the length of side 2 of the triangle:  ");
					side2 = kb.nextDouble();
					System.out.print("Enter the length of side 3 of the triangle:  ");
					side3 = kb.nextDouble();
					value = trianglePerimeter(side1,side2,side3);					//get trianglePerimeter and put in 'value'
					System.out.println("The perimeter of the triangle is " + value); 
					break;
				default:
					System.out.println("You did not enter a valid choice.");
			}
			
			//Eat the newLine after input
			kb.nextLine();
			
			System.out.println("Do you want to exit the program? (y/n): " );
			String answer = kb.nextLine();
			letter = answer.charAt(0);
		}
		while(letter != 'Y' && letter != 'y');
	}
	
	//Create printMenu method here
	public static void printMenu()
	{
		System.out.println("This is a geometry calculator ");
		System.out.println("Choose what you would like to calculate!");
		System.out.println("1. Find the area of a circle ");
		System.out.println("2. Find the area of a rectangle ");
		System.out.println("3. Find the area of a triangle ");
		System.out.println("4. Find the circumference of a cirle ");
		System.out.println("5. Find the perimeter of a rectangle ");
		System.out.println("6. Find the perimeter of a triangle");
		System.out.print("Enter the number of your choice: ");
	}

	//Create the value-returning methods here
	public static double circleArea(double r)
	{
		return Math.PI * r * r;
	}
	public static double rectangleArea(double length, double width)
	{
		return length * width;
	}
	public static double triangleArea(double height, double base)
	{
		return 0.5 * height * base;
	}
	public static double circleCircumference(double r)
	{
		return 2 * Math.PI * r;
	}
	public static double rectanglePerimeter(double length, double width)
	{
		return 2* length + 2 * width;
	}
	public static double trianglePerimeter(double side1, double side2, double side3)
	{
		return side1 + side2 + side3;
	}
}

/*hand calculated results
1. radius = 4, circleArea = 50.26548246
2. length = 10, width = 15, rectangleArea = 150
3. height = 4.3, base = 2.7, triangleArea = 5.805
4. radius = 7.9, circleCircumference = 49.63716393
5. length = 7, width = 0.87, rectanglePerimeter = 15.74
6. side1 = 14.2, side2 = 0.9, side3 = 3.14, trianglePerimeter = 18.24

program calculated results

Script started on Thu 11 May 2017 01:51:29 PM PDT
]0;dmoc@costello:~[01;32mdmoc@costello[01;34m ~ $[00m script proj2.txt[1Ppico proj2.java[1Pcat[C[C[C[C[C[C[C[C[C[C[Cexit[Kcat proj2.java[1@pico[C[C[C[C[C[C[C[C[C[C[Cscript proj2.txt[Kscript proj2.txt[Kl[Kjava 7[Klab7
This is a geometry calculator 
Choose what you would like to calculate!
1. Find the area of a circle 
2. Find the area of a rectangle 
3. Find the area of a triangle 
4. Find the circumference of a cirle 
5. Find the perimeter of a rectangle 
6. Find the perimeter of a triangle
Enter the number of your choice: 1
Enter the radius of the circle:  4
The area of the circle is 50.26548245743669
Do you want to exit the program? (y/n): 
n
This is a geometry calculator 
Choose what you would like to calculate!
1. Find the area of a circle 
2. Find the area of a rectangle 
3. Find the area of a triangle 
4. Find the circumference of a cirle 
5. Find the perimeter of a rectangle 
6. Find the perimeter of a triangle
Enter the number of your choice: 2
Enter the length of the rectangle:  10
Enter the width of the rectangle:  15
The area of the rectangle is 150.0
Do you want to exit the program? (y/n): 
n
This is a geometry calculator 
Choose what you would like to calculate!
1. Find the area of a circle 
2. Find the area of a rectangle 
3. Find the area of a triangle 
4. Find the circumference of a cirle 
5. Find the perimeter of a rectangle 
6. Find the perimeter of a triangle
Enter the number of your choice: 3
Enter the height of the triangle:  4.3
Enter the base of the triangle:  2.7
The area of the triangle is 5.805
Do you want to exit the program? (y/n): 
n
This is a geometry calculator 
Choose what you would like to calculate!
1. Find the area of a circle 
2. Find the area of a rectangle 
3. Find the area of a triangle 
4. Find the circumference of a cirle 
5. Find the perimeter of a rectangle 
6. Find the perimeter of a triangle
Enter the number of your choice: 4
Enter the radius of the circle:  7.8 9
The circumference of the circle is 49.637163926718735
Do you want to exit the program? (y/n): 
n
This is a geometry calculator 
Choose what you would like to calculate!
1. Find the area of a circle 
2. Find the area of a rectangle 
3. Find the area of a triangle 
4. Find the circumference of a cirle 
5. Find the perimeter of a rectangle 
6. Find the perimeter of a triangle
Enter the number of your choice: 5
Enter the length of the rectangle:  7
Enter the width of the rectangle:  0.87
The perimeter of the rectangle is 15.74
Do you want to exit the program? (y/n): 
^[[A    n
This is a geometry calculator 
Choose what you would like to calculate!
1. Find the area of a circle 
2. Find the area of a rectangle 
3. Find the area of a triangle 
4. Find the circumference of a cirle 
5. Find the perimeter of a rectangle 
6. Find the perimeter of a triangle
Enter the number of your choice: 6
Enter the length of side 1 of the triangle:  14.2
Enter the length of side 2 of the triangle:  0.9
Enter the length of side 3 of the triangle:  3.14
The perimeter of the triangle is 18.24
Do you want to exit the program? (y/n): 
y
]0;dmoc@costello:~[01;32mdmoc@costello[01;34m ~ $[00m exit
exit

Script done on Thu 11 May 2017 01:59:31 PM PDT
*/