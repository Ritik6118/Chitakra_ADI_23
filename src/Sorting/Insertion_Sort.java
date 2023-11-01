package Sorting;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,6,4,2,1,2,4,5,6,7,4,8};
		Insertion_Sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void Insertion_Sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int item=arr[i];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[++j]=item;
		}
	}

	

}
