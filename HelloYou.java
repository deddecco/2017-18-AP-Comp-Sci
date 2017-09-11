import java.util.Scanner;

public class HelloYou
{
public static void main (String [] args) 

	{
		Scanner Popsicle= new Scanner(System.in); 
		System.out.println ("Please enter your name:  ");
		
		String name= Popsicle.nextLine(); 
		
		System.out.print ("Hello, " + name+ "!");
	}

}