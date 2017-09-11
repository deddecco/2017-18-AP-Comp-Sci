import java.util.Scanner;  

public class CompInt

{
	public static void main (String[] args)
	{
		Scanner Investment = new Scanner(System.in); 	
		System.out.println ("Please enter a principal.");
		double investment = Investment.nextDouble();
	
	
		Scanner Interest = new Scanner(System.in); 	
		System.out.println ("Please enter an interest rate.");
		double interest = Interest.nextDouble();
		
		Scanner TimesComp = new Scanner(System.in); 	
		System.out.println ("How many times is your interest calculated yearly?");
		double timesComp = TimesComp.nextDouble();

		Scanner Time = new Scanner(System.in); 	
		System.out.println ("How long has your money been in this account?");
		double time = Time.nextDouble();

		System.out.print (investment*Math.pow((1+interest/timesComp),(timesComp*time)));
		
	}
	
}
