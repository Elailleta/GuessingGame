import java.util.*;
public class GuessingGame {

	public static void main(String[] args) {
		//Make a scanner and random generator
		
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		//make variables
		
		int userGuess;
		int counter=0;
		int answer;
		
		//get a random number for the answer
		
		answer=rnd.nextInt (10-1+1)+1;
		
		//ask the user for a number
		
		System.out.println("Guess a number from 1-10");
		
		//read it in
		
		userGuess=in.nextInt();
		counter++;
		
		//while the answer != userGuess
		     
		while(answer!=userGuess){
	        //Say you're wrong
		    
			System.out.println("YOU'RE WRONG! Please try again :)");
			
			// read in another user guess
		    
			userGuess=in.nextInt();
		    counter++;
		
		}
		    //tell them they got it right
		
		System.out.println("ABOUT TIME");
		System.out.println("That only took you "+counter+" guesses!");
		
	

	}
}