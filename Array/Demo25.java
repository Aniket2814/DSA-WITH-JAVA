//Pascal Triangle
//LeetCode 118
//Second Type :Print any Given Row
class Demo25
{
public static void main(String ar[])
{
	
    // int row=5;
	// int col=3;
	int row=5;
    pascalTriangle(row);
	// System.out.println("The element at Column = " +col+ " and Row = " +row+ " = " +ans);
}
public static long nCr(int n,int row)
{
	long res=1;
	for(int i=0;i<row;i++)
	{
		res=res*(n-i);
		res=res/(i+1);
	}
	return res;
}
public static void pascalTriangle(int n)
{
	for(int c=1;c<=n;c++)
	{
	int element=(int)nCr(n-1,c-1);
	System.out.print(" "+element);
}}
}

