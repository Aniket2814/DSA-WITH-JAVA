// 1662. Check If Two String Arrays are Equivalent
class StringEquivalent
{
	public static void main(String ar[])
	{
	String word1 []= {"ab", "c"};
    String word2 []= {"a", "bc"};
	boolean b=arrayStringsAreEqual(word1,word2);
    if (b == true) {
    System.out.println("Both are Equal");
     } else {
    System.out.println("Both are not Equal");
    }  
    }   
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();

     for (String s : word1) {
      s1.append(s);
      }
        for (String s : word2) {
            s2.append(s);
        }

        return s1.toString().equals(s2.toString());   
    }
}	