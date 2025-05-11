//find Duplicate 
//Having one element in an array which are present more than one time
class Demo14
{
public static void main(String ar[])
{
	//Element in an array only valid for 1-9
	int arr[]={1,2,3,2,4};
	int duplicate=show(arr);
	
System.out.println("The Duplicate Element in an Array is=" +duplicate);
	}
	public static int show(int x[])
	{
		int ans=0;
		for(int i=0;i<x.length;i++)
		ans=ans^x[i];
	for(int i=1;i<x.length;i++)
		ans =ans^i;
	return ans;
	}

}