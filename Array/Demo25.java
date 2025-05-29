//Pascal Triangle
//LeetCode 118
//First Type : Given row and Column tell me the Element at that Place
class Demo25
{
public static void main(String ar[])
{
    int row=5;
	int col=3;
	int ans= pascalTriangle(col,row);
	System.out.println("The element at Column = " +col+ " and Row = " +row+ " = " +ans);
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
public static int pascalTriangle(int col,int row)
{
	int element=(int)nCr(row-1,col-1);
	return element;
}
}

