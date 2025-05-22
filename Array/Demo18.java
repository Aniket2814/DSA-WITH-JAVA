//Sprial Traversal in matrix
//LEETCODE 54
 import java.util.ArrayList; 
 import java.util.List; 
 public class Demo18
 { 
 public static void main(String[] args)
 { 
 int arr[][]= {{1,2,3,4,5},{6,7,8,9,10},
 {11,12,13,14,15},{16,17,18,19,20},
 {21,22,23,24,25}}; 
 
 List <Integer> al=show(arr); 
 System.out.println(al); 
 }
 public  static List<Integer>  show(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
       int right=m-1;
       int left =0;
       int top=0;
       int bottom=n-1;
   ArrayList <Integer> al=new ArrayList<>();
  while(top<=bottom && left<=right)
  {
   for(int i=left;i<=right;i++)
   {
      al.add(matrix[top][i]);
    }
    top++;
    for(int i=top;i<=bottom;i++)
    {
        al.add(matrix[i][right]);
    }
    right--;
   if(top<=bottom)
   {
    for(int i=right;i>=left;i--)
    {
        al.add(matrix[bottom][i]);
    }
    bottom--;}
    if(left<=right)
    {
    for(int i=bottom;i>=top;i--)
    {
        al.add(matrix[i][left]);
    }
    left++;
  }}
  return al;

    } }