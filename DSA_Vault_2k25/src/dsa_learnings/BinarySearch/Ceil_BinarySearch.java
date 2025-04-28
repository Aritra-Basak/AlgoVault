/**
 * 
 */
package dsa_learnings.BinarySearch;

/**
 * Ceil of a target element in an array is the immediate greater number than the target number or the target itself			
 * Finding the ceil of a target number in a sorted array using Binary Search
 * @author Aritra
 *
 */
public class Ceil_BinarySearch {
	
	public static int getTheCeil(int [] arr, int target) {
		 int start =0;
		 int end = arr.length-1;
		 if(target>arr[end]) {
			 return -1;
		 }
		 
		 while(start<=end) {
			 int mid = start+ (end-start)/2;
			 if(target>arr[mid])
				 start=mid+1;
			 else if(target<arr[mid])
				end=mid-1;
			 else
				return mid; // if we need to return always the greater number then remove this.
		 }
		 return start;
		 //returning the start, because at the last iteration when the condition(start<=end) gets violated while start suppressing the end, will denote the ceil.
	}
	
	public static void main(String[] args) {
		int [] arr= {2,3,5,9,14,16,17,18};
		int target=15;
		System.out.println(getTheCeil(arr,target));
		
		
	}

}
