//$Id$
package basicJava;

public class JavaMethods {
	public static void main(String[] args) {
		System.out.println(sum(10,15));
		printHelloWorld();
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}
	
	public static void printHelloWorld() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello world");
		}
	}
}
