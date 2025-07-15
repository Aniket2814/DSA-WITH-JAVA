
import java.util.Scanner;

/**
 * @author Aniket Rathore
 * @Description : Check String is Palimdrome or Not Using Recurrsion
 * 
 */

public class PalindromeString {
	/**
	 * Function Check Whether String is Palimdromic or not
	 * 
	 * @param s
	 * @param i
	 * @return
	 */
	public boolean check(String s, int i) {
		int n = s.length();
		if (i >= n / 2) {
			return true;
		}
		if (s.charAt(i) != s.charAt(n - i - 1)) {
			return false;
		}
		return check(s, i + 1);
	}

	public static void main(String[] args) {
		/**
		 * Taking Input
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String input = scanner.nextLine();
		PalindromeString palimdromeString = new PalindromeString();
		boolean b = palimdromeString.check(input, 0);
		if (b) {
			System.out.println("String " + input + " is Palimdromic");
		} else {
			System.out.println("String " + input + " is Not Palimdromic");
		}

	}
}
