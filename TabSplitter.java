import java.util.Scanner;  
/* Import the Scanner library, not a default, to be able to create
a new Scanner Object. */ 

public class TabSplitter

{
	public static void main (String[] args)
	{
		System.out.println("Welcome to Tab Splitter!");	

		Scanner BillAmt = new Scanner(System.in); 	
		System.out.println ("Please enter a bill amount.");
		/* Use Scanner to capture this input.*/
		double bill = BillAmt.nextDouble();
		//Save it as a double//
		
		Scanner TipPercent = new Scanner(System.in); 	
		System.out.println ("Please enter an tip rate.");
		double tip = TipPercent.nextDouble();
		//Use another Scanner object to capture this input.//
		// Save it as a double.//
		
		Scanner Customers = new Scanner(System.in); 	
		System.out.println ("How many customers are splitting the bill?");
		int customers = Customers.nextInt();
		double billamount = bill * (1+tip);	
		/*Use another Scanner object to capture this input.*/
		// Save it as a double.//
		System.out.println ("Your total, without tip is $" + bill);
		System.out.println ("Your total, with tip is $" + billamount);
		System.out.println ("With " + customers + " customers splitting the bill, each should pay " + (billamount/customers));	
		/* Using a combination of string literals and varibles (doubles, specifically), print out the desired information.*/
	}	

}
