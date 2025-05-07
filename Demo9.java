//Union of two Sorted Array
import java.util.*;
class Demo9
{
public static void main(String ar[])
{
int arr1[]={1,1,2,3,4,5};
int arr2[]={2,3,4,4,5,6};
int union[]=new int[arr1.length];
int n1=arr1.length;
int n2=arr2.length;
int i=0,j=0,k=0;
while(i<n1 && j<n2)
{
	if(arr1[i]<=arr2[j])
	{
		if(k==0 || union[k-1]!=arr1[i])
		{
			union[k++]=arr1[i];
		}
		i++;
	}
	else
	{
		if(k==0 || union[k-1]!=arr2[j])
		{
			union[k++]=arr2[j];
		}
		j++;
	}
}
while(i<n1)
{
	if(k==0 || union[k-1]!=arr1[i])
		{
			union[k++]=arr1[i];
		}
		i++;
}
while(j<n2)
{
	if(k==0|| union[k-1]!=arr2[j])
		{
			union[k++]=arr2[j];
		}
		j++;
}
for(int z=0;z<union.length;z++)
{
	System.out.print(" "+union[z]);
}
}
}