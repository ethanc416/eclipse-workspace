public class Problem6_14 {
	public static void main(String[] args) {
		/** Write a method that returns m(i) for a given i
		 * and write a test program that displays the following table
		 */
		System.out.println("i\t\tm(i)");
		for (int i = 1; i <= 901; i = i + 100) {
			double m = piCalculations(i);
			System.out.printf(i + "\t\t" + "%.4f\n", m);
		}

	}
	public static double piCalculations(double p) {
		double piEstimate = 0;
		for (double i = 1; i <= p; i++) {
			piEstimate += Math.pow(-1, i +1) / (2 * i - 1);
		}
		piEstimate = piEstimate * 4;
		return piEstimate;
	}


}