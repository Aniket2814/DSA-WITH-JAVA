//Majority Element 
//LeetCode 169
import java.util.*;
class Demo21
{
public static void main(String ar[])
{
int nums[] = {2,2,1,1,1,2,2};
int ans=majorityElement(nums);
if(ans!=-1)
{
	System.out.println("Majority Elements is = " +ans);
}
else
	System.out.println("Majority Elements is not available");
	
}
public static int majorityElement(int[] nums) {
       int n =nums.length;
    int ele=0;
    int cout=0;
    for(int i=0;i<n;i++)
    {
      if(cout==0)
      {
        cout=1;
        ele=nums[i];
      }
      else if(ele==nums[i])
      {
        cout++;
      }
      else
      cout--;
    }
    int cout1=0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]==ele)
        cout1++;
    }
    if(cout1>n/2)
    return ele;
    return -1;
    }
}