//Second Largest Element in an Array
import java.util.*;
class Demo2
{
public static void main(String ar[])
{
int x[]={1,2,4,7,7,5};
int n=x.length;
Arrays.sort(x);
int largest=x[n-1];
int secondlargest=-1;
for(int i=n-2;i>=0;i--)
{
	if(x[i]!=largest)
	{
		secondlargest=x[i];
		break;
	}
}
System.out.println("The Second Largest Element is " +secondlargest);
}

}