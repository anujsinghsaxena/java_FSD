package LinkedList;
import java.util.NoSuchElementException;
public class RemoveOccurence<T> {

	private Node head;
	private static class Node<T>{
		private T data;
		private Node next;
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	public void insert(T data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			 currentNode.next = newNode;
		}
	}
    public boolean remove(T key) {
    	boolean isFound = false;
    	if(head == null) {
			throw new NoSuchElementException("List is Empty!!");
		}
    	
    	if(head.data == key) {
    		head = head.next;
    		return true;
    	}
    	
		Node currentNode = head;
		Node previousNode = null;
		while(currentNode !=null) {
			if(currentNode.data == key) {
				isFound = true;
				break;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		if(currentNode == null) {
			return isFound;
		}
		currentNode = previousNode.next;
		previousNode.next = currentNode.next;
		currentNode.next = null;
		return isFound;
    }
	public void displayLinkedList() {
		Node currentNode = head;
		while(currentNode!= null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}
	public static void main(String[] args) {
		
		RemoveOccurence<Integer> linkedList = new RemoveOccurence<>();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		linkedList.insert(40);
		linkedList.insert(50);
		linkedList.insert(60);
		linkedList.insert(30);
		
		System.out.println("Original LinkedList:");
		linkedList.displayLinkedList();
		System.out.println();
		
		int key = 30;
		if (linkedList.remove(key)) {
			System.out.println("After removing the first Occurence of an Element = " + key + " LinkedList is:");
			linkedList.displayLinkedList();
		} else
			System.out.println(key + " not found in List");
	}
}