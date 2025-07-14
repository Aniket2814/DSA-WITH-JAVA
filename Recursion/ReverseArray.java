/**
 * @author Aniket Rathore
 * @Description : Reverse an Array Using Recurrsion
 * @since 14-07-25
 */

public class ReverseArray {
	/**
	 * This Function reverse array
	 * 
	 * @param nums
	 * @param l
	 * @param r
	 */
	public void reverse(int nums[], int l, int r) {
		/**
		 * Base Condition
		 */
		if (l >= r)
			return;
		/**
		 * Swapping
		 */
		int temp = nums[l];
		nums[l] = nums[r];
		nums[r] = temp;
		reverse(nums, l + 1, r - 1);
	}

	public static void main(String[] args) {

		int nums[] = { 2, 4, 3, 2, 1 };
		int n = nums.length;
		System.out.println("Array :");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		ReverseArray reversearray = new ReverseArray();
		reversearray.reverse(nums, 0, n - 1);
		System.out.println("");
		System.out.println("Reversed Array :");
		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

}
