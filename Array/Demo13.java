//Find Unique Element in an Array
//1 number appear once and rest will appear twice
class Demo13
{
public static void main(String ar[])
{
int arr[]={3,7,2,2,7,3,4};
int unique=show(arr);
System.out.println("The Unique Element in an Array is=" +unique);
}
public static int show(int x[])
{
	int ans=0;
	for(int i:x)
	{
		ans^=i;
	}
	return ans;
}
}