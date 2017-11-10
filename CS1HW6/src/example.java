public class example {
	public static void main(String[] args) {
		System.out.println("The prime numbers less than 10000 are: ");
		int count = 0;
		for (int number = 2; number < 10000; number++) {
			if (isPrime(number)) {
				count++;

				if (count % 15 == 0) {
					System.out.printf(" %-5s\n", number);
				}
				else
					System.out.printf("%-5s ", number);
			}
		}System.out.println("\nThere are " + count + " prime numbers less than 10,000.");
	}
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
