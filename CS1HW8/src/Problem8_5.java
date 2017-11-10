import java.util.Scanner;
public class Problem8_5 {
	public static void main(String[] args) {
		// (Algebra: add two matrices) Write a method to add two matrices.
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] outcome;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix1(" + a.length + " rows and " + a[0].length + " columns): ");
		for (int m1 = 0; m1 < a.length; m1++) {
			for (int m2 = 0; m2 < a[m1].length; m2++) {
				a[m1][m2] = input.nextDouble();
			}
		}
		System.out.println("Enter matrix2(" + b.length + " rows and " + b[0].length + " columns): ");
		for (int m1 = 0; m1 < b.length; m1++) {
			for (int m2 = 0; m2 < b[m1].length; m2++) {
				b[m1][m2] = input.nextDouble();
			}
		}
		outcome = addMatrix(a, b);
		System.out.println("The matrices are added as follows");
		for (int m1 = 0; m1 < outcome.length; m1++) {
			for (int m2 = 0; m2 < outcome[0].length; m2++) {
				System.out.print("m1(" + a[m1][m2] + ")" + "  +  " 
						+ "m2(" + b[m1][m2] + ")" + "  =  " 
						+ outcome[m1][m2] + "\n");
			}
		}
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] result = new double[a.length][b.length];
		for (int m1 = 0; m1 < result.length; m1++) {
			for (int m2 = 0; m2 < result[0].length; m2++) {
				result[m1][m2] = a[m1][m2] + b[m1][m2];
			}
		}
		return result;
	}
}
