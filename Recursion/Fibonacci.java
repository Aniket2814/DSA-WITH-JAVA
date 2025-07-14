import java.util.Scanner;

/**
 * This class provides a method to calculate the Fibonacci Number of Particular
 * Index.
 * 
 * @author Aniket Rathore
 * @since 08-07-2025
 */
/**
 * 0 1 1 2 3 5 8
 */
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Position ");
		int num = sc.nextInt();
		System.out.println("Fibonacci Number at " + num + " Pos is = " + fibo(num));
	}

	public static int fibo(int num) {
		if (num == 1 || num == 0) {
			return num;

		}
		return fibo(num - 1) + fibo(num - 2);
	}
}
