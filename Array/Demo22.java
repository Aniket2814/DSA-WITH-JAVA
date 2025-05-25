//Maximum Subarray (LeetCode 54)
//Kadane's Algo
class Demo22
{
public static void main(String ar[])
{
int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
System.out.println("The Maximum Subarray is  " +maxSubArray(nums));
}
 public static int maxSubArray(int[] nums) {
  //kadane's Algo
  //T(o(n))
  int max=Integer.MIN_VALUE;
  int sum=0;
  for(int i=0;i<nums.length;i++)
  {
    sum+=nums[i];
    if(sum>max)
    {
        max=sum;
    }
    if(sum<0)
    {
        sum=0;
    }
  }
  return max;
    }
}