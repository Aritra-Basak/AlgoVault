/**
 * 
 */
package dsa_learnings.CyclicSort;

import java.util.Arrays;

/**
 * Cyclic sort is only applicable when asked to sort an array in the range 1 to N (all the consecutive numbers are present in that range)
 * @author Aritra
 *
 */
public class CyclicSort {
	
	public static void main(String[] args) {
		int [] arr= {1,3,4,5,2,7,6};
		System.out.println("Sorted Array : "+Arrays.toString(sorting(arr)));
	}
	
	public static int[] sorting(int[]arr) {
		int i=0;
		while(i<arr.length) {
			// As all consecutive numbers are present there so in an ideally sorted array the it should be number -1 = index.
			if(arr[i]-1!=i) {
				swap(arr,i,arr[i]-1);
			}else {
				i++;
			}
		}
		return arr;
	}
	
	public static void swap(int []array, int start, int end) {
		if(start!=end) {
			array[start]=array[start]^array[end];
			array[end]=array[start]^array[end];
			array[start]=array[start]^array[end];
		}
	}

}
