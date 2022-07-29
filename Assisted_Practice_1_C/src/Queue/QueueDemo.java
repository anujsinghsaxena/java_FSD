package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {

  public static void main(String[] args) {
    Queue<Integer> numbers = new LinkedList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    System.out.println("Queue After Insertion: " + numbers);
    int removedNumber = numbers.remove();
    System.out.println("Removed Element is: " + removedNumber);
    System.out.println("Queue after deletion: " + numbers);
    }
}
