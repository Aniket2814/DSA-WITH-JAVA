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
   public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
    //Shell sort
     int len=n+m;
     int gap=(len/2) +(len%2);
      while(gap>0)
        {
         int left=0;
         int right=left+gap;
       while(right<len)
        {
        if(left<m && right>=m)
         {
          swap(nums1,left,nums2,right-m);
         }
         else if(left>=m)
          {
           swap(nums2,left-m,nums2,right-m);
          }
          else
          {
           swap(nums1,left,nums1,right);
           }
           left++;
           right++;
          }  
          if(gap==1) break;
          gap=(gap/2)+(gap%2);
           } 
           for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
           }
		   return nums1;
           }
   
 public static void swap(int[] nums1, int i, int[] nums2, int j) {
        if(nums1[i]>nums2[j])
        { 
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }}
     }
    
 