import java.util.Scanner;
import java.util.Random;


public class RPS {
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Random rps = new Random();
		
		
		int rock = 1;
		int scissor = 2;
		int paper = 3;
		
		int user;
		
		System.out.print("Pick 1, 2, or 3 \nRock(1), Scissors(2), Paper(3)");
		
		System.out.println("\nSelect a number: ");
		user = input.nextInt(); // user inputs a number
		
		if (user == rock) {
			System.out.print("Your choice is Rock");
		} else if (user == scissor) {
			System.out.print("Your choice is Scissors");
		} else if (user == paper){
			System.out.print("You chose Paper\n");
		} else  {
			System.out.print("GoodBye\n");
		}
		
		
		int Number = rps.nextInt(3) + 1; // generates a random number between 1 and 3
		
		// Displays what the computer chose
		if (Number == rock){
			System.out.println("Computer chose Rock");
		} else if (Number == scissor) {
			System.out.println("Computer chose Scissors");
		} else {
			System.out.println("Computer chose paper");
		}
		
		
		if (Number == rock) {
			if (user == rock) {
				System.out.println("Tie");
			} else if (user == paper){
				System.out.println("You Win!");
			} else if (user == scissor){
				System.out.println("You Lose!");
			}			
		}
		
		if (Number == scissor) {
			if (user == scissor) {
				System.out.print("Tie");
			} else if (user == paper) {
				System.out.print("You Lose!");
			}else if (user == rock) {
				System.out.print("You Win!");
			} 
		}
		
		if (Number == paper) {
			if (user == paper) {
				System.out.print("Tie");
			} else if (user == rock){
				System.out.print("You Lose!");
			} else if (user == scissor) {
				System.out.print("You Win!");
			}
		}
	
	}	
}
