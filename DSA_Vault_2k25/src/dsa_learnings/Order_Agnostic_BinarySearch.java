/**
 * 
 */
package dsa_learnings;

/**
 * To perform Binary Search in an order-agnostic Array i.e. Array sorting order is unkown, whether Ascending or Descending.
 * @author Aritra
 *
 */
public class Order_Agnostic_BinarySearch {
	
	private static boolean checkTheOrder(int [] arr) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		return isAsc;
	}
	
	private static int binarySearch(int [] arr,int target, boolean isAsc) {
		int start=0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target==arr[mid])
				return mid;
			if(isAsc) {
				if(target>arr[mid])
					start=mid+1;
				else
					end =mid-1;
			}else {
				if(target>arr[mid])
					end=mid-1;
				else
					start =mid+1;
			}

		}
		return -1;
	}
	
	public static void main(String[] args) {
		//int[] arr = {-1,0,3,5,7,8,11, 14, 35, 38, 42, 45};
		int[] arr = {90,65,55,45,43,42,23,12,7,5,1};
		int target =90;
		boolean isAsc = checkTheOrder(arr);
		int result = binarySearch(arr,target,isAsc);
		if(result ==-1)
			System.out.println("CANNOT LOCATE YOUR TARGET ELEMENT IN THE ARRAY ;(");
		else
			System.out.println("LOCATED YOUR TARGET ELEMENT AT INDEX: "+result+" : )");
		
		
	}

}
