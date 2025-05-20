//Sort 0's, 1's,2's
//Dutch National Flag Algorithm
class Demo17
{
public static void main(String ar[])
{
  int x[]={1,0,2,1,0,2,0,1};
  sort(x);
  for(int i :x)
	  System.out.print(" " +i);
}
  public static void sort(int[] nums) {
        int low=0;
        int n=nums.length;
        int mid=0;
        int high=n-1;
      while(mid<=high)
      {
        if(nums[mid]==0)
        {
            swap(nums,low,mid);
          low++;
          mid++;
        }
        else if(nums[mid]==1)
        {
            mid++;
        }
        else 
        {
            swap(nums,mid,high);
            high--;
        }
      }
    }
    public static void swap(int x[],int i,int j)
    {
        int temp=x[i];
        x[i]=x[j];
        x[j]=temp;
    }
}