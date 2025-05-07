//InterSection of two Sorted Array
import java.util.*;
class Demo10
{
public static void main(String ar[])
{
int a[]={1,2,2,3,3,4,5,6};
int b[]={2,3,3,5,6,6,7};
int k=0;
int ans[]=new int[a.length];
int i=0,j=0;
while(i<a.length&& j<b.length)
{
	if(a[i]<b[j])
	{
		i++;
	}
	else if(b[j] <a[i])
	{
		j++;
	}
	else 
	{
		ans[k++]=a[i];
		i++;
		j++;
	}
}
for(int z=0;z<k;z++)
{
	System.out.println(" "+ans[z]);
}
}
}