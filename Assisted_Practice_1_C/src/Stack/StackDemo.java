package Stack;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> fruits= new Stack<>();
    fruits.push("Apple");
    fruits.push("Mango");
    fruits.push("Banana");
    fruits.push("Orange");
    System.out.println("Full Stack is: " + fruits);
    fruits.pop();
    System.out.println("Stack after pop: " + fruits);
    }
}
