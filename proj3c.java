//	Daniel Moc
//	5/23/17
//	Project 3B

import java.util.*;
import java.io.*;

public class proj3c{
	// 1 = rock
	// 2 = paper
	// 3 = scissors
	public static void main(String args[])
	{
		int compChoice = computerGenerateNumber();
		int userChoice = getUserChoice();
		displayComputerChoice(compChoice);
		String winner = selectWinner(userChoice, compChoice);
		displayWinnerOrMsg(winner);	
	}
	
	public static int computerGenerateNumber()
	{
		Random rand = new Random();
		int compChoice = rand.nextInt(3) + 1;
		return compChoice;
	}
	
	public static int getUserChoice()
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors");
		int userInput = k.nextInt();
		return userInput;	
	}
	
	public static void displayComputerChoice(int choice)
	{
		switch(choice)
		{
			case 1:
				System.out.println("Computer chose rock");
				break;
			case 2:
				System.out.println("Computer chose paper");
				break;
			case 3:
				System.out.println("Computer chose scissors");
				break;	
		}
	}
	
	public static String selectWinner(int user, int pc)
	{
		if( user > pc || (user == 1 && pc == 3 )){
			return "User";
			
		}else if(user == pc){
			return "Nobody";
		}
		else{
			return "PC";
		}
	}
	public static void displayWinnerOrMsg(String winner)
	{
		System.out.println(winner + " won the game!");
	}
}