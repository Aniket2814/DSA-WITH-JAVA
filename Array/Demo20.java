//Two Sum(LeetCode : 1)
//Better
import java.util.*;
class Demo20
{
public static void main(String ar[])
{
   int nums[]={2,6,5,8,11};
   int target=14;
   int ans[]=twoSum(nums,target);
   if(ans.length!=0)
   {
	   System.out.println("Array available at index " +ans[0]+ " , " +ans[1]);
   }
   else
	   System.out.println("There is No Pairs Available");
}
 public static int[] twoSum(int[] nums, int target) {
//Brute Force
  //Better Approach
     HashMap <Integer,Integer> h=new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
        int ele=nums[i];
        int left=target-ele;
        if(h.containsKey(left))
        {
            return new int[]{h.get(left),i};
        }
         h.put(ele,i);
     }
     return new int[]{};
}
}