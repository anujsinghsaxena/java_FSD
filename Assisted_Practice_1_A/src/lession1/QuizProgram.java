package lession1;
import java.util.Scanner;
public class QuizProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Who is the prime minister of india?");
			System.out.println("1.Manmohan Singh\n2.Charan Singh\n3. Indra Gandhi\n4. Narendra Modi\n5. Exit");
	        System.out.println("Enter your Choice(1/2/3/4/5)");
	        n = sc.nextInt();
	        if(n==4) {
	        	System.out.println("Congratulations ! you have passed the Quiz");
	        	break;
	        }
	        else if(n==5) {
	        	break;
	        }
	        else {
	        	System.out.println("Wrong Choice try again");
	        }
		}

	}

}
