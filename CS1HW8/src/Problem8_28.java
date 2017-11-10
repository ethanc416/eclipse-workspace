import java.util.Scanner;
public class Problem8_28 {
	public static void main(String[] args) {
		/** (Strictly identical arrays) The two-dimensional
		 *  arrays m1 and m2 are strictly identical if their
		 *  corresponding elements are equal. Write a method
		 *  that returns true if m1 and m2 are strictly identical
		 */
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		for (int a = 0; a < m1.length; a++)
			for (int b = 0; b < m1[a].length; b++)
				m1[a][b] = input.nextInt();
		System.out.print("Enter list2: ");
		for (int a = 0; a < m2.length; a++)
			for (int b = 0; b < m2[a].length; b++)
				m2[a][b] = input.nextInt();

		if (equals(m1, m2)) {
			System.out.println("The two arrays are strictly identical.");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}

	}

	public static boolean equals(int[][] m1, int[][]m2) {
		for (int a = 0; a < m1.length; a++) {
			for (int b = 0; b < m1[a].length; b++) {
				if (m1[a][b] != m2[a][b]) return false;
			}
		}
		return true;
	}
}



