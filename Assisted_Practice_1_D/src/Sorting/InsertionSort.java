package Sorting;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		int size = arr.length;
		for(int j=1;j<size;j++) {
			int key =arr[j];
			int i=j-1;
			while((i>-1)&&(arr[i]>key)) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
	}

	public static void main(String[] args) {
		int arr1[]= {2,87,35,87,56,90,45,87,45,17};
		System.out.println("Before Insertion Sort");
		for(int i: arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		insertionSort(arr1);
		System.out.println("After Insertion Sort");
		for(int i: arr1) {
			System.out.print(i+ " ");
		}

	}

}
