import java.util.*;
//DiagonalTraversal (LeetCsjavaode 498)
class DiagonalTraversal
{
	public static void main (String ar[])
	{
	  int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
      int ans[]=findDiagonalOrder(arr);
      
      for(int i:ans)
	  {
		 System.out.print(" " +i); 
	  }		  
		
	}
 public static int[] findDiagonalOrder(int[][] mat) {
    Map<Integer, List<Integer>> h = new HashMap<>();
  int m= mat.length;
        int n=mat[0].length;
        int index=0;
        int ans[]=new int[(m*n)];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               int key = i + j;
                if (!h.containsKey(key)) {
                    h.put(key, new ArrayList<>());
                }
                h.get(key).add(mat[i][j]);
            }
        }
         for (int key = 0; key <= m + n - 2; key++) {
            List<Integer> list = h.get(key);
            if (key % 2 == 0) {
                // Reverse order for even diagonals
                for (int i = list.size() - 1; i >= 0; i--) {
                    ans[index++] = list.get(i);
                }
            } else {
                // Normal order for odd diagonals
                for (int val : list) {
                    ans[index++] = val;
                }
            }}

        return ans;
    }
}