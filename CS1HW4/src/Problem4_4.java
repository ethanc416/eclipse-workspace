import java.util.Scanner;
public class Problem4_4 {

	public static void main(String[] args) {
		// Write a program that calculates the area
		// of a hexagon when the user inputs the length of a side
		
		// Create the scanner
		Scanner input = new Scanner(System.in);
		// Write print statement for input of side length
		System.out.println("Enter the side: ");
		// input of side length
		double side = input.nextDouble();
		// calculate area using side length
		double area = ((6*Math.pow(side, 2))/(4*Math.tan(Math.PI/6)));
		// Print statement for area of hexagon
		System.out.printf("The area of a hexagon is %.2f\n", area);
	}
}
