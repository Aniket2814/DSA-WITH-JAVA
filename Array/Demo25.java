//Pascal Triangle
//LeetCode 118
//Third Type :Generate Pascal triangle
import java.util.*;
class Demo25
{
public static void main(String ar[])
{
	
	int numRows=5;
    List<List<Integer>> al=generate(numRows);
	System.out.println("The pascal triangle is = " +al);
}
 public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
       List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
         ArrayList <Integer> temp=generateRows(i);
         result.add(temp);
        
        }
     return result;
       }
       public static ArrayList<Integer> generateRows(int row)
       {
        int ans=1;
        ArrayList <Integer> al=new ArrayList<>();
        al.add(1);
        for(int col=1;col<row;col++)
        {
            ans=ans*(row-col);
            ans=ans/col;
            al.add(ans);
        }
        return al;
       }
}

