//Missing Number in an Array 
class Demo15
{
public static void main(String ar[])
{
	int x[]={1,2,4,5};
	int N=5;
	int missing =show(x,N);
	System.out.println(missing==-1?"Number is Not Missing" :" Missing Number is =" +missing);
}
public static int show(int x[],int N)
{
	int k=0;
	for(int i=1;i<=N;i++)
	{ 
     k=0;
    for(int j=0;j<x.length;j++)
    {
		if(i==x[j])
		{
			k=1;
			break;
		}
	}		
	if(k==0)
	{
      return i;		
	}	
	}
	return -1;
}
}