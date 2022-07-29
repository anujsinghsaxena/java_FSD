package lession1;
import java.util.Scanner;
public class factorialofnumber {
	public static void main(String[] args) {
		int n;
		int fact_var = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			fact_var = fact_var *i;
		}
		System.out.println("Factorial of the number "+n+" is: " +fact_var);

	}

}
