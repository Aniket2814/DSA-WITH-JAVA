// Left rotate an array by D places
class Demo6
{
public static void main(String ar[])
{
	int x[]={1,2,3,4,5,6,7};
	int d=3;   
	int n=x.length;
  d=d%n;
	  rotate(x,0,n-d-1);
	  rotate(x,n-d,n-1);
	  rotate(x,0,n-1);
	for(int i: x)
	{
		System.out.print(" " +i);
	}
}
public static void rotate(int x[],int s,int e)
{
	int n=x.length;
	while(s<e)
	{
		int temp=x[s];
		x[s]=x[e];
		x[e]=temp;
		s++;
		e--;
	}
}

}