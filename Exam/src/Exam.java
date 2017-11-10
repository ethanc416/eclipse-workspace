//Import the scanner
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		//Create the scanner
		Scanner input = new Scanner(System.in);
		
		// User needs to input a length for side 1 and side 2
		System.out.println("Input a length for side 1: ");
		double side1 = input.nextDouble();
		
		System.out.println("Input a length for side 2: ");
		double side2 = input.nextDouble();
		
		// Calculate the area
		double area = side1 * side2;
				
		// Calculate the perimeter
		double perimeter = (side1*2) + (side2*2);
		
		// Display the result
		System.out.println("The area of the square is " + area + ".");
		System.out.println("The perimeter of the square is " + perimeter + ".");

	}

}
