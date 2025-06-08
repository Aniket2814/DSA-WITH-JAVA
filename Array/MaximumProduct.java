// (LeetCode 1913) Maximum Product Difference Between Two Pairs
import java.util.*;
class MaximumProduct
{
public static void main(String ar[])
  {
int nums[] = {5,6,2,7,4};
int ans=maxProductDifference(nums);
System.out.println("Maximum Product of Array = " +ans);
  }
  public static int maxProductDifference(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else {
                secondLargest = Math.max(secondLargest, num);
            }
            
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else {
                secondSmallest = Math.min(secondSmallest, num);
            }
        }  
        return (largest * secondLargest) - (secondSmallest * smallest);
    }
} 
