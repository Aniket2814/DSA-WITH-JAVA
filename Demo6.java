// Left rotate an array by D places
class Demo6
{
public static void main(String ar[])
{
	int x[]={1,2,3,4,5,6,7};
	int d=3;   
	  rotate(x,d);
	for(int i: x)
	{
		System.out.print(" " +i);
	}
}
public static void rotate(int x[],int d)
{
	int n=x.length;
	d=d%n;
	int temp[]=new int[d];
	for(int i=0;i<d;i++)
	{
		temp[i]=x[i];
	}
	for(int i=d;i<n;i++)
	{
		x[i-d]=x[i];
	}
	for(int i=n-d;i<n;i++)
	{
		x[i]=temp[i-(n-d)];
		// j++;
	}
}

}