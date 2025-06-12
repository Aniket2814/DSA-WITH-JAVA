// 1544. Make The String Great
import java.util.*;
class StringGreat
{
  public static void main(String ar[])
  {
	  String s="leEeetcode";
	  String ans=makeGood(s);
	  System.out.println("Great String is = " +ans);
  }  
    public static String makeGood(String s) {
      StringBuilder sb=new StringBuilder();
      for(char c:s.toCharArray())
      {
        if (
        sb.length() > 0 &&
        ((c + 32 == sb.charAt(sb.length() - 1)) || (c - 32 == sb.charAt(sb.length() - 1)))
        )
        {
            sb.deleteCharAt(sb.length()-1);
        }
        else
        {
            sb.append(c);
        }
      }  
      return sb.toString();
    }

}