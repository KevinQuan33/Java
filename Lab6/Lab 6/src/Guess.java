// ************************************************************  
//   Guess.java 
// 
//   Play a game where the user guesses a number from 1 to 10 
// 
// ************************************************************ 

import java.util.Scanner; 
import java.util.Random; 

public class Guess 
{ 

	public static void main(String[] args) 
	{ 
		int numToGuess;       //Number the user tries to guess 
		int guess; 			  //The user's guess  
		int wrongGuessH = 0;
		int wrongGuessL = 0;
		int guessNumber = 1;

		Scanner scan = new Scanner(System.in); 
		Random generator = new Random();  
		//randomly generate the number to guess
		numToGuess = generator.nextInt(10) + 1; 
		//print message asking user to enter a guess 
		System.out.println("Please guess a number between 1 and 10");
		//read in guess
		guess = scan.nextInt();

		while (numToGuess != guess)  //keep going as long as the guess is wrong   
		{ //print message saying guess is wrong
		 System.out.println("Your guess is wrong");
		//get another guess from the user
		 System.out.println("Please enter another value");
		 guess = scan.nextInt();
		 if (guess == numToGuess)
			{
				guessNumber++;
				System.out.println("Your guess is right");
				System.out.println(wrongGuessH + " guesses were too high");
				System.out.println(wrongGuessL + " guesses were too low");
				System.out.println("Total guesses: " + guessNumber);
			}
		 else if (guess > numToGuess)
			{
				wrongGuessH++;
				guessNumber++;
			}
			
		 else if (numToGuess > guess)
			{
				wrongGuessL++;
				guessNumber++;
			}
		}
			
		 //print message saying guess is right 
		
		
			
		
	}
} 