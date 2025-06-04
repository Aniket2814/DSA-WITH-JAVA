 //Check if the Sentence Is Pangram(LeetCode 1832)
 class Pangram
 {
	 public static void main(String ar[])
	 {
		String sentence="thequickbrownfoxjumpsoverthelazydog";
		Boolean b=checkIfPangram(sentence);
		if(b)
		System.out.println("String is Pangram ");
		else
		System.out.println("String is not Pangram");
	 }
	 public static boolean checkIfPangram(String s) {
        int arr[]=new int[26];
         int cout=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int index=c-'a';
            if(arr[index]==0)
            {
            arr[index]++;
            cout++;
            }
        }
        if(cout==26) return true;
         return false;
    }
 }