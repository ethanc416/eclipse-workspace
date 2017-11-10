import java.util.Scanner;
public class Problem7_21 {
	public static void main(String[] args) {
		/** (Game: bean machine) The bean machine, 
		 * also known as a quincunx or the Galton
		 * box, is a device for statistics experiments 
		 * named after English scientist Sir Francis Galton. 
		 * It consists of an upright board with evenly 
		 * spaced nails (or pegs)
		 * in a triangular form. 
		 * 
		 * Balls are dropped from the opening of the board. 
		 * Every time a ball hits a nail, it has a 50% chance of 
		 * falling to the left 
		 * or to the right. 
		 * The piles of balls are accumulated in the 
		 * slots at the bottom of the board.
		 * Write a program that simulates the bean machine. 
		 * Your program should prompt
		 * the user to enter the number of the balls 
		 * and the number of the slots in the machine.
		 * Simulate the falling of each ball by printing its path. 
		 * For example, the path for the ball
		 * in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
		 * RLRRLRR. Display the final buildup of the balls in the slots in a histogram. 
		 * 
		 * Here is a sample run of the program:
		 * Enter the number of balls to drop: 5
		 * Enter the number of slots in the bean machine: 8
		 * LRLRLRR
		 * RRLLLRR
		 * LLRLLRR
		 * RRLLLLL
		 * LRLRRLR
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		int numBalls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int numSlots = input.nextInt();
		int[] slots = new int[numSlots + 1];
		for (int i = 0; i < numBalls; i++) {
			int total = 0;
			for (int j = 0; j < numSlots; j++) {
				int leftOrRight = (int) (Math.random() * 2);
				total += leftOrRight;
				if (leftOrRight == 0)
					System.out.print("|R");
				else
					System.out.print("|L");
			}
			slots[total]++;
			System.out.println();
		}
		String[] ball = new String[numSlots + 1];
		for (int x = numBalls; x > 0; x--) {
			for (int y = 0; y <= numSlots; y++) {
				if (x == slots[y]) {
					ball[y] = "|0";
					slots[y]--;
				} else
					ball[y] = "| ";
				System.out.print(ball[y]);
			}
			System.out.println();
		}
	
	}

}