/**
 * 
 */
package dsa_learnings;

/**
 * FLoor of a target element in an array is the immediate smaller number than the target number	or the target itself		
 * Finding the floor of a target number in a sorted array using Binary Search
 * @author Aritra
 *
 */
public class Floor_BinarySearch {
	
	public static int getTheFloor(int[] arr, int target) {
		int start=0;
		int end = arr.length-1;
		
		if(target<arr[start]) {
			return -1;
		}
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target>arr[mid]) 
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
			else
				return mid; // if we need to return always the smaller number then remove this.
		}
		return end;
		//returning the end, because when the condition (start<=end) gets violated while end moving ahead of start, end will denote the floor.
	}
	
	public static void main(String [] args) {
		int [] arr= {2,3,5,9,14,16,17,18};
		int target=15;
		System.out.println(getTheFloor(arr,target));
		
	}

}
