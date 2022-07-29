package Methods;

public class OverloadingMethod {

	static void add(int num1, int num2) {
	    System.out.println("You are going to add int type");
	    System.out.println("The sum of the two numbers " + num1 + " and " + num2 + " is " + (num1 + num2));
	  }
	  static void add(double num1, double num2) {
	    System.out.println("You are going to add double type");
	    System.out.println("The sum of the two numbers " + num1 + " and " + num2 + " is " + (num1 + num2));
	  }
	  public static void main(String[] args) {
	    add(5, 9);
	    add(6.3, 8.2);
	  }
	}