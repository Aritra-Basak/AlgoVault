/**
 * 
 */
package dsa_learnings.BinarySearch;

/**
 * First find the peak of the mountainArray
 * Then search in the ascending part of the array. 0th index to peak element index
 * if not found in the ascending part try searching in descending part. peak element index +1 to arr.length -1
 * @author Aritra
 *
 */

public class MountainArray_SearchElement {
	
	public static void main(String [] args) {
		int [] arr = {1,3,5,7,8,9,10,11,6,4,2};
		int target =4;
		System.out.println("The target element in the mountain array is in: "+binarySearch(arr,target,findThePeakElement(arr)));
		
	}
	
	public static int findThePeakElement(int arr[]) {
		int start = 0;
		int end  = arr.length-1;
		while(start<end) {
			int mid = start+(end-start)/2;
			if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}else {
				end =mid;
			}
		}
		return start;
	}
	
	public static int binarySearch(int[] arr, int target, int peak) {
		int start=0;
		int end =peak;
		while(start<=end) {
			int mid =start+(end-start)/2;
			if(arr[mid]>target) {
				end =mid-1;
			}else if(arr[mid]<target) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		if(start>end) {
			//means target was not found in the ascending part so searching in the descending part
			start = peak+1;
			end =arr.length-1;
			while(start<=end) {
				int mid =start+(end-start)/2;
				if(arr[mid]>target) {
					start=mid+1;
				}else if(arr[mid]<target) {
					end=mid-1;
				}else {
					return mid;
				}
			}
		}
		return -1;
	}

}
