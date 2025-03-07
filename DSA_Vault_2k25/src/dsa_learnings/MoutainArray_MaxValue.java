/**
 * 
 */
package dsa_learnings;

/**
 * Finding the largest or the peak element in a mountain array i.e. an array whoose starting part is sorted in ascending order and the later part in descending order.
 * @author Aritra
 *
 */
public class MoutainArray_MaxValue {
	
	public static void main(String[] args) {
		
		int [] arr = {1,3,5,7,8,9,10,11,6,4,2};
		System.out.println("The largest element in the mountain array is: "+binarySearch(arr));
		
	}
	
	public static int binarySearch(int []arr) {
		int start =0;
		int end = arr.length-1;
		while(start<end) {
			int mid = start + (end-start)/2;
			if(arr[mid]<arr[mid+1]) {
				//we are in the ascending part of the array
				start=mid+1; // we are taking start = mid+1 as we know that the next element in the array is greater than the mid element, so point of making start
			}else {
				// we are in the descending part of the array.
				end =mid; // we don't know whether the previous element is greater or smaller than the mid element so we are making end = mid;
			}
		}
		//at the end start == end pointing the largest element.
		//at each step we shred down to the possible group containing the largest element.
		return start;
	}

}
