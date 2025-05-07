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
int visited[]=new int[a.length];
Arrays.fill(visited,0);
for(int i =0;i<a.length;i++)
{
	for(int j=0;j<b.length;j++)
	{
		if(a[i]==b[j] && visited[j]==0)
		{      ans[k++]=a[i];
             visited[j]=1;
              break;
	}   
	if(b[j]>a[i]) break;
}}
for(int z=0;z<k;z++)
{
	System.out.println(" "+ans[z]);
}
}
}