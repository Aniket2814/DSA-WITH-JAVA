//Linear Search
class Demo8
{
public static void main(String ar[])
{
int arr[]={1,2,38,5,4};
int target=5;
int ans;
System.out.println(show(arr,target)==-1? "Element is not presented" :"Element is Presented at "+show(arr,target));
}
public static int show(int x[],int n)
{
	for(int i=0;i<x.length;i++)
	{
		if(x[i]==n)
		{
			return i;
		}
	}
	return -1;
}
}