//Swap alternate in an Array
import java.util.*;
class Demo12
{
public static void main(String ar[])
{
System.out.println("Enter Size of Array");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
if(size==0)
{
	System.out.println("Enter Valid Size of Array ");
	return;
}
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
 show(arr);
for(int i:arr)
{
	System.out.print(" "+i);
}

}
public static void show(int x[])
{
	int n=x.length;
	for(int i=0;i<n;i+=2)
	{
		if(i+1<n)
		{
			int t=x[i];
			x[i]=x[i+1];
			x[i+1]=t;
		}
	}
}

}