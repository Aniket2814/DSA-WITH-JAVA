// LeetCode 1662. Check If Two String Arrays are Equivalent
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
    int m = word1.length;
        int n = word2.length;
        int w1i = 0, i = 0;
        int w2i = 0, j = 0;
        while (w1i < m && w2i < n) {
            if (word1[w1i].charAt(i) != word2[w2i].charAt(j))
            return false;
            i++;
            j++;
            if (i == word1[w1i].length()) {
                i = 0;
                w1i++;
            }
            if (j == word2[w2i].length()) {
                j = 0;
                w2i++;
            }
        }
        return w1i == m && w2i == n;  
    }
}	