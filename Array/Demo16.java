//Move Zero's To the End
class Demo16
{
public static void main(String ar[])
{
	int x[]={0,1,1,0,0,0,1,1,0,0,0};
	int j=-1;
	for(int i=0;i<x.length;i++)
	{
		if(x[i]==0)
		{
			j=i;
			break;
		}
	}
	for(int i=j+1;i<x.length-1;i++)
	{
		if(x[i]!=0)
		{
			int temp=x[j];
			x[j]=x[i];
			x[i]=temp;
		j++;
		}
	}
	
	for(int i:x)
	{
		System.out.print(" "+i);
	}
	
}

}