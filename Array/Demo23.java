 class Demo23
 {
 public static void main(String ar[])
 {
 int arr1[]={1,3,5,7};
 int arr2[]={0,2,6,8,9};
 int n=arr2.length;
 int m=arr1.length;
 int ans[]=new int[m+n];
  ans=merge(arr1,m,arr2,n);
  System.out.println("After Merging Two Arrays");
 for(int i : ans)
	 System.out.print( " " +i);
 }
  public static int [] merge(int[] nums1, int m, int[] nums2, int n)
  {
	  int left=0;
	  int right=0;
	  int arr[]=new int[m+n];
	  int index=0;
	  while(left<m && right <n)
	  {
		  if(nums1[left] <= nums2[right])
		  {
			  arr[index]=nums1[left];
		       index++;
			   left++;
		  }
		  else
		  {
			  arr[index]=nums2[right];
			  index++;
			  right++;
		  }
		  
	  }
	  while(left<m)
	  {
		  arr[index++] =nums1[left++];
	  }
	  while(right<n)
	  {
		  arr[index++] =nums2[right++];
	  }
	  
	  return arr;
	  
  }
 }