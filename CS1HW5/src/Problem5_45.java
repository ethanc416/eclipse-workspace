import java.util.Scanner;
public class Problem5_45 {

	public static void main(String[] args) {
		/*
		 * (Statistics: compute mean and standard deviation) In business applications,
		 * you are often asked to compute the mean and standard deviation of data. The
		 * mean is simply the average of the numbers. The standard deviation is a statistic
		 * that tells you how tightly all the various data are clustered around the mean
		 * in a set of data. For example, what is the average age of the students in a class?
		 * How close are the ages? If all the students are the same age, the deviation is 0.
		 * Write a program that prompts the user to enter ten numbers, and displays the mean
		 * and standard deviations of these numbers using the following formula:
		 * mean = (x1 + x2 +...+xn)/n, where x1, x2, ..., xn are the numbers you input.
		 */
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter ten numbers: ");
		// Create an array that will hold the inputted numbers
		double[] numbers = new double[10];
		numbers[0] = input.nextDouble();
		numbers[1] = input.nextDouble();
		numbers[2] = input.nextDouble();
		numbers[3] = input.nextDouble();
		numbers[4] = input.nextDouble();
		numbers[5] = input.nextDouble();
		numbers[6] = input.nextDouble();
		numbers[7] = input.nextDouble();
		numbers[8] = input.nextDouble();
		numbers[9] = input.nextDouble();
		// Calculate the mean of the array
		double sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		double mean = sum / numbers.length;
		System.out.println("The mean is " + mean);
		// Find the difference between the mean and each number of the array
		double[] deviations = new double[10];
		for(int i = 0; i < deviations.length; i++) {
			deviations[i] = numbers[i] - mean ; 
		}
		// Square each of the differences
		double[] squares = new double[10];
		// getting the squares of deviations
		for(int i = 0; i < squares.length; i++) {
			squares[i] = deviations[i] * deviations[i];			
		}

		sum = 0;

		// Add all the squares of the differences
		for(int i = 0; i < squares.length; i++) {
			sum = sum + squares[i];
		}
		double result = sum / (numbers.length - 1);
		// Find the square root of all the information
		double standardDeviation = Math.sqrt(result);		
		System.out.printf("The standard deviation is " + "%.5f", standardDeviation);
	}
}


