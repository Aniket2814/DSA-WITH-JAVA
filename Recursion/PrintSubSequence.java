
import java.util.ArrayList;

/**
 * @author Aniket Rathore
 * @Description : Print all Subsequence Using Recursion
 * 
 */
public class PrintSubSequence {
	/**
	 * This Function Prints subsequence
	 * 
	 * @param arr
	 * @param n
	 * @param index
	 * @param al
	 */
	public void subsequence(int arr[], int n, int index, ArrayList<Integer> al) {
		/**
		 * Base Condition
		 */
		if (index == n) {
			System.out.println(al);
			return;
		}
		/*
		 * Include current Element
		 */
		al.add(arr[index]);

		subsequence(arr, n, index + 1, al);
		/**
		 * BackTrack
		 */
		al.remove(al.size() - 1);
		/**
		 * Exclude the current Element
		 */

		subsequence(arr, n, index + 1, al);
	}

	public static void main(String[] args) {
		int nums[] = { 2, 1, 3 };
		int n = nums.length;
		PrintSubSequence printSubSequence = new PrintSubSequence();
		printSubSequence.subsequence(nums, n, 0, new ArrayList<Integer>());
	}
}
