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
        Arrays.sort(nums);
        int n=nums.length-1;
        int ans=(nums[n]*nums[n-1])-(nums[0]*nums[1]);
     return ans;
    }
} 
