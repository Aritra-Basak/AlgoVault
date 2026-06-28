/**
 * 
 */
package DSA_Vault_2k25.src.dsa_learnings.InsertionSort;

import java.util.Arrays;

/**
 * @author Aritra
 *
 */
public class InsertionSort {
	// In insertion sort we take one element and check on the left side whether it is smaller than the left side elements or not, if it is smaller, then we swap it with the left side element and keep on checking until we reach the start of the array or we find an element which is smaller than the current element.
	public static void main(String [] args) {
		int arr[] = {1,4,2,3,9,6};
//		int arr[] = {1,2,3,4,6};
		System.out.println("Sorted Array: "+Arrays.toString(sorting(arr)));
		
	}
	
	public static int[] sorting(int [] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(array[j]<array[j-1])
					swap(array,j,j-1);
				else
					break;
			}
		}
		return array;
	}
	
	public static void swap(int []array, int start, int end) {
		if(start!=end) {
			array[start]=array[start]^array[end];
			array[end]=array[start]^array[end];
			array[start]=array[start]^array[end];
		}
	}

}
