package Searching;

public class LinearSearchDemo {
	static int search(int arr[], int n, int x) {
		for(int i=0;i<n;i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {34,87,13,90,54,48,96};
		int n = arr.length;
		int x=87;
		int index = search(arr,n,x);
		if(index==-1) {
			System.out.println("Element is not present");
		}
		else {
			System.out.println("Element found at index: "+index);
		}
		
	}
}
