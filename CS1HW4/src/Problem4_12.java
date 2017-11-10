import java.util.Scanner;

public class Problem4_12 {

	public static void main(String[] args) {
		// Write a program that converts a hex digit
		// to its corresponding binary number

		// Create the scanner
		Scanner scanner = new Scanner(System.in);
		// Write a print statement for input of hex digit
		System.out.println("Enter a hex digit: ");
		// input of hex digit
		String hexString = scanner.nextLine();

		int hex = Integer.parseInt(hexString, 36);

		// Check if hex string is one character
		if (hexString.length() != 1) {
			System.out.println("You must enter only one character");
			System.exit(1);
		}
		// Display binary value for hex digit
		char ch = hexString.charAt(0);
		if (ch <= 'F' && ch >= 'A') {
			String binary = Integer.toBinaryString(hex);
			String padded = "0000".substring(binary.length()) + binary;
			System.out.println("The binary value is " + padded);
		}
		else if (Character.isDigit(ch)) {
			String binary = Integer.toBinaryString(hex);
			String padded = "0000".substring(binary.length()) + binary;
			System.out.println("The binary value is " + padded);
		}
		else {
			System.out.println(ch + " is an invalid input");
		}
	}
}
