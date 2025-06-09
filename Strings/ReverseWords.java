//LeetCode 151: Reverse Words in a String
class ReverseWords {
    public static void main(String[] args) {
        String s = "Java is powerful";
            s=s.trim();
      StringBuilder sb = new StringBuilder(s);
      StringBuilder result = new StringBuilder();
        int end = sb.length();
        int i = sb.length() - 1;

        while (i >= 0) {
            if (sb.charAt(i) == ' ') {
                i--;
                continue;
            }
            int j = i;
            while (i >= 0 && sb.charAt(i) != ' ') {
                i--;
            }
            result.append(sb.substring(i + 1, j + 1)).append(" ");
        }        System.out.println("Reversed: " + result);
    }
}