import java.util.Scanner;

/**
 * This class provides a method to calculate the pow of a number to another.
 * 
 * @author Aniket Rathore
 * @since 08-07-2025
 */

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		double num1 = sc.nextDouble();
		System.out.println("Enter Second Number");
		double num2 = sc.nextDouble();
		System.out.println("Power Of " + num1 + "^" + num2 + " is = " + pow(num1, num2));
         sc.close();
	}

	public static double pow(double num1, double num2) {
		if (num2 == 0) {
			return 1;

		}
		  if (num2 < 0)
            return 1 / pow(num1, -num2);
		return num1 * pow(num1, num2 - 1);
	}
}
