 /* This program will convvert an object's weight on Earth  
		to its equivalent weight on the Moon. */

import java.util.Scanner; //Scanner step 1

public class MoonWeight
{
	public static void main(String[] args)
	{
		double G=6.67e-11; //G is the Gravitational constant.
		double Me=5.97e24; //Me is the mass of the Earth in kg. 
		double Re=6.37e6; //Re is the radius of the Earth in m. 

			 
			
			
		double EarthGravity = (G*Me)/(Re*Re);
		//System.out.println (EarthGravity);	

		
		double Mm=7.35e22; //Mm is the mass of the Moon in kg. 
		double Rm=1.74e6; //Re is the radius of the Moon in m. 
		
			//G is the Gravitational constant. 
						
		double MoonGravity = (G*Mm)/(Rm*Rm);
		//System.out.println (MoonGravity);	
		
		double ratio=MoonGravity/EarthGravity;
		//System.out.println (ratio);
		
		//Get user's input 
		Scanner FriedChicken= new Scanner(System.in); //Scanner step 2
		System.out.println ("Please enter your weight on Earth."); //Scanner step 3
		double weight=FriedChicken.nextDouble(); //Scanner step 4
		
		System.out.println("If you weigh " + weight + " on Earth, you would weigh "+ weight*ratio + " on the moon.");
	}
	
}