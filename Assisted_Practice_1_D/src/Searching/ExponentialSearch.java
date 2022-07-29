package Searching;

public class ExponentialSearch {
	boolean expSearch(int arr[], int key) {
		int size = arr.length;
		if(arr[0]==key) {
			return true;
		}
		int i=1;
		while(i<size && arr[i]<=key) {
			i=i*2;
		}
		return binarySearch(arr,i/2,Math.min(i, size-1),key);
	}
	boolean binarySearch(int arr[], int low, int high, int key) {
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				return true;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ExponentialSearch search = new ExponentialSearch();
		int arr[]= {1,3,4,7,9,10,14,17,19,20,24,26,29};
		if(search.expSearch(arr, 20)) {
			System.out.println("Element Found");
		}
		else {
			System.out.println("Element Not Found");
		}

	}

}
