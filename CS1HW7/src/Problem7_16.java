public class Problem7_16 {
	public static void main(String[] args) {
		/** (Execution time) Write a program that randomly generates
		 *  an array of 100,000 integers and a key. Estimate the execution
		 *  time of invoking the linearSearch method in Listing 7.6. Sort
		 *  the array and estimate the execution time of invoking the 
		 *  binarySearch method in Listing 7.7. You can use the following
		 *  code template to obtain the execution time:
		 *  
		 *  long startTime = System.currentTimeMillis();
		 *  perform the task;
		 *  long endTime = System.currentTimeMillis();
		 *  long executionTime = endTime - startTime;
		 */
		int[] numbers = new int[100000];
		int key = (int)(Math.random() * 100000);
		for (int i = 0; i < 100000; i++) {
			numbers[i] = (int)(Math.random() * 100000);
		}
		long startTime = System.currentTimeMillis();
		int method1 = linearSearch(numbers, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Total time for the linear search: " + executionTime + ", index = " + method1);

		startTime = System.currentTimeMillis();
		Sort(numbers);
		int method2 = binarySearch(numbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Total time for the binary search: " + executionTime+ ", index = " + method2);
	}
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -low - 1;
	}
	public static void Sort (int[] list) {
		for (int i = 0; i <list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
