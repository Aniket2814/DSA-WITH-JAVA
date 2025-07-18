
import java.util.ArrayList;

/**
 * @author Aniket Rathore
 * @Description : Print any Subsequence whose Sum is Equals to k Using Recursion
 * 
 */
public class SubSequenceSum {
	/**
	 * 
	 * @param arr
	 * @param n
	 * @param index
	 * @param al
	 * @param s     :initial Sum
	 * @param sum
	 */
	public boolean subsequence(int arr[], int n, int index, ArrayList<Integer> al, int s, int sum) {
		/**
		 * Base Condition
		 */
		if (index == n) {
			// condition satisfied
			if (s == sum) {
				System.out.println(al);
				return true;
			}
			return false;
		}
		/*
		 * Include current Element
		 */
		al.add(arr[index]);
		s += arr[index];
		if (subsequence(arr, n, index + 1, al, s, sum) == true) {
			return true;
		}
		/**
		 * BackTrack and decrement current Sum
		 */
		s -= arr[index];
		al.remove(al.size() - 1);

		/**
		 * Exclude the current Element
		 */

		if (subsequence(arr, n, index + 1, al, s, sum) == true) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		int n = nums.length;
		int sum = 2;

		SubSequenceSum printSubSequence = new SubSequenceSum();
		printSubSequence.subsequence(nums, n, 0, new ArrayList<Integer>(), 0, sum);
	}
}
