import java.util.Scanner;

public class calculator {
	
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		float number1;
		float number2;
		float sum;
		float diff;
		float prod;
		float quot;
		
		System.out.print("Enter first number: ");
	 	number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		prod = number1 * number2;
		diff = number1 - number2;
		quot = number1 / number2;
		
		
		System.out.printf("The sum is %f.\nThe difference is %f.\nThe product is %f.\nLastly, the quotient is %f", sum, diff, prod, quot);
	}	
}
