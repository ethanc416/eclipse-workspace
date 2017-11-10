
public class Problem5_11 {

	public static void main(String[] args) {
		/* 
		 * (Find numbers divisible by 5 or 6, but not both)
		 * Write a program that displays all the numbers
		 * from 100 to 200, ten per line, that are divisible
		 * by 5 or 6, but not both. Numbers are separated
		 * by exactly one space.
		 */
		int x = 100;
		while (x <= 200) {
			if (x % 5 == 0)
				System.out.print(x + " ");
			x++;
			if (x % 50 == 0)
				System.out.println("\n");
		}

	}

}
