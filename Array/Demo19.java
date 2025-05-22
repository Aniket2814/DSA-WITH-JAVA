//Generate Spiral Matrix
//LeetCode 59
class Demo19
{
public static void main(String ar[])
{
int n=3;
int ans[][]=generateMatrix(n);
for(int x[]:ans)
{
	for(int i:x)
	{
		System.out.print(" " +i);
	}
	System.out.println(" ");

}

}
public static int[][] generateMatrix(int n) {
		int z = 1;
		int left = 0;
		int x[][] = new int[n][n];
		int k = n * n;
		if (n == 1)
			return new int[][] { { 1 } };
		int right = n - 1;
		int top = 0;
		int bottom = n - 1;
		while (z <= k && left <= right && top <= bottom) {
			for (int i = left; i <= right; i++) {
				x[top][i] = z++;
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				x[i][right] = z++;
				;
			}
			right--;
			if (left <= right) {
				for (int i = right; i >= left; i--) {
					x[bottom][i] = z++;
				}
				bottom--;
			}
			if (top <= bottom) {
				for (int i = bottom; i >= top; i--) {
					x[i][left] = z++;
				}
				left++;
			}
		}
		return x;
	}
}