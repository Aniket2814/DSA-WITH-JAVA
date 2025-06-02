//(LeetCode 345) Reverse Vowels of a String
class Revvow {
    public static void main(String ar[]) {
        String s = "IceCreAm";
        String ans = rev(s);
        System.out.println("" + ans);
    }

    public static String rev(String s) {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            while (i < j && !isVowel(arr[i])) {
                i++;
            }
            while (i < j && !isVowel(arr[j])) {
                j--;
            }

            // Swap vowels
            if (i < j) {
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
                j--;
            }
        }

        return new String(arr);
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
