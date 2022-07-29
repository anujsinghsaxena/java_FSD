package Sorting;

public class BubbleSort {
	static void bubbleSort(int arr[]) {
		int size = arr.length;
		int temp =0;
		for(int i=0;i<size;i++) {
			for(int j=1;j<(size-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {3,6,9,10,34,76,34,78,56,96,35,56};
		System.out.println("Array Before Bubble Sort");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array After Bubble Sort");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
