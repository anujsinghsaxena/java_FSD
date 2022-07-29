package Sorting;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int index =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index = j;
				}
			}
			int smallNum = arr[index];
			arr[index]=arr[i];
			arr[i]=smallNum;
		}
	}
	

	public static void main(String[] args) {
		int arr1[] = {3,34,12,87,45,90,34,76,45,78,89};
		System.out.println("Before Selection Sort");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		selectionSort(arr1);
		System.out.println("After Selection Sort");
		for(int i: arr1) {
			System.out.print(i+" ");
		}

	}

}
