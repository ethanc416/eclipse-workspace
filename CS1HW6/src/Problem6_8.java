public class Problem6_8 {
	public static void main(String[] args) {
		System.out.println("Celsius \t Fahrenheit\t|\tFahrenheit\tCelsius");
		double cel;
		double fahr;
		for (cel = 40.0, fahr = 120.0; cel >= 31.0 && fahr >= 30.0; cel--,fahr=fahr-10) {
			double cel2fahr = celsiusToFahrenheit(cel);
			double fahr2cel = fahrenheitToCelsius(fahr);
			System.out.printf("  %.1f\t\t %.1f\t\t|\t  %.1f  \t %.2f\t\n", cel,  cel2fahr, fahr, fahr2cel );}
	}
	/** Convert from Celsius to Fahrenheit */
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	/** Convert from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}
}