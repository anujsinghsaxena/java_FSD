package SumOfNnumbers;
import java.util.Scanner;
public class SumOfTwoRange {
public static void main(String[] args) {
	int num,i, sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Sum from: ");
	i=sc.nextInt();
	System.out.println("Sum up to: ");
	num=sc.nextInt();
	while(i<=num) {
		sum = sum+i;
		i++;
	}
	System.out.println("Sum of natural number =" +sum);
}

}