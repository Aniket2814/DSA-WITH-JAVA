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
    Stack <Character > st=new Stack<>();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s1.length();i++)
    {
     char c=s1.charAt(i);
     if(c=='(')
     {
        if(st.size()>0)
        {
          sb.append(c);  
        }
        st.push(c);
     }
     else
     {
        st.pop();
        if(st.size()>0)
        {
          sb.append(c);  
        }
         
     }
    }        
    return sb.toString();
        
   }
 
 }
 