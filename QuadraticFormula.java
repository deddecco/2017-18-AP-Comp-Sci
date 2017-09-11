import java.util.Scanner;

//Import the scanner library to be able to create Scanner objects.//
public class QuadraticFormula

{
	public static void main (String[] args)
	{
		System.out.println("Welcome to Quadratic Formula! This program determines the real roots of a quadratic equation given the three coefficients, (a,b,c).");	
		//Welcome the user to the program. Prompt them for the first coefficient.//
		Scanner input = new Scanner(System.in); 	
		System.out.println("Please coefficient a.");
		double a = input.nextDouble();
		//Use a Scanner object to capture the input from the keyboard and save it as a double.//
		
		// Scanner B = new Scanner(System.in); 	
		System.out.println("Please coefficient b.");
		double b = input.nextDouble();
		//Use a Scanner object to capture the input from the keyboard and save it as a double.//

		// Scanner C = new Scanner(System.in); 	
		System.out.println("Please enter coefficient c.");
		double c = input.nextInt();
		//Use a Scanner object to capture the input from the keyboard and save it as a double.//

		System.out.println("Your qudratic coefficient, a, is " + a);
		System.out.println("Your linear coefficient, b, is " + b);
		System.out.println("Your constant, c, is " + c );	
		//Just for confirmation, print the coefficients back to the user.//

      double b2minus4ac = Math.sqrt(Math.pow(b, 2)-(4*a*c));
      
		double x1 = (-b + b2minus4ac)/(2*a); 
		//Create a double  whose value is the first real root of a quadratic with given coefficients.//

		double x2 = (-b - b2minus4ac)/(2*a); 
		//Create a double  whose value is the second real root of a quadratic with given coefficients.//

		System.out.println(x1); /* Print out the first root.*/ 
		System.out.println(x2);	/* Print out the second root.*/ 
	}	

}
