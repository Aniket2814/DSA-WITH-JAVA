//Second Largest Element in an Array
import java.util.*;
class Demo2
{
public static void main(String ar[])
{
int x[]={1,2,4,7,7,5};
int n=x.length;

int largest=x[0];
int secondlargest=-1;
for(int i=0;i<n;i++)
{
	if(x[i]>largest)
	{
		secondlargest=largest;
		largest=x[i];
	}
	else if(x[i]>secondlargest && x[i]<largest)
	{
		secondlargest=x[i];
	}
}
System.out.println("The Second Largest Element is " +secondlargest);
}

}