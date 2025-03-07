/**
 * 
 */
package dsa_learnings;

/**
 * THere is an integer array sorted in an ascending order (with distinct values)
 * Prior to being passed to your function, the array is rotated at an unknown pivot point index k,
 * (0<=k <array.length) such that the resulting array is {array[k],array[k+1],array[k+2],...array[n-1],array[0],array[1],array[2]}.
 * For example original array was {0,1,2,4,5,6,7}
 * might be rotated at pivot index 3 and becomes {4,5,6,7,0,1,2}

 * In the array based on the Pivot element the left hand of the array is also sorted in ascending order and even the right side is also sorted in ascending order.	
 * @author Aritra
 *
 */
public class PivotArray_BinarySearch {
	
	public static void main(String [] args) {
		//
		int [] arr = {4,5,6,7,0,1,2};
		int target=0;
		System.out.println("Target element position : "+search(arr,target));
		
	}
	
	public static int search(int []arr, int target) {
		int pivot =findThePivot(arr);
		if(pivot ==-1) {
			//array is not rotated; just do normal binary search...
			return binarySearch(arr, target, 0, arr.length-1);
		}else {
			// case 1: if pivot is found then we got 2 ascending arrays.
			if(arr[pivot]==target) {
				return pivot;
			}
			//case 2: target>start element - then search space = start to pivot -1, because all number after pivot is smaller than start
			if(target>=arr[0]) {
				return binarySearch(arr,target,0,pivot-1);
			}
			//case 3: target<search element - then all elements from search till pivot is going to be greater than target, so searching space will be pivot +1 to end
			return binarySearch(arr,target,pivot+1,arr.length-1);
		}
	}
	
	public static int binarySearch(int [] arr, int target, int start, int end) {
		while(start<=end) {
			int mid =start+(end-start)/2;
			if (target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end =mid-1;
			else 
				return mid;
		}
		return -1;
	}
	
	public static int findThePivot(int [] arr) {
		int start =0;
		int end =arr.length-1;
		while(start<=end) {
			int mid =start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}else if (mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}else if (arr[mid]<=arr[start]) {
				end=mid-1; // this means that all the elements at the right hand of mid is smaller than the start, consider only if the last element is move to the first or rotated.
			}else {
				start=mid+1; //this means the mid > start then new start will be after the mid which shows that bigger number lies ahead.
			}
		}
		return -1;
		
	}
	
	
	public static int findThePivotInDuplicate(int [] arr) {
		int start =0;
		int end =arr.length-1;
		while(start<=end) {
			int mid =start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}else if (mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}else if (arr[start]==arr[mid] && arr[mid]==arr[end]) {
				//Remove the duplicates from the array
				//First check whether they are the pivot or not...
				if(arr[start]>arr[start+1]) {
					//if start is the pivot point
					return start;
				}else if(arr[end]<arr[end-1]) {
					//if end's previous value is the pivot point 
					return end-1;
				}
			}else if((arr[start]<arr[mid])|| (arr[start]==arr[mid] && arr[mid]>arr[end])){
				//this mean the left side of the array till pivot is sorted and skipping till pivot point
				start=mid+1;
			}else {
				end =mid-1;
			}
		}
		return -1;
		
	}

}
