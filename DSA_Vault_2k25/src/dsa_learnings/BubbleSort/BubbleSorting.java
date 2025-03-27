/**
 * 
 */
package DSA_Vault_2k25.src.dsa_learnings.BubbleSort;

import java.util.Arrays;

/**
 * @author Aritra
 *
 */
public class BubbleSorting {
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,2,3,9,6};
//		int arr[] = {1,2,3,4,6};
		System.out.println("Sorted Array: "+Arrays.toString(sorting(arr)));
		
	}
	
	public static int[] sorting(int [] arr) {
		boolean sorted=false;
		for (int i=0;i<arr.length;i++) {
			//iterating the number of pass required to sort the full array.
			for (int j=0;j<arr.length-i-1;j++) { // arr.length-i-1 because each time of a single pass the largest element gets sorted and we don't need to iterate over that.
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
					sorted=true;
				}
			}
			if(!sorted)
				break; // to check if there is no sorting required for i=0 then the array is fully sorted...
		}
		return arr;
	}

}
