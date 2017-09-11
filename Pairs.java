import java.util.Scanner;

public class Pairs
{
public static void main (String [] args) 
	
	{
	
		Scanner Number= new Scanner(System.in); 
		System.out.println ("Please enter a number."); 

		double number1=Number.nextDouble(); 
		
		/* The user is prompted to enter a number, 
		which will be saved as a double when captured by the Scanner object called Number */

		Scanner Number2= new Scanner(System.in); 
		System.out.println("Please enter a second number.");

		double number2=Number2.nextDouble();
		
		/* The user is prompted to enter a number, 
		which will be saved as a double when captured by the Scanner object called Number */
		
				
		System.out.println ("The sum of " + number1 + ", your first number," + " and "+ number2+ ", your second number is "+ (number1+number2)); 
			/* Add the two numbers the user gave as input that were captured by Scanner. */
		System.out.println ("The difference of " + number1 +	", your first number," + " and "+ number2 + ", your second number is "+ (number1-number2));
			/* Subtract the two numbers the user gave as input that were captured by Scanner. */
		System.out.println ("The product of " + number1 +	", your first number," + " and "+ number2 + ", your second number is " + (number1*number2));
			/* Multiply the two numbers the user gave as input that were captured by Scanner. */
		System.out.println ("The quotient of " + number1+	", your first number," + " and "+ number2 + ", your second number is "+ (number1/number2));		
			/* Divide the two numbers the user gave as input that were captured by Scanner. */
		}
	}
		 
		
		