import java.util.*;
class LargestPerimeter
{
	public static void main(String ar[])
	{
		int arr[]={2,1,3,4};
		System.out.println("Largest Perimeter of  Triangle is = " +largestPerimeter(arr));
		
	}
	
	public static int largestPerimeter(int[] nums) {
    
    Arrays.sort(nums);
     int n=nums.length;
    for(int i=n-3;i>=0;i--)
    {
        if(nums[i]+nums[i+1]>nums[i+2])
        return nums[i]+nums[i+1]+nums[i+2];
    }
    return 0;
    }
	
}