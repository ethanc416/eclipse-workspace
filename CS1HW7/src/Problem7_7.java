public class Problem7_7 {
	public static void main(String[] args) {
		/** (Count single digits) Write a program that generates 100 random
		 *  integers between 0 and 9 and displays the count for each number.
		 *  (Hint: Use an array of ten integers, says counts, to store the
		 *  counts for the number of 0s, 1s, ..., 9s.)
		 */
		int[] num = new int[10];
		for (int i = 1; i<=100; i++) {
			int count = (int)(Math.random()*10);
			num[count]++;
		}
		printArr(num);
	}
	private static void printArr(int[] arr){
		for(int j = 0, size = arr.length; j < size; j++ ){
			System.out.println(j + " occured " + arr[j] + " times in the set.");
		}
	}
}