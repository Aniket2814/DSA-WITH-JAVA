 //Maximum Product Subarray
 class Demo24
 {
 public static void main(String ar[])
 {
 	int nums[] = {1,2,-3,0,-4,-5};
	int answer = maxProductSubArray(nums);
	System.out.print("The maximum product subarray is: "+answer);
 }
 static int maxProductSubArray(int arr[]) {
	    int result=Integer.MIN_VALUE;
      int prefix=1;
      int suffix=1;
      for(int i=0;i<arr.length;i++)
      {
        if(prefix==0) prefix=1;
        if(suffix==0) suffix=1;
        prefix=prefix*arr[i];
        suffix=suffix*arr[arr.length-i-1];
        result=Math.max(result,Math.max(prefix,suffix));
      }
	   return result;
 }
 }