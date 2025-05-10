// Largest Element in an Array
import java.util.*;
class Demo1
{
public static void main(String ar[])
{
int x[]={3,2,1,5,2};
int largest=x[0];
for(int i=0;i<x.length;i++)
{
	if(x[i]>largest)
	{
		largest=x[i];
	}
}
System.out.println("The Largest Element is " +largest);
}

}