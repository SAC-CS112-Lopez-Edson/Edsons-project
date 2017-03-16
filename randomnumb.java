import java.util.Scanner;

public class randomnumb {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int rndnumber;
		int user;
		int count1 = 1;
		int count2 = 1;
		int b = 0;
		
		while (b != 3) { 
			
			//Computer generating a number between 0-10
			rndnumber = 0 + (int)(Math.random() * 10);

			//User inputs number
			System.out.print("Pick a number between 0 and 10: ");
			user = input.nextInt();
			
			//Setting the games rule
			if (user == rndnumber) {
				
				System.out.print("you win");
				System.out.printf("\nYou have won %d game(s).", count1);
				count1++;
				
			} else {
				System.out.print("You Lose!");
				System.out.printf("\nYou have lost %d game(s).", count2);
				count2++;
			}
			
			//Prints out the computers number
			System.out.printf("\nComputer chose %d ", rndnumber);
		
			//Try again
			System.out.print("\nTry Again? Yes = 1, No = 0: ");
			user = input.nextInt();
			int y = 1;
			int n = 0;
		
			if (user == y) {
			b = 1;
			} else {
			
			System.out.print("Adios");
			System.exit(0);
			}
	}
	}
}
