package DSA_Vault_2k25.src.dsa_learnings.SelectionSort;

import java.util.Arrays;

/**
 * @author Aritra
 * */
public class SelectionSort {

public static void main(String[] args) {
		
		int arr[] = {1,4,2,3,9,6};
//		int arr[] = {1,2,3,4,6};
		System.out.println("Sorted Array: "+Arrays.toString(sorting(arr)));
		
	}
	
	public static int[] sorting(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			int lastIndex =arr.length-1-i; //every time the loop iterates the largest element gets sorted in it's respective position, so need to check those again.
			int maxIndex=maxIndex(arr,0,lastIndex);
			swap(arr,maxIndex,lastIndex);
		}
		
		return arr;
	}
	
	public static int maxIndex(int[] arr, int start, int last) {
		int max=start;
		for(int i =start;i<=last;i++) {
		if(arr[i]>arr[max])
			max=i;
		}
		return max;
	}
	
	public static void swap(int []arr,int maxIndex, int lastIndex) {
		 if (maxIndex != lastIndex) {  // Prevents unnecessary XOR operations
	            arr[maxIndex] = arr[maxIndex] ^ arr[lastIndex];
	            arr[lastIndex] = arr[maxIndex] ^ arr[lastIndex];
	            arr[maxIndex] = arr[maxIndex] ^ arr[lastIndex];
	        }

	}
}
