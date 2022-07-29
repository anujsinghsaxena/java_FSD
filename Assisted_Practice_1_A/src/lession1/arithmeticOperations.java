package lession1;
import java.util.Scanner;

public class arithmeticOperations {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		b = sc.nextInt();
		System.out.println("Arithmetic Operations is:");
		System.out.println("Addition of two numbers is:"+(a + b));
		System.out.println("Subtraction of two numbers is:"+(a - b));
		System.out.println("multiplication of two numbers is:"+(a * b));
		

	}

}
