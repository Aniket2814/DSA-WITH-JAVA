//Union of two Sorted Array
import java.util.*;
class Demo9
{
public static void main(String ar[])
{
int arr1[]={1,1,2,3,4,5};
int arr2[]={2,3,4,4,5,6};
int union[]=new int[arr1.length];
HashSet <Integer> h =new HashSet<>();
for(int i:arr1)
	h.add(i);
for(int i:arr2)
	h.add(i);
int k=0;
for(Integer i:h)
{
	union[k++]=i;
}
for(int i=0;i<union.length;i++)
{
	System.out.print(" "+union[i]);
}
}
}