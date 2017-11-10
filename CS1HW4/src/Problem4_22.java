import java.util.Scanner;

public class Problem4_22 {

	public static void main(String[] args) {
		// Create a program that checks to see if one string
		// is a substring of the first string

		Scanner input = new Scanner(System.in);
		System.out.println("Enter string s1: ");
		String s1 = input.nextLine();
		System.out.println("Enter string s2: ");
		String s2 = input.nextLine();

		if (s1.contains(s2)) {
			System.out.println(s2 + " is a substring of " + s1);

		}
		else
			System.out.println(s2 + " is not a substring of " + s1);
	}

}
