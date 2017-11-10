
public class Problem4_16 {

	public static void main(String[] args) {
		// Write a program that generates a
		// random Uppercase letter when the user runs it

		char randomChar = (char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1));

		System.out.println("A random uppercase letter is " + randomChar);

	}

}
