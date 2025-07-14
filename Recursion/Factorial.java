
import java.util.Scanner;

/**
 * This class provides a method to calculate the factorial of a number.
 * 
 * @author Aniket Rathore
 * @since 08-07-2025
 */

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number You Want Factorial");
		int num = sc.nextInt();
		System.out.println("Factorial Of Number is = " + fact(num));
	}

	public static int fact(int num) {
		if (num == 1) {
			return 1;

		}
		return num * fact(num - 1);
	}
}
