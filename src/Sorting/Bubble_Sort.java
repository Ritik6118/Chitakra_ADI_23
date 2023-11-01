package Sorting;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,6,4,2,1,2,4,5,6,7,4,8};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubblesort(int[] arr) {
		// TODO Auto-generated method stub
		for(int pass=0;pass<arr.length-1;pass++) {
			for(int i=0;i<arr.length-pass-1;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
