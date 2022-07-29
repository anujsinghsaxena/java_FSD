package Searching;

public class BinarySearchDemo {
	public static void binarySearch(int arr[], int f, int l, int key) {
		int m = (f+l)/2;
		while(f<=l) {
			if(arr[m]<key) {
				f=m+1;
			}else if(arr[m]==key) {
				System.out.println("Element found at index: "+m);
				break;
			}else {
				l=m-1;
			}
			m=(f+l)/2;
		}
		if(f>l) {
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		int arr[]= {67,87,34,56,90,26,47,85};
		int key =56;
		int l=arr.length-1;
		binarySearch(arr,0,l,key);

	}

}
