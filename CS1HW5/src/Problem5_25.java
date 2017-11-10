
public class Problem5_25 {

	public static void main(String[] args) {
		/*
		 * (Compute pi) You can approximate p by using
		 * the following series: 4*((1/1 + 1/5 + 1/9+ ...)
		 * +(-1/3 - 1/7 - 1/11 - ...)) Write a program that
		 * displays the pi value for i = 10,000, 20,000, ..., and 100,000.
		 */
		for (int i = 10000; i <= 100000; i++) {
			double pi = 4 * (1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13)+(Math.pow(-1, i+1)/(2*i-1)));
			if (i % 10000 == 0) {
				System.out.println("The value of pi when i equals " + i + " is " + pi);}
		}
	}
}
