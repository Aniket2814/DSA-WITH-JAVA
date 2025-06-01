// (LeetCode 2149) Rearrange Array Elements by Sign
//Variety 1: No.of Negative and Positive are equals
class RearrangeArray
{
   public static void main(String ar[])
	{
	 int arr[]={3,1,-2,-5,2,-4};
	 int ans[]=rearrangeArray(arr);
	 System.out.println("After RearrangeArray Element by Sign");
	 for(int i:ans)
	 {
		System.out.print(" "+i);
	 }
	}
   public static int[] rearrangeArray(int[] nums)
    { 
	 int n=nums.length;
	  int pos=0;
      int neg=1;
	  int ans[]=new int[n];
      for(int i=0;i<n;i++)
		{
		if(nums[i]>0)
        {
        ans[pos]=nums[i];
         pos+=2; 
        }
        else
        {
         ans[neg]=nums[i];
         neg+=2;
        }
		}	
        return ans;		
    }
}