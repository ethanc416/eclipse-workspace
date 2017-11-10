import java.util.Scanner;

public class TitobiCS1HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* problem 2.3
		 * (Convert feet to meters) write a program that reads a number in feet, converts it to meters, and display the result.one foot is 0.305 meters 
		 */// get feet 
		 /// one foot is 0.305 meters
		
		


		// create scanner object for user
		
		Scanner input = new Scanner(System.in);

		//  Allow user to put in a value
		System.out.print("Enter a value  for feet");

		double feet = input.nextDouble();
		// convert feet to meters 
double meters = feet * 0.305;
		System.out.println(" meter is " + "meter" + " feet is " + "feet");




	}

}
