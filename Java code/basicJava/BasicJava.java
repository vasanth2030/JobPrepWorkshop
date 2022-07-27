package basicJava;

import java.util.Scanner;

public class BasicJava {
	public static void main(String[] args) {
		String name;
		int age= 21;
		float height=178.5f;  //(float) 178.5 --> type casting
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your name: ");
		name= sc.nextLine();
		
		System.out.println("Hello World"); //sysout
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+"cm");
		
	}
}
