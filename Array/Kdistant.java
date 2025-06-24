/**
 * 2200. Find All K-Distant Indices in an Array
 */
import java.util.*;

public class Kdistant {
	public static void main(String[] args) {
		int nums[] = { 3, 4, 9, 1, 3, 9, 5 };
		int key = 9;
		int k = 1;

		List<Integer> ans = findKDistantIndices(nums, key, k);
		System.out.println(ans);

	}

	public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
		int n = nums.length;
		List<Integer> al = new ArrayList<>();
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == key) {
				int start = Math.max(j - k, 0);
				int end = Math.min(j + k, n - 1);
				if (!al.isEmpty() && al.get(al.size() - 1) >= start) {
					start = al.get(al.size() - 1) + 1;
				}
				for (int i = start; i <= end; i++) {
					al.add(i);
				}

			}
		}
		return al;
	}

}
