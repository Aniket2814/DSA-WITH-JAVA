import java.util.*;
 class Demo23
 {
 public static void main(String ar[])
 {
 int arr1[]={1,2,3,0,0,0};
 int arr2[]={2,5,6};
int m=3;
int n=3;
 int ans[]=new int[m+n];
  ans=merge(arr1,m,arr2,n);
  System.out.println("After Merging Two Arrays");
 for(int i : ans)
	 System.out.print( " " +i);
 }
  public static int [] merge(int[] nums1, int m, int[] nums2, int n)
  {
 int left=m-1;
	  int right=0;
	  int index=0;
	  while(left>=0 && right <n)
	  {
		  if(nums1[left] > nums2[right])
		  {
			  swap(nums1,left,nums2,right);
		       left--;
               right++;
		  }
		  else
		  {
            break;
		  }
		  
	  }
	Arrays.sort(nums1,0,m);
    Arrays.sort(nums2); 
     for (int i = 0; i < n; i++) {
    nums1[m + i] = nums2[i];
}
return nums1;
   }
 public static void swap(int[] nums1, int i, int[] nums2, int j) {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }

 }