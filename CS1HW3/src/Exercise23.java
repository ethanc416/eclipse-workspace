import java.util.Scanner; //Scanner is in the java.util package

public class Exercise23 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);

		//User needs to input a number in feet
		System.out.print("Enter a number in feet: ");
		double feet = input.nextDouble();

		//Convert feet to meters
		double meters = feet * 0.305;

		//Display converted number
		System.out.println(feet + " feet is " + meters + " meters");

	}

}
