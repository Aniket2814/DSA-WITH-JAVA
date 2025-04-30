// Check if the array is sorted
class Demo3
{
public static void main(String ar[])
{
int x[]={1,2,1,3,4};
boolean b=true;
for(int i=1;i<x.length;i++)
{
	if(x[i]>=x[i-1])
	{
		
	}
	else
	{
		b=false;
	}
}
System.out.println(b==true ? "Array is Sorted " :"Array is unsorted");
}
}