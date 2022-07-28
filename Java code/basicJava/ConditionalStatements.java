//$Id$
package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
		
//		if(age>150 || age<0)
//		{
//			System.out.println("Enter a proper age");
//		}
//		else if(age>18)
//		{
//			System.out.println("Adult");
//		}
//		else {
//			System.out.println("Child");
//		}
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a valid number");

		}
		
		System.out.println("End of program");
		
	}

}
