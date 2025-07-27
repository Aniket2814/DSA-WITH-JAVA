
import java.util.ArrayList;

/**
 * Merge Sort
 * 
 * @author Aniket Rathore
 * @since 27-07-2025
 */

public class MergeSort {
	private void mergeSort(int arr[], int low, int high) {
		/**
		 * Base Case
		 */
		if (low >= high) {
			return;
		}
		/*
		 * Divide
		 */
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		/**
		 * Merge Array
		 */
		merge(arr, low, mid, high);
	}

	private void merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>(); // temporary array
		int left = low; // starting index of left half of arr
		int right = mid + 1; // starting index of right half of arr

		// storing elements in the temporary array in a sorted manner//

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}

		// if elements on the left half are still left

		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}

		// if elements on the right half are still left
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}

		// transfering all elements from temporary to arr //
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
		int n = arr.length;
		System.out.println("Before Sorting array :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(arr, 0, n - 1);
		System.out.println();
		System.out.println("After Sorting array :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
