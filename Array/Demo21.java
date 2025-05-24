//Majority Element 
//LeetCode 169

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
     int cout=0;
     for(int i=0;i<n;i++)
     {
        cout=0;
        for(int j=0;j<n;j++)
          {
            if(nums[i]==nums[j])
            cout++;
          }  
          if(cout >n/2)
          return nums[i];
       }   
    return -1;
    }
}