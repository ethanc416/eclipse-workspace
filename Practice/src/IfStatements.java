import java.util.Scanner;

public class IfStatements {
	public static void main(String[] args) {
		//Make an if statement
		Scanner input = new Scanner(System.in);
		System.out.println("Input value for i: ");
		int i = input.nextInt();
		
		if (i > 0) 
			System.out.println("i is positive");
		
		
		if (i < 0) 
			System.out.println("i is negative");
		
		
	}
}
