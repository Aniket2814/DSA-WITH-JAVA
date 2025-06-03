//String Compression (LeetCode 443)
public class StringCompression {
    public static void main(String[] args) {
        char arr[] = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int index = 0;
        int i = 0;
        int n = arr.length;

        while (i < n) {
            int count = 0;
            char curr = arr[i];

            while (i < n && arr[i] == curr) {
                count++;
                i++;
            }

            arr[index] = curr;
            index++;

            if (count > 1) {
                String s = Integer.toString(count);
                for (char ch : s.toCharArray()) {
                    arr[index] = ch;
                    index++;
                }
            }
        }

        // Print compressed array
        for (int j = 0; j < index; j++) {
            System.out.print(" " + arr[j]);
        }
    }
}
