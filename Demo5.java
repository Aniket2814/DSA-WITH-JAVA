//Left Rotate the Array by One
class Demo5
{
public static void main(String ar[])
{
int x[]={1,2,3,4,5};
int temp=x[0];
for(int j=1;j<x.length;j++)
{
	x[j-1]=x[j];
}
     x[x.length-1]=temp;
	 System.out.println("Rotate Array By one Place");
	 for(int i:x)
	 {
		 System.out.print(" "+i);
	 }
}
}