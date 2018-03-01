import java.util.*;
import java.util.Scanner;

public class GuessingGameProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Make a scanner and random generator

		Scanner in=new Scanner(System.in);
		Random rnd=new Random();
		//make variables
		int userGuess;
		int counter=0;
		int answer;
		int diff;
		//get a random number for the answer
		answer=rnd.nextInt (100-1+1)+1;
		//ask the user for a number
		System.out.println("Guess a number from 1-100");
		//read it in
		userGuess=in.nextInt();
		counter++;
		diff= Math.abs(userGuess-answer);
		//while the answer != userGuess
		while(answer!=userGuess){
			//too high
			if(diff>10&&answer<userGuess){
				System.out.println("LOWER");
			}
			//too low
			else if(diff<10&&answer>userGuess){
				System.out.println("HIGHER");
			}



			//Say you're wrong
			System.out.println("YOU'RE WRONG! Please try again :)");
			// read in another user guess
			userGuess=in.nextInt();
			counter++;
			diff=userGuess-answer;
		}
		//tell them they got it right
		System.out.println("ABOUT TIME");
		//				if (counter==1){
		//					System.out.println("That only took you "+counter+" guess");
		//				}else{
		//				
		//				System.out.println("That only took you "+counter+" guesses!");
		System.out.println("That only took you "+counter +(counter==1?" guess":" guesses"));
	}

	//			}
}




