// LeetCode 1021. Remove Outermost Parentheses
import java.util.*;
class RemoveOutermost
 {
   public static void main(String ar[])
   {
    String input="(()())(())";
	String output=removeOuterParentheses(input);
	System.out.println("After Removing Outer parenthesis (Decompostion of String) : " +output);jav
   }
   public static String removeOuterParentheses(String s1) {
    StringBuilder sb=new StringBuilder();
    int cout=0;
    for(int i=0;i<s1.length();i++)
    {
     char c=s1.charAt(i);
     if(c=='(')
     {
       if(cout>0)
       {
         sb.append(c);
       }
       cout++;
     }
     else
     {  
        cout--;
        if(cout>0)
        {
          sb.append(c);  
        }     
     }
    }        
    return sb.toString();
   }
 
 }
 