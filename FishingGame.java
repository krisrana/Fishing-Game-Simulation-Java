/**
 * Author : Krishna Rana
 * Date   : 6/6/2017
 * Purpose: This is a FishingGame class, which simulates the fishing game.
 * 			with the collaboration of Die class.
 */
import java.util.Scanner;
import java.io.*;
/**
 * FishingGame class
 * This program contains .
 * It also contains the value stored every time a die is rolled.
 */
public class FishingGame 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//local declarations
		int mySide;
		int point = 0;
		String ans,upper,username;
		char choice;
		
		//Prompts for user to interact
		System.out.println("\tFishing Game Simulation\n\n");
		System.out.println("How many sides, Do you want on your Die?");
		System.out.print("Enter a number from 1 to 6, for the sides: ");
		
		//storing the value user inputs
		Scanner input = new Scanner(System.in);
		mySide = input.nextInt();
		//consuming the remaining newline.
		input.nextLine();
		
		//prompting user
		System.out.print("Enter your UserName: ");
		username = input.nextLine();
	
		System.out.print("\n" + username + ", Do you want to fish!! \n(Y)es or (N)o:  ");
		ans = input.nextLine();
		upper = ans.toUpperCase();
		choice = upper.charAt(0);
		
		//do the following condition based on choice of yes or no
		//and verify condition based on side of the die.
		while(choice == 'Y')
		{			
			//Instantiating a class obeject.
			Die myDie = new Die(mySide);
			//if side of die is rolled 1
			if(myDie.getValue() == 1)
			{
				System.out.println("You fished: An old shoe!!");
				System.out.println("I wonder!!, whose it might be..");
				point += 0;
			}
			//if side of die is rolled 2
			if(myDie.getValue() == 2)
			{
				System.out.println("You fished: An empty bottle!!");
				System.out.println("Thanks for keeping earth safe..");
				point += 25;
			}
			//if side of die is rolled 3
			if(myDie.getValue() == 3)
			{
				System.out.println("You fished: A small fish!!");
				System.out.println("Let it go, to grow big!..");
				point += 50;
			}
			//if side of die is rolled 4
			if(myDie.getValue() == 4)
			{
				System.out.println("You fished: A medium fish!!");
				System.out.println("Let's fire up the grill!..");
				point += 75;
			}
			//if side of die is rolled 5
			if(myDie.getValue() == 5)
			{
				System.out.println("You fished: A big fish!!");
				System.out.println("Where's the party at?!?..");
				point += 100;
			}
			//if side of die is rolled 6
			if(myDie.getValue() == 6)
			{
				System.out.println("You fished: A rare fish!!");
				System.out.println("Take a picture to show-off, and let it go..");
				point += 150;
			}
			//prompting the user, to ask if user wants to play more.
			System.out.print("\n" + username + ", Do you want to fish again!! \n(Y)es or (N)o:  ");
			ans = input.nextLine();
			upper = ans.toUpperCase();
			choice = upper.charAt(0);
			
		}
		
		//if the choice is no
		if(choice == 'N')
		{
			System.out.println("\nYou have choose to end the game.");
			System.out.println(username + " Your final score is: " + point);
			
			//end game message based on points
			if(point < 500)
				System.out.println("Not impressive, play more!!");
			if(point > 500 && point < 2000)
				System.out.println("Good Job, Great fishing!!");
			else if(point >= 2000)
				System.out.println("Awesome, you are a true fishing expert.");
			
			//if the user wants to save score
			System.out.print("\nDo you wish to save your score?");
			System.out.print(" (Y)es or (N)o: ");
			String answer = input.nextLine();
			upper = answer.toUpperCase();
			char fileAns = upper.charAt(0);
			//if the user fileAns is yes
			if(fileAns == 'Y')
			{
				//creating file to store score of the user
				FileWriter fw = new FileWriter("Score.txt", true);
				PrintWriter outputFile = new PrintWriter(fw);
				outputFile.println(username + ": " + point + " points");
				
				System.out.println("Your score is saved");
				//end game message
				System.out.println("Thank's for playing!!");
				//closing the input stream for files.
				outputFile.close();
			}	
			else
				System.out.println("Thank's for playing!!");
		}
		//closing Scanner input stream.
		input.close();
	}
}
