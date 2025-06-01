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
	  int k=0,j=0;
	  int ans[]=new int[n];
	  int pos[]=new int[n/2]; 	
	  int neg[]=new int[n/2];
       for(int i:nums)
	   {
		   if(i>0)
		   {
			 pos[k++]=i;
		   }
		   else
		   {
			 neg[j++]=i;			 
		   }   
	   }
        for(int i=0;i<n/2;i++)
		{
			ans[2*i]=pos[i];
			ans[2*i+1]=neg[i];
		}	
        return ans;		
    }
}