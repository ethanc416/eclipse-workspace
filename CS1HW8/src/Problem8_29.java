import java.util.*;
public class Problem8_29 {
	public static void main(String[] args) {
		/** (Identical arrays) The two-dimensional
		 *  arrays m1 and m2 are identical if they
		 *  have the same contents. Write a method 
		 *  that returns true if m1 and m2 are identical.
		 */
		int[][] m1 = new int[2][2];
		int[][] m2 = new int[2][2];
		Scanner input = new Scanner(System.in);
		
		// make first array
		System.out.print("Enter list1: ");
		for (int a = 0; a < m1.length; a++)
			for (int b = 0; b < m1[a].length; b++)
				m1[a][b] = input.nextInt();
		
		// make second array
		System.out.print("Enter list2: ");
		for (int a = 0; a < m2.length; a++)
			for (int b = 0; b < m2[a].length; b++)
				m2[a][b] = input.nextInt();
		
		// sort arrays
		//Arrays.sort(m1);
		//Arrays.sort(m2);
		
		
		if (equals(m1,m2)) {
			System.out.println("The two arrays are identical.");
		} else {
			System.out.println("The two arrays are not identical");
		}
	}

	/// https://coderanch.com/t/647655/java/Converting-Multidimensional-array-array
	public static boolean equals(int[][] m1, int[][]m2) {
		for (int a = 0; a < m1.length; a++) {
			for (int b = 0; b < m1[a].length; b++) {
				
				if (m1[a][b] != m2[a][b]) return false;
			}
		}
		return true;
	}
}