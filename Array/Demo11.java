import java.util.*;
class Demo11
{

    public static int missingNumber(int []a, int N) {
int f;
        for(int i=1;i<=N;i++)
		{
			f=0;
			for(int j=0;j<N-1;j++)
			{
				if(a[i]==i)
				{
					f=1;
					break;
				}
			}
		if(f==0 ) return i;
		}
		return -1;
		
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}


