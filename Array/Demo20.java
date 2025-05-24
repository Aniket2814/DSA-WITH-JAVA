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
    for(int i=0;i<nums.length;i++)
    {
        for(int j=0;j<nums.length;j++)
        {
            if(i==j) continue;
            if(nums[i]+nums[j]==target)
            {
                return new int[]{i,j};
            }
        }
    }
    return new int[]{};
}
}