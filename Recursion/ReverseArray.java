
/**
 * @author Aniket Rathore
 * @Description : Reverse an Array Using Recurrsion
 * 
 */

public class ReverseArray {
	/**
	 * This Function reverse array
	 * 
	 * @param nums
	 * @param l
	 * @param r
	 */
	public void reverse(int nums[], int i) {
		/**
		 * Base Condition
		 */
		int n = nums.length;
		if (i >= n / 2)
			return;
		/**
		 * Swapping
		 */
		int temp = nums[i];
		nums[i] = nums[n - i - 1];
		nums[n - i - 1] = temp;
		reverse(nums, i + 1);
	}

	public static void main(String[] args) {

		int nums[] = { 2, 4, 3, 2, 1 };
		int n = nums.length;
		System.out.println("Array :");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		ReverseArray reversearray = new ReverseArray();
		reversearray.reverse(nums, 0);
		System.out.println("");
		System.out.println("Reversed Array :");
		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

}
