package Sorting;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,6,4,2,1,2,4,5,6,7,4,8};
		Selection_Sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void Selection_Sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++) {
			int idx=min_idx(arr,i);
			swap(arr,i,idx);
			
		}
	}

	private static void swap(int[] arr, int i, int idx) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[idx];
		arr[idx]=temp;
	}

	private static int min_idx(int[] arr, int i) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		int idx=i;
		for(;i<arr.length;i++) {
			if(arr[i]<arr[idx]) {
				idx=i;
			}
		}
		return idx;
	}
}
