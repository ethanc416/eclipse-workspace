
public class Problem5_40 {

	public static void main(String[] args) {
		/*
		 * (Simulation: heads or tails) Write a program
		 * that simulates flipping a coin one million
		 * times and displays the number of heads and tails.
		 */
		int heads = 1 + (int)(Math.random()*1000000);
		int tails = 1000000-heads;
		double percenttails = Math.round(tails*100.0/1000000.0);
		double percentheads = Math.round(heads*100.0/1000000.0);		

		System.out.println("The number of times a coin lands on heads out of one million flips is: " + heads);		
		System.out.println("That is roughly %" + percentheads + " of the time.");
		System.out.println("The number of times a coin lands on tails out of one million flips is: " + tails);
		System.out.println("That is roughly %" + percenttails + " of the time.");

	}

}
