//Majority Element 
//LeetCode 169
import java.util.*;
class Demo21
{
public static void main(String ar[])
{
int nums = [2,2,1,1,1,2,2];
int ans=majorityElement(nums);
if(ans!=-1)
{
	System.out.println("Majority Elements is = " +ans);
}
else
	System.out.println("Majority Elements is not available");
	
}
public int majorityElement(int[] nums) {
     int n=nums.length;
     HashMap<Integer,Integer> h=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        h.put(nums[i],h.getOrDefault(nums[i],0)+1);
    }
    for(int i:h.keySet()) 
    {
      if(h.get(i)>n/2)
      {
        return i;
      }
    }  
    return -1;
    }
}