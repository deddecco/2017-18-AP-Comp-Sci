import java.util.Scanner;  

public class SphereVolume

{
	public static void main (String[] args)
	{
		Scanner funky = new Scanner(System.in); 	
		System.out.print ("Please enter a radius.");
		double radius=funky.nextDouble();
		
		double volume = 4/3.0 * Math.PI * Math.pow(radius,3); // (4*pi*r^3)/3 
		System.out.println ("Volume of the sphere:" + volume); 
	}
	
}
