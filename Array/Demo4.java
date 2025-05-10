// Remove Duplicates from Sorted Array
class Demo4
{
public static void main(String ar[])
{
int x[]={1,1,2,3,3,4,5,5,5,6,6};
System.out.println("The Number of Unique Element in an Array is = " +removeduplicate(x));
}
public static int removeduplicate(int x[])
{
	int i=0;
	for(int j=1;j<x.length;j++)
	{
		if(x[i]!=x[j])
		{
			x[i+1]=x[j];
			i++;
		}
	}
	return i+1;
}
}