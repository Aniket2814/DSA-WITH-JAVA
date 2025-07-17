
import java.util.ArrayList;

/**
 * @author Aniket Rathore
 * @Description : Print all Subsequence whose Sum is Equals to k Using Recursion
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
	public void subsequence(int arr[], int n, int index, ArrayList<Integer> al, int s, int sum) {
		/**
		 * Base Condition
		 */
		if (index == n) {
			if (s == sum) {
				System.out.println(al);
			}
			return;
		}
		/*
		 * Include current Element
		 */
		al.add(arr[index]);
		s += arr[index];
		subsequence(arr, n, index + 1, al, s, sum);
		/**
		 * BackTrack and decrement current Sum
		 */
		s -= arr[index];
		al.remove(al.size() - 1);

		/**
		 * Exclude the current Element
		 */

		subsequence(arr, n, index + 1, al, s, sum);
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		int n = nums.length;
		int sum = 2;

		SubSequenceSum printSubSequence = new SubSequenceSum();
		printSubSequence.subsequence(nums, n, 0, new ArrayList<Integer>(), 0, sum);
	}
}
