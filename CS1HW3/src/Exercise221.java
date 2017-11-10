import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise221 {

	public static void main(String[] args) {
		// Write a program that calculates future investment value
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double amount = input.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage: ");
		double rate = input.nextDouble();
		
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		double result = Math.pow((1+((rate/100)/12)), (years*12));
		
		double value = (amount * result);
		
		DecimalFormat f = new DecimalFormat("##.00");
		
		
		System.out.println("Accumulated value is $" + f.format(value));

	}

}
