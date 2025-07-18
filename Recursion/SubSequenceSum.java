
import java.util.ArrayList;

/**
 * @author Aniket Rathore
 * @Description : Count Subsequence whose Sum is Equals to k Using Recursion
 * 
 */
public class SubSequenceSum {
	/**
	 * 
	 * @param arr
	 * @param n
	 * @param index
	 * @param s     :initial Sum
	 * @param sum
	 */
	public int subsequence(int arr[], int n, int index, int s, int sum) {
		/**
		 * Base Condition
		 */
		if (index == n) {
			// condition satisfied
			if (s == sum) {
				return 1;
			}
			return 0;
		}
		/*
		 * Include current Element
		 */
		s += arr[index];
		int left = subsequence(arr, n, index + 1, s, sum);

		/**
		 * BackTrack and decrement current Sum
		 */
		s -= arr[index];

		/**
		 * Exclude the current Element
		 */

		int right = subsequence(arr, n, index + 1, s, sum);
		return left + right;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		int n = nums.length;
		int sum = 2;

		SubSequenceSum printSubSequence = new SubSequenceSum();
		System.out.println(
				"The Number of Subsequence Whose Sum is k = " + printSubSequence.subsequence(nums, n, 0, 0, sum));
	}
}
