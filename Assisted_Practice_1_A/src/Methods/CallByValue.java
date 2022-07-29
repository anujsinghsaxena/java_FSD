package Methods;

public class CallByValue {
	  static void add(int num1, int num2) {
	    System.out.println("The sum of the two numbers " +num1 + " and " + num2 + " is " + (num1 + num2));
	  }
	  public static void main(String[] args) {
	    add(45, 30);
	  }
	}
