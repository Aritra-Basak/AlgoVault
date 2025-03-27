/**
 * 
 */
package DSA_Vault_2k25.src.LeetCode2k25;

/**Given an integer array arr of size N, sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array. 
 * Example 1:
	Input Format:
	 arr = [4,5,6,7,0,1,2,3]
	Result:
	 0
	Explanation:
	 Here, the element 0 is the minimum element in the array.
	
	Example 2:
	Input Format:
	 arr = [3,4,5,1,2]
	Result:
	 1
	Explanation:
	 Here, the element 1 is the minimum element in the array.
	 
	 Pivot is the point or the highest point of the array after which the original start of the initial array lies.
 * @author Aritra
 *
 */
public class LowestPivotArrayElement {
	
	public static void main(String[] args ) {
		int []arr= {4,5,6,7,0,1,2,3};
		//pivot = 7
		System.out.println(lowestElement(arr));
	}
	
	//Time Complexity: O(logN), N = size of the given array.
	//Reason: We are basically using binary search to find the minimum. 
	//Space Complexity: O(1)
	
	public static int lowestElement(int[] arr) {
		int start =0;
		int end =arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {//we are also checking mid<end because if there may be a case/scenario that mid is = end so mid+1 will throw error.
				return arr[mid+1]; //the lowest value is the element initially at the start before being rotated.
			}else if(mid>start && arr[mid]<arr[mid-1]) {
				return arr[mid-1];
			}else if(arr[mid]<=arr[start]) {
				end=mid-1; //if my mid is in the right part of the pivot, where elements are lesser than start
			}else {
				start=mid+1;// if my mid is in the left part of the pivot, where elements are greater than end
			}
		}
		return -1;
	}

}
