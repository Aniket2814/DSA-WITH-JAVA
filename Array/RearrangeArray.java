// (LeetCode 2149) Rearrange Array Elements by Sign
//Variety 2: No.of Negative and Positive are not equals
import java.util.*;
class RearrangeArray
{
   public static void main(String ar[])
	{
	 int arr[]={3,1,-2,-5,-2,-4};
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
	  ArrayList <Integer> pos=new ArrayList<>();
	  ArrayList <Integer> neg=new ArrayList<>();
	  int ans[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   if(nums[i]>0)
			 pos.add(nums[i]);
	        else
			 neg.add(nums[i]);
	   }
	   int k=0;
	   int min=Math.min(pos.size(),neg.size());
        for(int i=0;i<min;i++)
		{
			ans[k++]=pos.get(i);
			ans[k++]=neg.get(i);
		}
		  for(int i=min;i<pos.size();i++)
		  {
			  ans[k++]=pos.get(i);
		  }
	     for(int i=min;i<neg.size();i++)
		  {
			  ans[k++]=neg.get(i);
		  }
					
        return ans;		
    }
}