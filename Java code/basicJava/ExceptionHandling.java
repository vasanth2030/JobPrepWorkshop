//$Id$
package basicJava;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Start of program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		try {
			div(a, b);
		} catch (ArithmeticException e) {
			System.out.println("Inside catch");
		}
		
		// try {
		// int div= a/b;
		// System.out.println(div);
		// }
		// catch(ArithmeticException e)
		// {
		// System.out.println("Inside catch block");
		// }
		// finally {
		// System.out.println("Inside finally");
		// System.out.println("Finally block is always executed");
		// }

		// throw new ArithmeticException("Manually thrown exception");

		System.out.println("End of program");

	}

	public static void div(int a, int b) throws ArithmeticException {
		int div = a / b;
		System.out.println(div);
	}

}
